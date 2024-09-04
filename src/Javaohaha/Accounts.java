/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaohaha;

/**
 *
 * @author SCC-COLLEGE
 */
public class Accounts {
int aid;
    String fname, lname, email, user, pass;
    
    public void addAccounts(int id, String Fname, String Lname, String emailAdd, String username, String password){
        this.aid = id;
        this.fname = Fname;
        this.lname = Lname;
        this.email = emailAdd;
        this.user = username;
        this.pass = password;
    }
    
    public void viewAccounts(){
        System.out.printf("%-5d %-10s %-10s %-20s %-10s %-10s\n",aid, fname, lname, email, user, pass);
    }
   
}
