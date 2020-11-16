/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.CrudDAO;
import lk.ijse.pos.entity.Orders;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface OrdersDAO extends CrudDAO<Orders, String>{
    public  String getOrderID() throws Exception;
    public  boolean updateData(String id,String status) throws Exception;
}
