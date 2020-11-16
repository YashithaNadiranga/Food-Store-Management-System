/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao;

import java.sql.SQLException;
import java.util.List;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface CrudDAO<T,ID> extends SuperDAO{
   
    public boolean uploadData(T c1) throws SQLException, ClassNotFoundException;
    public boolean updateData(T c1) throws SQLException, ClassNotFoundException;
    public boolean DeleteData(ID fid) throws SQLException, ClassNotFoundException;
    public List<T> getAll() throws SQLException, ClassNotFoundException;
    public List <T>getSearch(ID s) throws SQLException, ClassNotFoundException;
}
