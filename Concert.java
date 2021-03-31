/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAssignment;


/**
 *
 * @author Gigabyte
 */
public class Concert {

    private String conName;
    private String conTime;
    private String conDesc;
    private String conDest;
    private String conArtist;

    public Concert() {

    }

    public Concert(String conName, String conTime, String conDesc, String conDest, String conArtist) {
        this.conName = conName;
        this.conTime = conTime;
        this.conDesc = conDesc;
        this.conDest = conDest;
        this.conArtist = conArtist;
    }

    public Concert(String conName){
        this.conName = conName;
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

    public String getConDesc() {
        return conDesc;
    }

    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }

    public String getConDest() {
        return conDest;
    }

    public void setConDest(String conDest) {
        this.conDest = conDest;
    }

    public String getConArtist() {
        return conArtist;
    }

    public void setConArtist(String conArtist) {
        this.conArtist = conArtist;
    }


    @Override
    public String toString() {
        return "\nConcert Name : " + conName + "\nConcert Artist : " + conArtist + "\nConcert Time: " + conTime + "\nConcert Destination : " + conDest + "\nConcert Description : "
                + conDesc;
    }

} 

