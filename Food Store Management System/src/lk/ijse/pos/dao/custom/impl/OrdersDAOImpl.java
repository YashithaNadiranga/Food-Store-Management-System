/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao.custom.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.dao.CrudUtill;
import lk.ijse.pos.dao.custom.OrdersDAO;
import lk.ijse.pos.entity.Collection;
import lk.ijse.pos.entity.OrderDetails;
import lk.ijse.pos.entity.Orders;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrdersDAOImpl implements OrdersDAO{

    @Override
    public boolean uploadData(Orders c1) throws SQLException, ClassNotFoundException {
        String sql = "insert into orders values(?,?,?,?,?,?,?)";
        return CrudUtill.executeUpdate(sql, c1.getOrderid(),c1.getCtp(),c1.getMethod(),c1.getPlaceDT(),c1.getPickDT(),c1.getTotal(),c1.getStatus());
    }

    @Override
    public boolean updateData(Orders c1) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> getAll() throws SQLException, ClassNotFoundException {
        String sql = "Select * from orders order by pickup_date_time ASC";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Orders>tempList = new ArrayList<>();
        while (rst.next()) {
            tempList.add(new Orders(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
        }
        return tempList;
    }

    @Override
    public List<Orders> getSearch(String s) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getOrderID() throws Exception {
        String sql = "Select order_id from orders order by order_id desc limit 1";
        ResultSet rst = CrudUtill.executeQuery(sql);
        while (rst.next()) {            
            return rst.getString(1);
        }
            return "0";
    }

    @Override
    public boolean updateData(String id, String status) throws Exception {
        String sql = "update orders  set status = ? where order_id=?";
        return CrudUtill.executeUpdate(sql, status,id);
    }
    
}
