//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”


package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double val = sc.nextDouble();
		
		if (val > 0 && val <= 25) {
			System.out.printf("Intervalo [0,25]");	
		}
		else if(val > 25 && val <= 50) {
			System.out.printf("Intervalo (25,50]");
		}
		else if(val > 75 && val <= 100) {
			System.out.printf("Intervalo (75,100]");
		}
		else {
			System.out.printf("fora de intervalo");
		}
				
		
		sc.close();
	}
}