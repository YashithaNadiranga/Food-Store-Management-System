/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao.custom.impl;

import java.sql.SQLException;
import java.util.List;
import lk.ijse.pos.dao.CrudUtill;
import lk.ijse.pos.dao.custom.OrderDetailsDAO;
import lk.ijse.pos.entity.OrderDetails;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrderDetailsDAOImpl implements OrderDetailsDAO{

    @Override
    public boolean uploadData(OrderDetails c1) throws SQLException, ClassNotFoundException {
       return CrudUtill.executeUpdate(
                "INSERT INTO orderdetails VALUES(?,?,?,?,?)",
                c1.getOid(),
                c1.getFid(),
                c1.getUnitp(),
                c1.getQty(),
                c1.getTotal()
        );
    }

    @Override
    public boolean updateData(OrderDetails c1) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderDetails> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderDetails> getSearch(String s) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
