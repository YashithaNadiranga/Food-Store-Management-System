/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.bo.custom;

import java.util.List;
import lk.ijse.pos.bo.SuperBo;
import lk.ijse.pos.dto.CustomerDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public interface CustomerBo extends SuperBo{
    public boolean sendData(CustomerDTO cust) throws Exception;
    public boolean updateData(CustomerDTO cust) throws Exception;
    public boolean deleteData(String id) throws Exception;
    public List<CustomerDTO> getData() throws Exception;
    public List<CustomerDTO> getSearchData(String tp) throws Exception;
}
