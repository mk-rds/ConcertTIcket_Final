/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

public class TicketType {

    private int CAT1, CAT2, CAT3, CAT4, CAT5;
    private static int ticketPrice;
    private static int total=0;

    public TicketType(int CAT1, int CAT2, int CAT3, int CAT4, int CAT5) {
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

    public static void TicketStock(TicketType[] a, int quantity, int option) {

        for (int i = 0; i <= a.length -1 ; i++) {

            if (option == 1 && a[i].CAT1 >= 0 && quantity <= a[i].CAT1 ) {
                a[i].CAT1 -= quantity;
            } else if (option == 2 && a[i].CAT2 >= 0 && quantity > 0) {
                a[i].CAT2 -= quantity;

            } else if (option == 3 && a[i].CAT3 >= 0 && quantity > 0) {
                a[i].CAT3 -= quantity;

            } else if (option == 4 && a[i].CAT4 >= 0 && quantity > 0) {
                a[i].CAT4 -= quantity;

            } else if (option == 5 && a[i].CAT5 >= 0 && quantity > 0) {
                a[i].CAT5 -= quantity;

            } else {
                System.out.print("the stock is empty or you didnt type in quantity\n");
            }
        System.out.println("cat1 : " + a[i].CAT1);
        System.out.println("cat2 : " + a[i].CAT2);
        System.out.println("cat3 : " + a[i].CAT3);
        System.out.println("cat4 : " + a[i].CAT4);
        System.out.println("cat5 : " + a[i].CAT5);
            System.out.println(i);
            System.out.println(a.length);
        }
        //
        

    }

    public static int CalcTicketPrice(TicketType[] a, int quantity, int option) {
        
        for (int i = 0; i <= a.length - 1; i++) {

            if (option == 1 && a[i].CAT1 >= 0 && quantity > 0) {
                ticketPrice = 900;
                total = ticketPrice * quantity;
                
            } else if (option == 2 && a[i].CAT2 >= 0 && quantity > 0) {
                ticketPrice = 800;
                total = ticketPrice * quantity;
               
            } else if (option == 3 && a[i].CAT3 >= 0 && quantity > 0) {
                ticketPrice = 700;
                total = ticketPrice * quantity;
                
            } else if (option == 4 && a[i].CAT4 >= 0 && quantity > 0) {
                ticketPrice = 600;
                total = ticketPrice * quantity;
         
            }  else if (option == 5 && a[i].CAT5 >= 0 && quantity > 0) {
                ticketPrice = 500;
                total = ticketPrice * quantity;
           
            }
            else {
                System.out.print("you input error");
            }
        }

        return total;
    }

}
