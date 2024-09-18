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
public class Grades {
    
    int s_id;
    String s_name;
    double p, m, pf, f, average;
    private int id;
    
    public void addGrades(int id, String name, double pre, double mid, double pref, double fin){
        this.s_id = id;
        this.s_name = name;
        this.p = pre;
        this.m = mid;
        this.pf = pref;
        this.f = fin;
    }
    
    public void getGrades(){
        
        average = (p + m + pf + f)/4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-5d %-10s %-5.1f %-5.1f %-5.1f %-5.1f %-5.1f %s\n", s_id, s_name, p, m, pf, f, average, remarks);
    }
    
    
    public void viewGrades(){
        double average = (this.p + this.m + this.pf + this.f)/4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.id, this.s_name, this.p, this.m, this.pf, this.f, average, remarks);

    }
}


    
    




    

