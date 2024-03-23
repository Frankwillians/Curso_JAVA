package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeePoliEX;
import entities.OutsorcedEmployeee;

public class ApplicationPoliEX {
    public static void main(String[] args) {
        List<EmployeePoliEX> emp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++ ){
            sc.nextLine();
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.print("Outsorced? (y/n): ");
            String resp = sc.nextLine().toUpperCase();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Hours:");
            int hour = sc.nextInt();
            System.out.print("Value per hour:");
            double valuePerHour = sc.nextDouble();
            if (resp.equals("Y")) {
                System.out.print("Additional charge:");
                double charge = sc.nextDouble();
                emp.add(new OutsorcedEmployeee(name, hour, valuePerHour,charge));
            }
            else{
                emp.add(new EmployeePoliEX(name, hour, valuePerHour));
            }
        }

        System.out.println("PAYMENTS: ");
        for (EmployeePoliEX x : emp) {
            System.out.println(x.getName() + " - $" + x.payment());
        }
        
        
        
        sc.close();
    }
}
