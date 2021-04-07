/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Demo2 {

   
    public static void main(String[] args) {
        
         
        ticketSystem[] ticketSystem = {new ticketSystem("CAT1",100,500),
                                       new ticketSystem("CAT2",100,600)};
        
        Concert BlackPink = new Concert();
         BlackPink.setConName("BlackPink");
         BlackPink.setConTime("1 March 2021");
        
        Record[] Record = new Record[1];
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<Record.length;i++){
           
         
            System.out.print("Name:   ");
            String name = input.nextLine();

            System.out.print("password: ");
            String password = input.nextLine();
            
            User User = new User(name,password);
            
            for (int j = 1; j < ticketSystem.length + 1; j++) {
                System.out.println("Option" + j + ticketSystem[j - 1]);
            }
            
            int option;
            option = input.nextInt();
            
            Concert Concert = new Concert(BlackPink.getConName(),BlackPink.getConTime(),ticketSystem[option-1]);
            
             
            Record[i] = new Record(User,Concert);
            
            
            
        }
        
        for (int i = 0; i < Record.length; i++) {
            
            System.out.println(Record[i]);
        }
        
        
    }
    
}
