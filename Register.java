/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author mingkit
 */
public class Register {

    private String name1;
    private String email1;
    private String password1;
    private String confpassword1;

    public Register() {
    }

    public Register(String name1, String email1, String password1, String confpassword1) {
        this.name1 = name1;
        this.email1 = email1;
        this.password1 = password1;
        this.confpassword1 = confpassword1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getConfpassword1() {
        return confpassword1;
    }

    public void setConfpassword1(String confpassword1) {
        this.confpassword1 = confpassword1;
    }

    public static void login() {
        String name, pswd, name1;
        boolean s, y;

        Register register = new Register();
        Scanner input = new Scanner(System.in);
        User[] userRecord = new User[1];

        System.out.print("\nregister\n");

        System.out.print("name : ");
        name1 = input.nextLine();
        register.setName1(name1);
        System.out.println(register.getName1());

        register.emailVerify();

        register.passwordVeify();

        register.confirmPswd();

        do {
            System.out.println("login");
            System.out.print("name : ");
            name = input.next();
            System.out.print("password : ");
            pswd = input.next();

            s = name.equals(register.getName1());
            y = pswd.equals(register.getPassword1());

            if (s != true || y != true) {
                System.out.print("try again\n");
            } else {
                System.out.println("login successful");
                userRecord[0] = new User(name, pswd);
                System.out.println(userRecord[0]);
                System.out.println("welcome back," + userRecord[0].getName());

            }

        } while (s != true || y != true);

    }

    public void emailVerify() {

        Scanner input = new Scanner(System.in);
        String REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        boolean mail;

        System.out.print("email address :");
        email1 = input.nextLine();
        this.setEmail1(email1);

        mail = email1.matches(REGEX);

        while ((!mail)) {

            System.out.println("Invalid Email");
            System.out.println("Email must have @.\n");
            System.out.println(mail);
            System.out.print("email address :");
            email1 = input.nextLine();
            this.setEmail1(email1);
            mail = email1.matches(REGEX);
        }
        System.out.println("Valid Email");
    }

    public void passwordVeify() {
        Scanner paswrd = new Scanner(System.in);
        String REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{7,}$";
        boolean passwrd;

        System.out.print("password : ");
        password1 = paswrd.nextLine();
        this.setPassword1(password1);

        passwrd = password1.matches(REGEX);

        while (!passwrd) {
            System.out.println("Invalid Password");
            System.out.println("password must have at least 7 characters , letters and digits,symbols,at least one letter and one digit.\n");
            System.out.println("Try Again");
            System.out.print("password : ");
            password1 = paswrd.nextLine();
            this.setPassword1(password1);
            passwrd = password1.matches(REGEX);

        }
        System.out.println("Valid Password");

    }

    public void confirmPswd() {
        Scanner confirm = new Scanner(System.in);
        boolean compare;
        System.out.print("confirm password :");
        confpassword1 = confirm.nextLine();

        compare = password1.matches(confpassword1);

        while (!compare) {

            System.out.println("Password not match ! try again !!!");
            System.out.print("confirm password :");
            confpassword1 = confirm.nextLine();
            compare = password1.matches(confpassword1);
        }
        System.out.println("Password correct!");
        System.out.println("Registered Succesfully" + "\nHi " + this.getName1());

    }

    @Override
    public String toString() {
        return "Registered Succesfully" + "\n Hi " + name1;
    }

}
