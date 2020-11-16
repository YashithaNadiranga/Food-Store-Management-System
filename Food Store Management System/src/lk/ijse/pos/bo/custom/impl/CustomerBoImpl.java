/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.bo.custom.CustomerBo;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.entity.Customer;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CustomerBoImpl implements CustomerBo{
    
    CustomerDAO impl = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    @Override
    public boolean sendData(CustomerDTO cust) throws Exception {
        return impl.uploadData(new Customer(cust.getTp(), cust.getName()));
    }

    @Override
    public boolean updateData(CustomerDTO cust) throws Exception {
        return impl.updateData(new Customer(cust.getTp(), cust.getName()));
    }

    @Override
    public boolean deleteData(String id) throws Exception {
        return impl.DeleteData(id);
    }

    @Override
    public List<CustomerDTO> getData() throws Exception {
        List<Customer> all = impl.getAll();
        List <CustomerDTO> list = new ArrayList();
        for (Customer customer : all) {
            list.add(new CustomerDTO(customer.getTp(), customer.getName()));
        }
        return list;
    }

    @Override
    public List<CustomerDTO> getSearchData(String tp) throws Exception {
        List<Customer> search = impl.getSearch(tp);
        List <CustomerDTO> list = new ArrayList();
        for (Customer customer : search) {
            list.add(new CustomerDTO(customer.getTp(), customer.getName()));
        }
        return list;
    }
    
}
