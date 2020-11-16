/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo;

import lk.ijse.pos.bo.custom.CollectionBo;
import lk.ijse.pos.bo.custom.impl.CollectionBoImpl;
import lk.ijse.pos.bo.custom.impl.CustomerBoImpl;
import lk.ijse.pos.bo.custom.impl.HomeBoImpl;
import lk.ijse.pos.bo.custom.impl.OrdersBoImpl;
import lk.ijse.pos.bo.custom.impl.UpdateBoImpl;

/**
 *
 * @author Yashitha Nadiranga
 */
public class BOFactory {
    
    private static BOFactory bOFactory;
    private BOFactory(){
        
    }
    
    public static BOFactory getInstance(){
        return (bOFactory==null)?(bOFactory= new BOFactory()):bOFactory;
    }
    public enum BoTypes{
        COLLECTION, CUSTOMER,HOME,ORDERS,UPDATE
    }
    
    public SuperBo getBo(BoTypes types){
        switch(types){
            case COLLECTION:
                return new CollectionBoImpl();
            case CUSTOMER:
               return new CustomerBoImpl();
            case HOME:
                return new HomeBoImpl();
            case ORDERS:
                return new OrdersBoImpl();
            case UPDATE:
                return new UpdateBoImpl();
            default :
                return null;    
        }
    } 
}
