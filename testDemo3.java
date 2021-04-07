/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class testDemo3 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Record[] record = new Record[2];
       Concert[] Concert = {new Concert("blackpink","3 march 2021"),
                            new Concert("jay chou","4 march 2021")};
       ticket[] ticket = {new ticket(10,20,30,40,50),
                          new ticket(50,50,50,50,50)
       };
       
       
       String type = null;
       int quantity = 0,total = 0,subtotalBP=0,subtotalJay=0;
       
       
       for(int i=0;i<record.length;i++){
       System.out.print("name :");
       String name = input.next();
       System.out.print("password :");
       String pswd = input.next();
       
       user user = new user(name,pswd);
       
       for(int j=1;j<Concert.length+1;j++){
           System.out.print(Concert[j-1]);
       }
       
       int option = input.nextInt();
       
       
       System.out.print(ticket[option-1]);
       System.out.print("type");
       int choose = input.nextInt();
       switch(choose){
           case 1: 
                    type = "CAT1";
                    System.out.print("quantity");
                    quantity = input.nextInt();                                  
                   if(ticket[option-1].getCAT1()-quantity >= 0){
                   ticket[option-1].TicketStock(ticket, quantity, choose, option); 
                        total = quantity*900;
                                                      
                                
                                
                        switch(option){
                        case 1: subtotalBP += total;                              
                                break;
                        case 2: subtotalJay += total;                                
                                break;
                    }
                        
                   }
                   else{
                       quantity =0;
                       total= 0;
                       System.out.print("insuficient");
                   }
                        
                   ticket[option-1].printReceipt(option, Concert[0], quantity,total);               
                    
                    
                    break;
                    
           case 2: 
                    type = "CAT2";
                    System.out.print("quantity");
                    quantity = input.nextInt();
                    if(ticket[option-1].getCAT2()-quantity >= 0){
                    ticket[option-1].TicketStock(ticket, quantity, choose, option); 
                        total = quantity*800;
                        
                        switch(option){
                        case 1: subtotalBP += total;                              
                                break;
                        case 2: subtotalJay += total;                                
                                break;
                    }
                        ticket[option-1].printReceipt(option, Concert[1], quantity,total);
                   }
                   else{
                       quantity =0;
                       total= 0;
                       System.out.print("insuficient");
                   }
                    ticket[option-1].printReceipt(option, Concert[1], quantity,total);
                    break;
       }
           
            
       TicketSystem ticketSystem = new TicketSystem(Concert[option-1],type,quantity,total);
       
       
       
       
       record[i] = new Record(user,ticketSystem);
       int want,code;
       ArrayList<String> ConcertAdminList = new ArrayList<>(); 
       ArrayList<String> ConcertStockerList = new ArrayList<>(); 
       Staff[] Staff = new Staff[5];
       ConcertAdminList.add("mingkit");
       ConcertStockerList.add("kenneth");
       
      for (Staff Staff1 : Staff) {
          
       System.out.print("[1] Concert Admin staff add");
       System.out.print("[2] Concert Stocker staff add");
       System.out.print("[3] see staff List");
       
       want = input.nextInt();
           
               switch(want){
                   case 1: ConcertAdmin CA = new ConcertAdmin();
                   System.out.print("enter your concert Admin code :");
                   code = input.nextInt();
                   if(code == CA.getCode()){
                       System.out.print("enter new staff name :");
                       String staffIn = input.next();
                       if(ConcertAdminList.contains(staffIn)){
                           System.out.println("the staff is already contain inside");
                           
                       }
                       else{
                           ConcertAdminList.add(staffIn);
                           String StaffName = staffIn;
                           System.out.print("welcome "+ staffIn);
                           System.out.print("enter your basic salary : ");
                           double salary = input.nextDouble();
                           System.out.print("enter your year joined : ");
                           int yearJoined = input.nextInt();
                           
                           ConcertAdmin ConcertAdmin = new ConcertAdmin(StaffName,salary,yearJoined);
                       }
                   }
                   else{
                       System.out.print("only concert admin can access");
                   }
                   for(int z=0;z<ConcertAdminList.size();z++){
                       System.out.println(z+1 + "member :" + ConcertAdminList.get(z));
                   }
                   break;
                   
                   
                   case 2:ConcertStocker CS = new ConcertStocker();
                   System.out.print("enter your concert Admin code :");
                   code = input.nextInt();
                   if(code == CS.getCode()){
                       System.out.print("enter new staff name :");
                       String staffIn = input.next();
                       if(ConcertAdminList.contains(staffIn)){
                           System.out.println("the staff is already contain inside");
                           
                       }
                       else{
                           ConcertAdminList.add(staffIn);
                           String StaffName = staffIn;
                           System.out.print("welcome "+ staffIn);
                           System.out.print("enter your basic salary : ");
                           double salary = input.nextDouble();
                           System.out.print("enter your year joined : ");
                           int yearJoined = input.nextInt();
                           
                           ConcertStocker ConcertStocker = new ConcertStocker(StaffName,salary,yearJoined);
                       }
                   }
                   else{
                       System.out.print("only concert admin can access");
                   }
                   for(int z=0;z<ConcertAdminList.size();z++){
                       System.out.println(z+1 + "member :" + ConcertAdminList.get(z));
                   }
                   break;
                   
                   
                   
                   
                   
               }   }
       
       
       
      
      
       int choice;
       
       do{
       
       System.out.println("admin");
       System.out.println("[1] blackpink");
       System.out.println("[2] jaychou");
       System.out.println("[3] record");
       choice = input.nextInt();
       
       int select;
       int cat1=0,cat2=0,cat3=0,cat4=0,cat5=0;
       switch(choice){
           case 1: ConcertAdmin.ConcertDetails(Concert[choice-1], subtotalBP,ticket[0]);
                   System.out.print("[1] ADD TICKET STOCK");
                   select = input.nextInt();
                   
                   switch(select){
                       case 1: 
                               System.out.print("staff name :");
                               String staff = input.next();
                               System.out.print("enter code :");
                               code = input.nextInt();
                               
                               ConcertStocker CS = new ConcertStocker();
                               if(CS.getCode() == code){
                                    System.out.println(ticket[0]);
                                    System.out.print("cat1 :");
                                    cat1 = input.nextInt();
                                    System.out.print("cat2 :");
                                    cat2 = input.nextInt(); 
                                    System.out.print("cat3 :");
                                    cat3 = input.nextInt(); 
                                    System.out.print("cat4 :");
                                    cat4 = input.nextInt(); 
                                    System.out.print("cat5 :");
                                    cat5 = input.nextInt();
                                    ConcertStocker.AddTicketStock(ticket[0], cat1, cat2, cat3, cat4, cat5);
                                    System.out.print(ticket[0]);
                               }
                               else{
                                   System.out.print("u cant access if you are not ConcertStocker");
                               }
                               
                               break;
                               
                   }
                                  
                   break;
           case 2: ConcertAdmin.ConcertDetails(Concert[choice-1], subtotalJay,ticket[1]);
                   break;
                   
           case 3: 
                    for (Record record1 : record) {
                    System.out.println(record1);
       }
                   
                    break;
       }
       
    }while(choice!=4);
    }
            
    }
}
