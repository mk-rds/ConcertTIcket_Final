/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import demo.BlackPink;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestDemo {

    public static void main(String[] args) {

        int choice,selection,option,quantity,total=0;
        
        Register.login();
     
        Concert[] ConcertArr = new Concert[5];
        TicketType[] ticket = {new TicketType(50,60,70,80,90)};
        ConcertArr[0] = new BlackPink("BLACKPINK Concert for NEW ALBUM RELEASE", "7 MARCH 2021", "KPOP SENSATION BLACKPINK RETURNS", "BUKIT JALIL STADIUM", "BLACKPINK", ticket[0]);
        
        
        
        
        
        do{
            System.out.println("\n\n[1] BLACKPINK" + "\n[2] JAY CHOU" + "\n[3] TAYLOR SWIFT");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
        
            switch (choice) {
                case 1:
                            System.out.print(ConcertArr[0]);
                            
                        do{
                            System.out.println("\n\n\nPress [1] to buy ticket " + "\nPress [2] to display the song list for this concert");
                            selection = input.nextInt();
                            
                           switch(selection){
                               
                               case 1:
                                        
                                        System.out.print("Select ticket type:");
                                        option = input.nextInt();
                                        System.out.print("How many tickets do you wish to purchase ");
                                        quantity = input.nextInt();                                       
                                        TicketType.TicketStock(ticket, quantity, option,choice);
                                        TicketType.printReceipt(option,ConcertArr[0],quantity); 
                                                                     
                                                                          
                                        break;                                                                            
                         
                               case 2 :        
                                        printElement(ConcertArr);
                                        System.out.println("Press any key to go back to previous page ");
                                        String goBack = input.next();
                                        System.out.print(ConcertArr[0]);
                                        break;
                                        
                            }        
                                        
                        }while(selection != 1);
                                    
                                        
                             
                         
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;

            }
            
            
            
                                        
        }while(choice != 3);
        
        
    }

    public static void printElement(Concert[] a) {

        System.out.print(((BlackPink) a[0]).printSongList());
    }
    
    public static void printElements1(Concert[] a){
        
        
        System.out.print(((BlackPink)a[0]).toString());
       
        
        
    }

}


