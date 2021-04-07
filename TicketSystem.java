/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author User
 */
public class TicketSystem {
    private Concert Concert;
    private String type;
    private int quantity;
    private int total;

    public TicketSystem(Concert Concert, String type, int quantity,int total) {
        this.Concert = Concert;
        this.type = type;
        this.quantity = quantity;
        this.total = total;
    }

    @Override
    public String toString() {
        return "TicketSystem{" + "Concert=" + Concert + ", type=" + type + ", quantity=" + quantity + ", total=" + total + '}';
    }

   
    

  
    
    
}
