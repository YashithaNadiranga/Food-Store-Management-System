/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.ArrayList;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.HomeBo;
import lk.ijse.pos.bo.custom.impl.HomeBoImpl;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public class HomeFormController {
    
    HomeBo impl = (HomeBo) BOFactory.getInstance().getBo(BOFactory.BoTypes.HOME);

    public ArrayList<OrdersDTO> getOrders() throws Exception{
       return impl.getOrders();
    }
    
}
