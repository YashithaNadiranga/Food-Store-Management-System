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
import lk.ijse.pos.dao.custom.CollectionDAO;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CollectionDAOImpl implements CollectionDAO{
    
    @Override
    public boolean uploadData(Collection c1) throws SQLException, ClassNotFoundException {
        String sql = "Insert into collections values(?,?,?)";
        return CrudUtill.executeUpdate(sql, c1.getFid(),c1.getFname(),c1.getFprice());
    }

    @Override
    public boolean updateData(Collection c1) throws SQLException, ClassNotFoundException {
        String sql = "update collections set food_name = ?, food_price = ? where food_id = ?";
        return CrudUtill.executeUpdate(sql, c1.getFname(),c1.getFprice(),c1.getFid());
    }

    @Override
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        String sql = "delete from collections where food_id =?";
        return CrudUtill.executeUpdate(sql,fid );
    }

    @Override
    public List<Collection> getAll() throws SQLException, ClassNotFoundException {
        String sql = "Select * from collections order by food_id ASC";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Collection>tempList = new ArrayList<>();
        while (rst.next()) {
            tempList.add(new Collection(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return tempList;
    }

    @Override
    public List<Collection> getSearch(String s) throws SQLException, ClassNotFoundException {
        String sql = "Select * from collections where food_id Like '%"+s+"%'";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Collection>tempList = new ArrayList<>();
        while (rst.next()) {
            tempList.add(new Collection(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return tempList;
    }

    @Override
    public List<Collection> getFoodPrice(String name) throws Exception {
        String sql = "Select * from collections where food_name = '"+name+"'";
        ResultSet rst = CrudUtill.executeQuery(sql);
        List<Collection>tempList = new ArrayList<>();
        while (rst.next()) {
            tempList.add(new Collection(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return tempList;
    }

   
    
}
