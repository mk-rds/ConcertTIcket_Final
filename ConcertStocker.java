/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author User
 */
public class ConcertStocker extends Staff{
    private int stockSales;
    private int code = 2021;

    public ConcertStocker() {
        
    }

    public int getStockSales() {
        return stockSales;
    }

    public void setStockSales(int stockSales) {
        this.stockSales = stockSales;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
   
    
    
    
    
    public static void AddTicketStock(ticket ticket,int cat1,int cat2,int cat3,int cat4,int cat5){
        ticket.setCAT1(cat1);
        ticket.setCAT2(cat2);
        ticket.setCAT3(cat3);
        ticket.setCAT4(cat4);
        ticket.setCAT5(cat5);
        
    }
    
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
