/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAssignment;

import static FinalAssignment.TicketType.CalcTicketPrice;
import static FinalAssignment.TicketType.TicketStockBP;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestDemo {

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("[1] BLACKPINK" + "\n[2] JAY CHOU" + "\n[3] TAYLOR SWIFT");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Concert[] ConcertArr = new Concert[5];
                    TicketType[] ticket = {new TicketType(10, 20)};
                    ConcertArr[0] = new BlackPink("BLACKPINK Concert for NEW ALBUM RELEASE", "7 MARCH 2021", "KPOP SENSATION BLACKPINK RETURNS", "BUKIT JALIL STADIUM", "BLACKPINK", ticket[0]);
                    System.out.print(ConcertArr[0]);

                    int selection;
                    int option;
                    int quantity;

                    do {
                        System.out.println("\n\n\nPress [1] to buy ticket " + "\nPress [2] to display the song list for this concert");
                        selection = input.nextInt();
                        switch (selection) {
                            case 1:
                                System.out.print("Select ticket type:");
                                option = input.nextInt();
                                System.out.print("How many tickets do you wish to purchase ");
                                quantity = input.nextInt();
                                TicketStockBP(ticket, quantity, option);
                                System.out.print("\nTotal : RM " + CalcTicketPrice(ticket, quantity, option));
                                break;

                            case 2:
                                printElement(ConcertArr);
                                System.out.println("Press any key to go back to previous page ");
                                String goBack = input.next();
                                System.out.print(ConcertArr[0]);
                                break;

                            case 3:
                                System.exit(0);
                            default:
                                break;

                        }
                    } while (selection != 1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;

            }
        } while (choice != 1);
    }

    public static void printElement(Concert[] a) {

        System.out.print(((BlackPink) a[0]).printSongList());
    }

}


