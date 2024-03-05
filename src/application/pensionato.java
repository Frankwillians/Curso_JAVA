package application;

import java.util.Scanner;

import entities.inquilinos;

public class pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    inquilinos[] inquilinos = new inquilinos[10]; 
    System.out.print("How many rooms will be rented? ");
    int quant = sc.nextInt();

    for (int i = 0 ; i < quant ; i++){
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine(); 
        System.out.print("Room Number: ");
        int room = sc.nextInt();
        inquilinos[room] = new inquilinos(name, email);
      
        
      
    }

    System.out.println("Busy rooms: ");

    for (int i = 0 ; i < inquilinos.length ; i++){
        if(inquilinos[i] != null){
            System.out.println(i+": " + inquilinos[i].getName()+ ", " + inquilinos[i].getEmail());
    
        }

    }
   
    
    
    sc.close();
    }


}

    


