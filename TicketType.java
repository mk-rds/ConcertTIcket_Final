package FinalAssignment;

import java.util.Scanner;

public class TicketType {

    private int CAT1, CAT2, CAT3, CAT4, CAT5;
    private static int ticketPrice;
    public static int total=0;
    private static int seatA,seatB,seatC,seatD,seatE;
    
    

    public TicketType(){
        
    }
    
    public TicketType(int CAT1, int CAT2, int CAT3, int CAT4, int CAT5) {
        this.CAT1 = CAT1;
        this.CAT2 = CAT2;
        this.CAT3 = CAT3;
        this.CAT4 = CAT4;
        this.CAT5 = CAT5;
    }
    
    public TicketType(int total,int option){
        this.total = total;
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

    public int getCAT3() {
        return CAT3;
    }

    public void setCAT3(int CAT3) {
        this.CAT3 = CAT3;
    }

    public int getCAT4() {
        return CAT4;
    }

    public void setCAT4(int CAT4) {
        this.CAT4 = CAT4;
    }

    public int getCAT5() {
        return CAT5;
    }

    public void setCAT5(int CAT5) {
        this.CAT5 = CAT5;
    }

    @Override
    public String toString() {
        return " [1] CAT 1 " + CAT1 + " stocks left\n                                                  [2] CAT 2 " + CAT2 + 
               " stocks left\n                                                  [3] CAT 3 " + CAT3 + " stocks left\n                                                  [4] CAT 4 " + CAT4 + 
               " stocks left\n                                                  [5] CAT 5 " + CAT5 + " stocks left";
    }

    public static int TicketStock(TicketType[] a, int quantity, int option,int choice) {

    if(choice == 1){
        
            if (option == 1 && a[0].CAT1 - quantity >= 0) {
                a[0].CAT1 -= quantity;
                ticketPrice = 900;
                total = ticketPrice * quantity;
            } 
            else if (option == 2  && a[0].CAT2 - quantity >= 0) {
                a[0].CAT2 -= quantity;
                ticketPrice = 800;
                total = ticketPrice * quantity;            
            }            
            else if (option == 3  && a[0].CAT3 - quantity >= 0) {
                a[0].CAT3 -= quantity;
                ticketPrice = 700;
                total = ticketPrice * quantity;
            }           
            else if (option == 4 && a[0].CAT4 - quantity >= 0) {
                a[0].CAT4 -= quantity;
                ticketPrice = 600;
                total = ticketPrice * quantity;
            }             
            else if (option == 5  && a[0].CAT5 - quantity >= 0) {
                a[0].CAT5 -= quantity;
                ticketPrice = 500;
                total = ticketPrice * quantity;
            }             
            else if (option > 5) {
                System.out.println("\n\n\t\t\t\t\tINVALID OPTION SELECTED, PLEASE START OVER AND CHOOSE CAREFULLY");
            }            
            else {
                System.out.print("\n\t\t\t\t     SOLD OUT! TICKETS PURCHASED EXCEEDS TICKETS AVAILABLE!!! TRY AGAIN!");
            }
           
                    }
        
                
    
    else if(choice == 2){
      
            if (option == 1 && a[1].CAT1 - quantity >= 0) {
                a[1].CAT1 -= quantity;
                ticketPrice = 900;
                total = ticketPrice * quantity;
            } 
            else if (option == 2  && a[1].CAT2 - quantity >= 0) {
                a[1].CAT2 -= quantity;
                ticketPrice = 800;
                total = ticketPrice * quantity;            
            }            
            else if (option == 3  && a[1].CAT3 - quantity >= 0) {
                a[1].CAT3 -= quantity;
                ticketPrice = 700;
                total = ticketPrice * quantity;
            }           
            else if (option == 4 && a[1].CAT4 - quantity >= 0) {
                a[1].CAT4 -= quantity;
                ticketPrice = 600;
                total = ticketPrice * quantity;
            }             
            else if (option == 5  && a[1].CAT5 - quantity >= 0) {
                a[1].CAT5 -= quantity;
                ticketPrice = 500;
                total = ticketPrice * quantity;
            }            
            else {
                System.out.print("the stock is not sufficient or you didnt type in quantity\n");
            }
                                                }
        
                        
        
        
        return total;
    }
    
    public static void printReceipt(int option,Concert Concert,int quantity){
                        
        System.out.println();
        System.out.println("                                    ----------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t RECEIPT\n");
        System.out.println("\t\t\t\t\tConcert Name\t\t: " + Concert.getConName());
        System.out.println("\t\t\t\t\tArtist\t\t\t: " + Concert.getConArtist());
        System.out.println("\t\t\t\t\tTime\t\t\t: " + Concert.getConTime());
        System.out.println("\t\t\t\t\tDestination\t\t: " + Concert.getConDest());
       

        
        switch (option) {
            case 1:
                System.out.print("\t\t\t\t\tType\t\t\t: CAT 1" );
                System.out.print("\n\t\t\t\t\tSeat\t\t\t: ");
                for(int i=0;i<quantity;i++){
                if(i%5 ==0){
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t  " +"A" + seatA++ + " ");
                }
                else{
                System.out.print("A" + seatA++ + " ");
                }
                } 
                break;
            case 2:
                System.out.print("\t\t\t\t\tType\t\t\t: CAT 2" );
                System.out.print("\n\t\t\t\t\tSeat\t\t\t: ");
                for(int i=0;i<quantity;i++){
                if(i%5 ==0){
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t  " +"B" + seatB++ + " ");
                }
                else{
                System.out.print("B" + seatB++ + " ");
                }
                } 
                break;
            case 3:
                System.out.print("\t\t\t\t\tType\t\t\t: CAT 3" );
                System.out.print("\n\t\t\t\t\tSeat\t\t\t: ");
                for(int i=0;i<quantity;i++){
                if(i%5 ==0){
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t  " +"C" + seatC++ + " ");
                }
                else{
                System.out.print("C" + seatC++ + " ");
                }
                } 
                break;
            case 4:
                System.out.print("\t\t\t\t\tType\t\t\t: CAT 4" );
                System.out.print("\n\t\t\t\t\tSeat\t\t\t: ");
                for(int i=0;i<quantity;i++){
                if(i%5 ==0){
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t  " +"D" + seatD++ + " ");
                }
                else{
                System.out.print("D" + seatD++ + " ");
                }
                } 
                break;
            case 5:
                System.out.print("\t\t\t\t\tType\t\t\t: CAT 5" );
                System.out.print("\n\t\t\t\t\tSeat\t\t\t: ");
                for(int i=0;i<quantity;i++){
                if(i%5 ==0){
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t  " +"E" + seatE++ + " ");
                }
                else{
                System.out.print("E" + seatE++ + " ");
                }
                } 
                break;
            default:
                break;
        }
        
        System.out.println("\n\n\t\t\t\t\tTickets Purchased\t: " + quantity);
        System.out.println("                                    ----------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tTOTAL PAYMENT\t: RM " +  total);
        
    }

    
        

        
    

}

    
        

        
    


