/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.entity;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrderDetails {
    private String oid;
    private String fid;
    private String unitp;
    private String qty;
    private String total;

    public OrderDetails() {
    }

    public OrderDetails(String oid, String fid, String unitp, String qty, String total) {
        this.oid = oid;
        this.fid = fid;
        this.unitp = unitp;
        this.qty = qty;
        this.total = total;
    }
    
    

    /**
     * @return the oid
     */
    public String getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * @return the fid
     */
    public String getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(String fid) {
        this.fid = fid;
    }

    /**
     * @return the unitp
     */
    public String getUnitp() {
        return unitp;
    }

    /**
     * @param unitp the unitp to set
     */
    public void setUnitp(String unitp) {
        this.unitp = unitp;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
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

    @Override
    public String toString() {
        return "OrderDetails{" + "oid=" + oid + ", fid=" + fid + ", unitp=" + unitp + ", qty=" + qty + ", total=" + total + '}';
    }
    
    
}
