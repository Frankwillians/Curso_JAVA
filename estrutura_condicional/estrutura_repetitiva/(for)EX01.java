//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
//X, se for o caso


package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; x >= i; i += 2) {
			System.out.println(i);
		}

		sc.close();
	}
}