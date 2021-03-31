/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAssignment;


public class TicketType {
    private int CAT1;
    private int CAT2;
    private static int ticketPrice;
    private static int total;

    public TicketType(int CAT1, int CAT2) {
        this.CAT1 = CAT1;
        this.CAT2 = CAT2;
    }

    public int getCAT1() {
        return CAT1;
    }

    public void setCAT1(int CAT1) {
        this.CAT1 = CAT1;
    }

    public int getCAT2() {
        return CAT2;
    }

    public void setCAT2(int CAT2) {
        this.CAT2 = CAT2;
    }

    @Override
    public String toString() {
        return "TicketType " + "CAT 1 = " + CAT1 + ", CAT 2 = " + CAT2 ;
    }
    
    public static void  TicketStockBP(TicketType[] a,int quantity,int option){
        
        for(int i=0;i<=a.length-1;i++){
            
            if(option == 1 && a[i].CAT1 >= 0 && quantity > 0){
                a[i].CAT1 -= quantity;
                
            }
            else if(option == 2  && a[i].CAT2 >= 0 && quantity > 0){
                a[i].CAT2 -= quantity;
                
            }
            
            else
                System.out.print("Quantity not specified or we have run out of stock, sorry for the inconvenience!");
            
                }
        
        
        System.out.print("CAT 1 : " + a[0].CAT1);
        System.out.print("\nCAT 2 : " + a[0].CAT2);
       
        
    }
    
    public static int CalcTicketPrice(TicketType[] a,int quantity,int option){
        
        for(int i=0;i<=a.length-1;i++){
            
            if(option ==1 && a[i].CAT1 >= 0 && quantity > 0){
                ticketPrice = 900;
                total = ticketPrice*quantity;
            }
            
            else if (option ==2 && a[i].CAT2 >= 0 && quantity > 0){
                ticketPrice = 800;
                total = ticketPrice*quantity;
            }
            
            else
                  System.out.print("User input error");
        }
        
        return total;
    }
    
    
    
    
   
}
