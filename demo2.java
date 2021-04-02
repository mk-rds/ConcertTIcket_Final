/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class demo2 {
    
    public static void main(String[] args){
        String name,pswd;
        User user = new User();
        Scanner input = new Scanner(System.in);
        User[] userRecord = new User[1];
        
        do{
            System.out.print("register");
        
        System.out.print("name : ");
        user.setName(input.nextLine());
        
        System.out.print("password : ");
        user.setPassword(input.nextLine());
               
        
        System.out.println("login");
        System.out.print("name : ");
        name = input.next();
        System.out.print("password : ");
        pswd = input.next();
        
        if(user.getName().equals(name) && user.getPassword().equals(pswd)){
            System.out.println("login successful");
            userRecord[0] = new User(name,pswd);
            System.out.println(userRecord[0]);       
            System.out.println("welcome back," + userRecord[0].getName());
        }
        
        else{
            System.out.print("try again");
        }
        
        }while(user.getName() != name && user.getPassword() != pswd );
    }
}
