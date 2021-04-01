package demo;

public class TicketType {

    private int CAT1, CAT2, CAT3, CAT4, CAT5;
    private static int ticketPrice;
    public static int total=0;
    
    

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
        return "\nTicketType{" + "\nCAT1=" + CAT1 + "\nCAT2=" + CAT2 + "\nCAT3=" + CAT3 + "\nCAT4=" + CAT4 + "\nCAT5=" + CAT5 + '}';
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
            else {
                System.out.print("insufficient");
                
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
        System.out.println("---------------------------------");
        System.out.println("Concert Name : " + Concert.getConName());
        System.out.println("Concert Artist : " + Concert.getConArtist());
        System.out.println("Concert Time : " + Concert.getConTime());
        System.out.println("Concert Destination : " + Concert.getConDest());
        System.out.println("---------------------------------");
       
        switch (option) {
            case 1:
                System.out.print("Type : CAT1" );
                break;
            case 2:
                System.out.print("Type : CAT2" );
                break;
            case 3:
                System.out.print("Type : CAT3" );
                break;
            case 4:
                System.out.print("Type : CAT4" );
                break;
            case 5:
                System.out.print("Type : CAT5" );
                break;
            default:
                break;
        }
        
        System.out.println("\nTOTAL TICKET PURCHASE : " + quantity);
        System.out.println("************************************");
        System.out.println("\nTOTAL PAYMENT :  " +  total);
        
    }

    
        

        
    

}
