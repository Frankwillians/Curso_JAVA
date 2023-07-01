//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int in = 0;
    int out = 0;
    int x = sc.nextInt();
    for (int i = x; i > 0; i--) {

      if (x >= 10 && x <= 20) {
        in += 1;
      } else {
        out += 1;
      }
      x = sc.nextInt();
    }

    System.out.printf("in: %s \nout: %s", in, out);

    sc.close();
  }
}