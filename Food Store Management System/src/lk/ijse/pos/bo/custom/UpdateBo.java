/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.SuperBo;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface UpdateBo extends SuperBo{
    public boolean updateData(String id,String status) throws Exception;
}
