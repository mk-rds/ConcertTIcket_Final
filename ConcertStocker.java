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
public class ConcertStocker extends Staff {
    private double allowanceRate;

    public ConcertStocker(String name, int YearJoined, double basicSalary,double allowanceRate) {
        super(name, YearJoined, basicSalary);
        this.allowanceRate = allowanceRate;
    }

    public double getAllowanceRate() {
        return allowanceRate;
    }

    public void setAllowanceRate(double allowanceRate) {
        this.allowanceRate = allowanceRate;
    }

    @Override
    public String toString() {
        return "ConcertStocker{" + "allowanceRate=" + allowanceRate + '}';
    }
    
    @Override
    public double CalcSalary(){
        return this.getBasicSalary()*allowanceRate + this.getBasicSalary();
    }
    
}
