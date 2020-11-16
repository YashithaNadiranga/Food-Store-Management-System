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
public class Collection {
    private String fid;
    private String fname;
    private String fprice;

    public Collection() {
    }

    public Collection(String fid, String fname, String fprice) {
        this.fid = fid;
        this.fname = fname;
        this.fprice = fprice;
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
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the fprice
     */
    public String getFprice() {
        return fprice;
    }

    /**
     * @param fprice the fprice to set
     */
    public void setFprice(String fprice) {
        this.fprice = fprice;
    }

    @Override
    public String toString() {
        return "CollectionEntity{" + "fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + '}';
    }
    
    
}
