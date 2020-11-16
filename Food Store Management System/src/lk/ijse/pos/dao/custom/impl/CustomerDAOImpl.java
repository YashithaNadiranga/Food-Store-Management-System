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
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean uploadData(Customer c1) throws SQLException, ClassNotFoundException {
        String sql = "insert into customer values(?,?)";
        return CrudUtill.executeUpdate(sql, c1.getTp(),c1.getName());
    }

    @Override
    public boolean updateData(Customer c1) throws SQLException, ClassNotFoundException {
        String sql = "update customer set cname =? where ctp =?";
        return CrudUtill.executeUpdate(sql, c1.getName(),c1.getTp());
    }

    @Override
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        String sql = "delete from customer where ctp =?";
        return CrudUtill.executeUpdate(sql, fid);
    }

    @Override
    public List<Customer> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from customer";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Customer> templList = new ArrayList<>();
        while(rst.next()){
            templList.add(new Customer(rst.getString(1), rst.getString(2)));
        }
        return templList;
    }

    @Override
    public List<Customer> getSearch(String s) throws SQLException, ClassNotFoundException {
        String sql = "select * from customer where ctp like '%"+s+"%'";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Customer> templList = new ArrayList<>();
        while(rst.next()){
            templList.add(new Customer(rst.getString(1), rst.getString(2)));
        }
        return templList;
    }
    
}
