//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

import java.util.Locale;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int A, B, C, D;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    int diff = (A * B) - (C * D);
    System.out.printf("DIFERENÇA = %s", diff);

    sc.close();
  }
}