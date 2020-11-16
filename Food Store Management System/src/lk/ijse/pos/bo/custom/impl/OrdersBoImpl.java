/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.bo.custom.OrdersBo;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.CollectionDAO;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dao.custom.OrderDetailsDAO;
import lk.ijse.pos.dao.custom.OrdersDAO;
import lk.ijse.pos.dao.custom.impl.CollectionDAOImpl;
import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.dao.custom.impl.OrderDetailsDAOImpl;
import lk.ijse.pos.dao.custom.impl.OrdersDAOImpl;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.OrderDetailDTO;
import lk.ijse.pos.dto.OrdersDTO;
import lk.ijse.pos.entity.Collection;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.OrderDetails;
import lk.ijse.pos.entity.Orders;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrdersBoImpl implements OrdersBo{

    CustomerDAO impl = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    CollectionDAO impl2 = (CollectionDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COLLECTION);
    OrdersDAO impl3 = (OrdersDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
    OrderDetailsDAO impl4 = (OrderDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAILS);
    
    @Override
    public List<CustomerDTO> getAllCustomers() throws Exception {
        List<Customer> all = impl.getAll();
        List<CustomerDTO> list = new ArrayList<>();
        for (Customer customer : all) {
            list.add(new CustomerDTO(customer.getTp(), customer.getName()));
        }
        return list;
    }

    @Override
    public List<CustomerDTO> getCustomerName(String s) throws Exception {
        List<Customer> all = impl.getSearch(s);
        List<CustomerDTO> list = new ArrayList<>();
        for (Customer customer : all) {
            list.add(new CustomerDTO(customer.getTp(), customer.getName()));
        }
        return list;
    }

    @Override
    public List<CollectionDTO> getAllFoods() throws Exception {
        List<Collection> all = impl2.getAll();
        List<CollectionDTO> list = new ArrayList<>();
        for (Collection collection : all) {
            list.add(new CollectionDTO(collection.getFid(),collection.getFname(),collection.getFprice()));
        }
        return list;
    }

    @Override
    public List<CollectionDTO> getFoodPrice(String name) throws Exception {
        List<Collection> all = impl2.getFoodPrice(name);
        List<CollectionDTO> list = new ArrayList<>();
        for (Collection collection : all) {
            list.add(new CollectionDTO(collection.getFid(),collection.getFname(),collection.getFprice()));
        }
        return list;
    }

    @Override
    public String getOrderID() throws Exception {
        return impl3.getOrderID();
    }

    @Override
    public boolean uploadData(OrdersDTO o1) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        
        Orders o =new Orders(
                o1.getOrderid(), 
                o1.getCtp(), 
                o1.getMethod(), 
                o1.getPlaceDT(), 
                o1.getPickDT(),
                o1.getTotal(),
                o1.getStatus() 
                
        );
        
        boolean add = impl3.uploadData(o);
        if (add) {
            for (OrderDetailDTO od : o1.getOrderDetails()) {
                OrderDetails orderdetail = new OrderDetails(
                        o1.getOrderid(),
                        od.getFid(),
                        od.getUnitp(),
                        od.getQty(),
                        od.getTotal()
                );
                
                boolean add1 = impl4.uploadData(orderdetail);
                if (!add1) {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;
                }
            }
            connection.commit();
            connection.setAutoCommit(true);
            return true;
        }
        connection.rollback();
        connection.setAutoCommit(true);
        return false;
    }
    
}
