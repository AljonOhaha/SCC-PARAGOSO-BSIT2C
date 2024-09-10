/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaohaha;

/**
 *
 * @author Administrator
 */
public class Products {
    
    int pid;
    String pname;
    double price;
    int stocks, sold;
    
    public void addProducts(int id, String name, double pr, int stk, int sld){
        this.pid = id;
        this.pname = name;
        this.price = pr;
        this.stocks = stk;
        this.sold = sld;
    }
    
    public void viewProducts(){
        double profit = price*sold;
        double tep = stocks*price;
        
        String status = (stocks > 0) ? "Available" : "Out-ofStocks";
        
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s\n", pid, pname, price, stocks, sold, profit, tep, status);
    }

    
    
}
