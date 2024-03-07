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
            int id = sc.nextInt();
            

            sc.nextLine();
            System.out.print("Name: ");
            String namer = sc.nextLine();
           

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            
            employee.add(new Employee2(id, namer,sal));
            System.out.println();

          
            
        }
        System.out.println();
        System.out.print("Enter the id of the employee that will have a salary increase: ");
        Integer id = sc.nextInt();
        
        
        boolean find = false;
        for (Employee2 x : employee) {
            
            if (x.getId() == id){ 
                System.out.print("Enter the percentage: ");
                Integer perc = sc.nextInt();
                x.salaryIncrease(perc);
                find = true;
            }
            
        }
        if (find != true) {
            System.out.println("This ID Not Exist!");
        }

        System.out.println();

        System.out.println("List of employees: ");
       
        for (Employee2 x : employee){
            System.out.println(x.getId() + ", " + x.getName() + ", $ "+ x.getSalary());
        }

        sc.close();

    }
}
