//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//peso 5

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; n > i; i++) {
      double a, b, c;
      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();

      double med_pond = (((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5));

      System.out.printf("%.1f\n", med_pond);
    }

    sc.close();
  }
}