/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.util.List;
import lk.ijse.pos.bo.BOFactory;
import lk.ijse.pos.bo.custom.CustomerBo;
import lk.ijse.pos.bo.custom.impl.CustomerBoImpl;
import lk.ijse.pos.dto.CustomerDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CustomerFormController {
     
    CustomerBo impl = (CustomerBo) BOFactory.getInstance().getBo(BOFactory.BoTypes.CUSTOMER);
    
    public boolean sendData(CustomerDTO cust) throws Exception {
        return impl.sendData(cust);
    }

    public boolean updateData(CustomerDTO cust) throws Exception {
        return impl.updateData(cust);
    }

    public boolean deleteData(String id) throws Exception {
        return impl.deleteData(id);
    }

    public List<CustomerDTO> getData() throws Exception {
        return impl.getData();
    }

    public List<CustomerDTO> getSearchData(String tp) throws Exception {
        return impl.getSearchData(tp);
    }

    
}
