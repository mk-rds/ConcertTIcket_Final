/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Demo4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Staff[] Staffarr = new Staff[5];
        Staffarr[0] = new Staff("hanshen",2020,5000);
        Staffarr[1] = new ConcertAdmin("mingkit",2021,9000,0.03);
        Staffarr[2] = new ConcertStocker("kennth",2021,9000,0.04);
        
        CalculateSalary(Staffarr);
        
       ArrayList<String> ConcertAdminList = new ArrayList<>(); 
       ArrayList<String> ConcertStockerList = new ArrayList<>(); 
       
       ConcertAdminList.add("rajini");
       ConcertStockerList.add("jian chung");
       
       System.out.print("[1] add concert admin");
       System.out.print("[2] add concert stocker");
       int want,code=0;
       want = input.nextInt();
       switch(want){
           case 1:System.out.print("enter your code :");
                  code = input.nextInt();
               if(code == 2021){
                  System.out.print("enter new staff name :");
                  String StaffIn = input.next();
                  if(ConcertAdminList.contains(StaffIn)){
                  System.out.print("already asist");
                  }
                  else{
                      ConcertAdminList.add(StaffIn);
                      for(int i=0;i<ConcertAdminList.size();i++){
                          System.out.println(ConcertAdminList.get(i));
    
    }
    
    }
                 
    }
                 else{
                 System.out.print("only Concert Admin can access");         
                          }
       
                break;
       
       case 2:
           System.out.print("enter your code :");
                  code = input.nextInt();
               if(code == 2020){
                  System.out.print("enter new staff name :");
                  String StaffIn = input.next();
                  if(ConcertStockerList.contains(StaffIn)){
                  System.out.print("already asist");
                  }
                  else{
                      ConcertStockerList.add(StaffIn);
                      for(int i=0;i<ConcertStockerList.size();i++){
                          System.out.println(ConcertStockerList.get(i));
    
    }
                 
    }
                 
       
               
       }
               else{
                 System.out.print("only Concert Admin can access");         
                          }
       break;
       
    }
    }
    public static void CalculateSalary(Staff[] a){
        System.out.println("Staff salary is "+ ((Staff)a[0]).CalcSalary() );
        System.out.println("Concert Admin salary is "+ ((ConcertAdmin)a[1]).CalcSalary() );
        System.out.println("Concert Stocker salary is "+ ((ConcertStocker)a[2]).CalcSalary() );
    }
    
    
    
}
