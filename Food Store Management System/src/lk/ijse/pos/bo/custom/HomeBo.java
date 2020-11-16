/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom;

import java.util.ArrayList;
import lk.ijse.pos.bo.SuperBo;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface HomeBo extends SuperBo{
    public ArrayList<OrdersDTO> getOrders() throws Exception;
}
