/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.OrdersBo;
import lk.ijse.pos.bo.custom.impl.OrdersBoImpl;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrdersFormController {

 
    
    OrdersBo impl = (OrdersBo) BOFactory.getInstance().getBo(BOFactory.BoTypes.ORDERS);

     public List<CustomerDTO> getAllCustomers() throws Exception{
        return impl.getAllCustomers();
    }

    public List<CustomerDTO> getCustName(String val) throws Exception {
        return impl.getCustomerName(val);
    }

    public List<CollectionDTO> getFoodnames() throws Exception {
        return impl.getAllFoods();
    }

    public List<CollectionDTO> getFoodPrice(String val) throws Exception {
        return impl.getFoodPrice(val);
    }
   
    public String getOrderID() throws Exception{
       return impl.getOrderID();
    }

    public boolean uploadData(OrdersDTO o1)throws Exception{
        return impl.uploadData(o1);
    }

      
}
