//fazer um progama para ler um número inteiro N e os dados (nome e preço) de N produtos em um vetor
//em seguida mostrar o preço medio dos produtos.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductSimple;

public class vetoraula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ProductSimple[] vect = new ProductSimple[n]; 

        for (int i = 0; i < vect.length ; i ++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductSimple(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length ; i ++){
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;

        System.out.println("AVARAGE: " + avg);

        sc.close();
    }
}
