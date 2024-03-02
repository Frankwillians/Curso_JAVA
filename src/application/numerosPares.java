package application;

import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar ? ");
        int n = sc.nextInt();

        int vect[] = new int[n];
        int vectPares[] = new int [n];
        int pares = 0;
        System.out.println();

        for (int i = 0; i < n ; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if(vect[i] % 2 == 0){
                if (vect[i] != 0){
                    vectPares[i] = vect[i];
                    pares += 1;

                }
                
                
            
            }
        }
            
        System.out.println("NUMEROS PARES:");
        for (int p = 0; p < vectPares.length; p++){
            if(vectPares[p] != 0){
                System.out.print(vectPares[p]+" ");
            }
        }
        
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: ");
        System.out.println(pares);

        
        
        
        
        sc.close();
    }
    
}
