/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaohaha;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Product {
    
    public void getProduct(){
        Scanner sc = new Scanner(System.in);
        Products pds = new Products();
        
        System.out.println("Running product program: \n");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter product name: "); 
        String product = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the number of stocks: ");
        int stock = sc.nextInt();
        System.out.print("Enter the number of sold products: ");
        int sold = sc.nextInt();
        
        System.out.printf("\n%-5s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Product", "Price", "Stocks", "Sold", "Proft", "TEP", "Status");
        pds.addProducts(id, product, price, stock, sold);
        pds.viewProducts();
    }
}
    

