package application;

import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar ? ");
        int n = sc.nextInt();
        double [] vect = new double [n];
        double sum = 0.0;
        for (int i = 0 ; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        System.out.print("VALORES: ");
                
        for (int i = 0 ; i < vect.length; i++){
            System.out.print(" "+vect[i]);
        }

        System.out.println();
        double avg = sum/vect.length;
        System.out.printf("SOMA: %.2f " , sum);
        System.out.println();
        System.out.printf("MEDIA: %.2f" , avg);

        sc.close();
    }
}
