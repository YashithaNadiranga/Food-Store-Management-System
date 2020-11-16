/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dto;

import java.util.ArrayList;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrdersDTO {
    private String orderid;
    private String ctp;
    private String method;
    private String placeDT;
    private String pickDT;
    private String total;
    private String status;
    private ArrayList<OrderDetailDTO> orderDetails = new ArrayList();

    public OrdersDTO() {
    }

    public OrdersDTO(String orderid, String ctp, String method, String placeDT, String pickDT, String total, String status) {
        this.orderid = orderid;
        this.ctp = ctp;
        this.method = method;
        this.placeDT = placeDT;
        this.pickDT = pickDT;
        this.total = total;
        this.status = status;
    }
    
    
    /**
     * @return the orderid
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * @param orderid the orderid to set
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * @return the ctp
     */
    public String getCtp() {
        return ctp;
    }

    /**
     * @param ctp the ctp to set
     */
    public void setCtp(String ctp) {
        this.ctp = ctp;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the placeDT
     */
    public String getPlaceDT() {
        return placeDT;
    }

    /**
     * @param placeDT the placeDT to set
     */
    public void setPlaceDT(String placeDT) {
        this.placeDT = placeDT;
    }

    /**
     * @return the pickDT
     */
    public String getPickDT() {
        return pickDT;
    }

    /**
     * @param pickDT the pickDT to set
     */
    public void setPickDT(String pickDT) {
        this.pickDT = pickDT;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<OrderDetailDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetailDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" + "orderid=" + orderid + ", ctp=" + ctp + ", method=" + method + ", placeDT=" + placeDT + ", pickDT=" + pickDT + ", total=" + total + ", status=" + status + '}';
    }
    
    

   
    
    
    
    
    
}
