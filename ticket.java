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
 public class ticket{
    private int CAT1, CAT2, CAT3, CAT4, CAT5;
    private static int ticketPrice;
    public static int total=0;
    private static int seatA,seatB,seatC,seatD,seatE;
  

    public ticket(){
        
    }
    
    public ticket(int CAT1, int CAT2, int CAT3, int CAT4, int CAT5) {
        this.CAT1 = CAT1;
        this.CAT2 = CAT2;
        this.CAT3 = CAT3;
        this.CAT4 = CAT4;
        this.CAT5 = CAT5;
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
        return "\nTicketType{" + "\nCAT1=" + CAT1 + "\nCAT2=" + CAT2 + "\nCAT3=" + CAT3 + "\nCAT4=" + CAT4 + "\nCAT5=" + CAT5 + '}';
    }
    
    
public void TicketStock(ticket[] a, int quantity, int option,int choice) {
        
       
    if(choice == 1){
        
            if (option == 1 && a[0].CAT1 - quantity >= 0) {
                a[0].CAT1 -= quantity;
                
            } 
            else if (option == 2  && a[0].CAT2 - quantity >= 0) {
                a[0].CAT2 -= quantity;
                       
            }            
            else if (option == 3  && a[0].CAT3 - quantity >= 0) {
                a[0].CAT3 -= quantity;
                
               
            }           
            else if (option == 4 && a[0].CAT4 - quantity >= 0) {
                a[0].CAT4 -= quantity;
               
            }             
            else if (option == 5  && a[0].CAT5 - quantity >= 0) {
                a[0].CAT5 -= quantity;
                
            }            
            else {
                System.out.print("insufficient");
                
            }
           
                    }
        
                
    
    else if(choice == 2){
      
            if (option == 1 && a[1].CAT1 - quantity >= 0) {
                a[1].CAT1 -= quantity;
                
            } 
            else if (option == 2  && a[1].CAT2 - quantity >= 0) {
                a[1].CAT2 -= quantity;
                          
            }            
            else if (option == 3  && a[1].CAT3 - quantity >= 0) {
                a[1].CAT3 -= quantity;
               
            }           
            else if (option == 4 && a[1].CAT4 - quantity >= 0) {
                a[1].CAT4 -= quantity;
                
            }             
            else if (option == 5  && a[1].CAT5 - quantity >= 0) {
                a[1].CAT5 -= quantity;
                
            }            
            else {
                System.out.print("the stock is not sufficient or you didnt type in quantity\n");
            }
                                                }
        
                        
               
     

  }

public void printReceipt(int option,Concert Concert,int quantity,int total){
                        
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Concert Name : " + Concert.getConName());
        
        System.out.println("Concert Time : " + Concert.getConTime());
      
        System.out.println("---------------------------------");
       
        
        
        switch (option) {
            case 1:
                System.out.println("Type : CAT1" );
                System.out.print("Seat :");
                for(int i=0;i<quantity;i++){                   
                System.out.print("A" + seatA++ + " ");
                
                } 
                break;
            case 2:
                System.out.print("Type : CAT2" );              
                System.out.print("Seat :");
                for(int i=0;i<quantity;i++){                   
                System.out.print("B" + seatB++ + " ");                  
                } 
                
                break;
            case 3:
                System.out.print("Type : CAT3" );
                System.out.print("Seat :");
                for(int i=0;i<quantity;i++){                   
                System.out.print("C" + seatC++ + " ");                  
                } 
                break;
            case 4:
                System.out.print("Type : CAT4" );
                System.out.print("Seat :");
                for(int i=0;i<quantity;i++){                   
                System.out.print("D" + seatD++ + " ");                  
                } 
                break;
            case 5:
                System.out.print("Type : CAT5" );
                System.out.print("Seat :");
                for(int i=0;i<quantity;i++){                   
                System.out.print("E" + seatE++ + " ");                  
                } 
                break;
            default:
                break;
        }
        
        System.out.println("\nTOTAL TICKET PURCHASE : " + quantity);
        System.out.println("************************************");
        System.out.println("\nTOTAL PAYMENT :  " +  total);
       
        
    
        
        
    }
    
    
}
