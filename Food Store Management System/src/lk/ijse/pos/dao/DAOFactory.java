/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dao;

import lk.ijse.pos.dao.custom.impl.CollectionDAOImpl;
import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.dao.custom.impl.OrderDetailsDAOImpl;
import lk.ijse.pos.dao.custom.impl.OrdersDAOImpl;

/**
 *
 * @author Yashitha Nadiranga
 */
public class DAOFactory {
    
    private static DAOFactory dAOFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        return (dAOFactory==null)?(dAOFactory= new DAOFactory()):dAOFactory;
    }
    
    public enum DAOTypes{
        COLLECTION,CUSTOMER,ORDERS,ORDERDETAILS
    }
    
    public SuperDAO getDAO(DAOTypes types){
        switch(types){
            case COLLECTION:
                return new CollectionDAOImpl();
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ORDERS:
                return new OrdersDAOImpl();
            case ORDERDETAILS:
                return new OrderDetailsDAOImpl();
            default :
                return null;
        }
    }
    
    
    
}
