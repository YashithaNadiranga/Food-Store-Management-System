/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dto;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CustomerDTO {
    
    private String tp;
    private String name;

    public CustomerDTO() {
    }

    public CustomerDTO(String tp, String name) {
        this.tp = tp;
        this.name = name;
    }
    

    /**
     * @return the tp
     */
    public String getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(String tp) {
        this.tp = tp;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "tp=" + tp + ", name=" + name + '}';
    }
    
    
}
