
package Javaohaha;

import java.util.Scanner;


public class Netpay {
    public void Getpay(){
        
            Scanner gwapo = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = gwapo.nextLine();
            System.out.print("Enter Your Age: ");
            int age = gwapo.nextInt();
            System.out.print("Enter Rate per Hour: ");
            int rph = gwapo.nextInt();
            System.out.print("Enter Total Hours Worked: ");
            int totalh = gwapo.nextInt();
            System.out.print("Enter Total Deduction: ");
            int totald = gwapo.nextInt();


           

            System.out.println("\n-------------------------------------------------------------------------------");
            System.out.println("\nSLIP DETAILS");
            System.out.println("\n-------------------------------------------------------------------------------");

            System.out.println("Date: August 14, 2024");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            System.out.println("\nTotal Gross: " + (rph*totalh));
            System.out.println("Total Deduction: " + totald);

            System.out.println("\n--------------------------------------------------------------------------------");

            System.out.println("Net Pay: " + ((rph*totalh)-totald));
    }
    
}
