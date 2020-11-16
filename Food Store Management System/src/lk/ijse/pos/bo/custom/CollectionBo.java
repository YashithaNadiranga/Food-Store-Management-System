/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom;

import java.sql.SQLException;
import java.util.List;
import lk.ijse.pos.bo.SuperBo;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface CollectionBo extends SuperBo{
    public boolean uploadData(CollectionDTO c1) throws SQLException, ClassNotFoundException;
    public boolean updateData(CollectionDTO c1) throws SQLException, ClassNotFoundException;
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException;
    public List<CollectionDTO> getAll() throws SQLException, ClassNotFoundException;
    public List<CollectionDTO> getSearch(String s) throws SQLException, ClassNotFoundException;

}
