package application;

import java.util.Scanner;

import entities.inquilinos;

public class pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    inquilinos[] inquilinos = new inquilinos[10]; 
    System.out.print("How many rooms will be rented? ");
    int quant = sc.nextInt();
    int posi = 0;

    for (int i = 0 ; i < quant ; i++){
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine(); 
        System.out.print("Room Number: ");
        int room = sc.nextInt();
        if (room == i+1){
            inquilinos[room] = new inquilinos(name, email);
            posi++;
        }
     
        
      
    }

    System.out.println("Busy rooms: ");

    for (int i = 0 ; i < quant ; i++){
        if(inquilinos[i] != null){
            System.out.println(inquilinos[posi-1].getName());
            System.out.println(inquilinos[posi-1].getEmail());
            System.out.println(posi);
        }

    }
  
    
    System.out.println(posi);
    
    
    sc.close();
    }


}

    


