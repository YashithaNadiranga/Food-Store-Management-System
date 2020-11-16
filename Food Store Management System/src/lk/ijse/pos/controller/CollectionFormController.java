/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.sql.SQLException;
import java.util.List;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.CollectionBo;
import lk.ijse.pos.bo.custom.impl.CollectionBoImpl;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CollectionFormController {
    
    CollectionBo impl = (CollectionBo) BOFactory.getInstance().getBo(BOFactory.BoTypes.COLLECTION);
    
    public boolean uploadData(CollectionDTO c1) throws SQLException, ClassNotFoundException {
        return impl.uploadData(c1);
    }

    public boolean updateData(CollectionDTO c1) throws SQLException, ClassNotFoundException {
        return impl.updateData(c1);
    }

    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        return impl.DeleteData(fid);
    }

    public List<CollectionDTO> getAll() throws SQLException, ClassNotFoundException {
        return impl.getAll();
    }

    public List<CollectionDTO> getSearch(String s) throws SQLException, ClassNotFoundException {
        return impl.getSearch(s);
    }
    
}
