/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.UpdateBo;
import lk.ijse.pos.dao.custom.impl.OrdersDAOImpl;

/**
 *
 * @author Yashitha Nadiranga
 */
public class UpdateBoImpl implements UpdateBo{

    OrdersDAOImpl impl = new OrdersDAOImpl();
    @Override
    public boolean updateData(String id, String status) throws Exception {
        return impl.updateData(id, status);
    }
    
}
