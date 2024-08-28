
package Javaohaha;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Grades[] gr = new Grades[100];
       
        System.out.print("Enter no. of Students: ");
        int nums = sc.nextInt();
        
        for(int i = 0; i < nums; i++){
            
            System.out.println("Enter details of student "+(i+1)+":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pr = sc.nextDouble();
            System.out.print("Midterm: ");
            double md = sc.nextDouble();
            System.out.print("Prefinal: ");
            double pf = sc.nextDouble();
            System.out.print("Final: ");
            double fn = sc.nextDouble();
            gr[i] = new Grades();
            gr[i].addGrades(id, name, pr, md, pf, fn);
        }
            
            for( int i=0; i < nums; i++){
                gr[i].viewGrades();
              
                       
     
                  
            }
        
    }

    private static class Grades {

        public Grades() {
        }

        private void addGrades(int id, String name, double pr, double md, double pf, double fn) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private void viewGrades() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    }
    

