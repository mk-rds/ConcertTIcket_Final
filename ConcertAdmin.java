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
public class ConcertAdmin extends Staff{
    private double CommissionRate;
    
    public ConcertAdmin() {
    }

    public ConcertAdmin(String name, int YearJoined, double basicSalary,double CommissionRate) {
        super(name, YearJoined, basicSalary);
        this.CommissionRate = CommissionRate;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    public void setCommissionRate(double CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    @Override
    public String toString() {
        return "ConcertAdmin{" + "CommissionRate=" + CommissionRate + '}';
    }

    @Override
    public double CalcSalary(){
        return this.getBasicSalary()*CommissionRate + this.getBasicSalary();
    }
    
    
}
