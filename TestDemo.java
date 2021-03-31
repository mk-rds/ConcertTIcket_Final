/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


import static demo.TicketType.CalcTicketPrice;
import static demo.TicketType.TicketStockBP;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestDemo {
    
    public static void main(String[] args){
        Concert[] ConcertArr = new Concert[5];
        TicketType[] ticket = {new TicketType(10,20)};
        ConcertArr[0] = new BlackPink("BlackPink Concert","7 march 2021",ticket[0]);
        Scanner input = new Scanner(System.in);
        System.out.print(ConcertArr[0]);
        int choose;
        printElement(ConcertArr);
        
        do{
        System.out.print("CHOOSE ONE" );
        choose = input.nextInt();
        System.out.print("select ticket type:");
        int option = input.nextInt();
        System.out.print("how many u want ");
        int quantity = input.nextInt();
        TicketStockBP(ticket,quantity,option);
        System.out.print("\ntotal: " + CalcTicketPrice(ticket,quantity,option));
        }while(choose!=2);
        
        
      
    }

    public static void printElement(Concert[] a){
       
        System.out.print(((BlackPink)a[0]).printSongList());
    }

    
    
    
}
