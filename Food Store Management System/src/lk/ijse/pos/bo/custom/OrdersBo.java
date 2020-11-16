/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom;

import java.util.List;
import lk.ijse.pos.bo.SuperBo;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface OrdersBo extends SuperBo{
    public List<CustomerDTO> getAllCustomers() throws Exception;
    public List<CustomerDTO> getCustomerName(String s) throws Exception;
    public List<CollectionDTO> getAllFoods() throws Exception;
    public List<CollectionDTO> getFoodPrice(String name) throws Exception;
   public  String getOrderID() throws Exception;
   public boolean uploadData(OrdersDTO o1) throws Exception;
    
}
