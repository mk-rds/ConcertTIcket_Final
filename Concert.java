/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author User
 */
public class Concert {
    private String conName;
    private String conTime;
    
    
    public Concert(){
        
    }

    public Concert(String conName, String conTime) {
        this.conName = conName;
        this.conTime = conTime;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConTime() {
        return conTime;
    }

    public void setConTime(String conTime) {
        this.conTime = conTime;
    }

    @Override
    public String toString() {
        return "Concert{" + "conName=" + conName + ", conTime=" + conTime + '}';
    }
    
   
    
}
