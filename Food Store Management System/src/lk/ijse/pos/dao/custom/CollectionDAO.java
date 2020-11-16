/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao.custom;

import java.util.List;
import lk.ijse.pos.dao.CrudDAO;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.entity.Collection;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface CollectionDAO extends CrudDAO<Collection, String>{
    public List<Collection> getFoodPrice(String name) throws Exception ;
}
