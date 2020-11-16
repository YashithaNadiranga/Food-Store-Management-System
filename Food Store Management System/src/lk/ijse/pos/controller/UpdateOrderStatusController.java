/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.UpdateBo;
import lk.ijse.pos.bo.custom.impl.UpdateBoImpl;

/**
 *
 * @author Yashitha Nadiranga
 */
public class UpdateOrderStatusController {
    
    UpdateBo impl = (UpdateBo) BOFactory.getInstance().getBo(BOFactory.BoTypes.UPDATE);
    
    public boolean updateStatus(String text, String toString) throws Exception {
        return impl.updateData(text, toString);
    }
    
}
