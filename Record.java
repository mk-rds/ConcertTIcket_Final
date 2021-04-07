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
public class Record {
    private user user;
    private TicketSystem TicketSystem;

    public Record(user user,TicketSystem TicketSystem) {
        this.user = user;
        this.TicketSystem = TicketSystem;
    }

    @Override
    public String toString() {
        return "Record{" + "user=" + user + ", TicketSystem=" + TicketSystem + '}';
    }

    
    
    
}
