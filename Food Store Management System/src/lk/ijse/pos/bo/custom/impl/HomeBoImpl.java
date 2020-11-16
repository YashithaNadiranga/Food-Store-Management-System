/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom.impl;

import java.util.ArrayList;
import lk.ijse.pos.bo.custom.HomeBo;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.OrdersDAO;
import lk.ijse.pos.dao.custom.impl.OrdersDAOImpl;
import lk.ijse.pos.dto.OrdersDTO;
import lk.ijse.pos.entity.Orders;

/**
 *
 * @author Yashitha Nadiranga
 */
public class HomeBoImpl implements HomeBo{
        
    OrdersDAO impl = (OrdersDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
    @Override
    public ArrayList<OrdersDTO> getOrders() throws Exception {
        ArrayList<Orders> tl = (ArrayList<Orders>) impl.getAll();
        ArrayList<OrdersDTO> list = new ArrayList();
        
        for (Orders o : tl) {
            list.add(new OrdersDTO(
                    o.getOrderid(), 
                    o.getCtp(), 
                    o.getMethod(), 
                    o.getPlaceDT(), 
                    o.getPickDT(), 
                    o.getTotal(), 
                    o.getStatus()
            ));
        }
        return list;

    }
    
}
