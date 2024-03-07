package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee2;

public class exerciciopropostolista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee2> employee = new ArrayList<>();
       
        System.out.print("How many employees will be registered ? ");

        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("ID: ");
            int ident = sc.nextInt();
            

            sc.nextLine();
            System.out.print("Name: ");
            String namer = sc.nextLine();
           

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            
            employee.add(new Employee2(ident, namer,sal));
            System.out.println();

          
            
        }
        System.out.println();
        System.out.print("Enter the id of the employee that will have a salary increase: ");
        int ident = sc.nextInt();
        System.out.println();
        String msg = "";
        for (Employee2 x : employee) {
            if (ident == x.getId()){
                System.out.print("Enter the percentage: ");
                Integer perc = sc.nextInt();
                x.salaryIncrease(perc);
                
            
            
            
            
        }
            else if (ident != employee.indexOf(x)){
                System.out.println("thid id not exist");
        
            

        }
       }
    
        

        System.out.println("List of employees: ");
       
        for (Employee2 x : employee){
            System.out.println(x.getId() + ", " + x.getName() + ", $ "+ x.getSalary());
        }

        sc.close();

    }
}
