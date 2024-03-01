package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Quantas pessoas irão ser inseridas ? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        String[] vectNames = new String[n];
        double sum_height = 0.0;
        int young = 0;
        double percent_young = (young / n) * 100;
        for (int i = 0 ; i < vect.length ; i++){
            System.out.printf("Dados da %d ° pessoa: ", i+1);
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa = new Pessoa(name,idade,altura);
            sum_height += pessoa.getHeight();
            if (pessoa.getAge() < 16){
                young = young + 1;
                vectNames[i] = pessoa.getName();


            } 


        }


        System.out.println(young);
        double height_avg = sum_height / vect.length;
        System.out.print("Altura media: " + String.format("%.2f",height_avg));
        System.out.println();
        System.out.print("Pessoas com menos de 16 anos: " + percent_young + "%");
        System.out.println();
        for(int i = 0 ; i < n ; i++){
           
            if(vectNames[i] != null ){
                System.out.println(vectNames[i]);
            }
        }

        sc.close();
    }
 


}
