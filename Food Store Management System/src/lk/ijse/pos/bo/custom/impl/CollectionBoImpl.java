/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.bo.custom.CollectionBo;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.CollectionDAO;
import lk.ijse.pos.dao.custom.impl.CollectionDAOImpl;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CollectionBoImpl implements CollectionBo{

    CollectionDAO impl = (CollectionDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COLLECTION);
    
    @Override
    public boolean uploadData(CollectionDTO c1) throws SQLException, ClassNotFoundException {
        return impl.uploadData(new Collection(c1.getFid(), c1.getFname(), c1.getFprice()));
    }

    @Override
    public boolean updateData(CollectionDTO c1) throws SQLException, ClassNotFoundException {
        return impl.updateData(new Collection(c1.getFid(), c1.getFname(), c1.getFprice()));
    }

    @Override
    public boolean DeleteData(String fid) throws SQLException, ClassNotFoundException {
        return impl.DeleteData(fid);
    }

    @Override
    public List<CollectionDTO> getAll() throws SQLException, ClassNotFoundException {
       List<Collection>  all = impl.getAll();
       List<CollectionDTO> list = new ArrayList();
        for (Collection collection : all) {
            list.add(new CollectionDTO(collection.getFid(), collection.getFname(), collection.getFprice()));
        }
        return list;
    }

    @Override
    public List <CollectionDTO> getSearch(String s) throws SQLException, ClassNotFoundException {
        List<Collection>  all = impl.getSearch(s);
       List<CollectionDTO> list = new ArrayList();
        for (Collection collection : all) {
            list.add(new CollectionDTO(collection.getFid(), collection.getFname(), collection.getFprice()));
        }
        return list;
    }
    
}
