/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

/**
 *
 * @author User
 */
public class Staff {
    private String name;
    private int YearJoined;
    private double basicSalary;

    public Staff() {
    }

    public Staff(String name, int YearJoined, double basicSalary) {
        this.name = name;
        this.YearJoined = YearJoined;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return YearJoined;
    }

    public void setYearJoined(int YearJoined) {
        this.YearJoined = YearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public double CalcSalary(){
        return basicSalary;
    }
}
