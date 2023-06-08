//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//seguir, calcule e mostre o valor da conta a pagar

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int quant = sc.nextInt(); 
		double val = 0;
		if (cod == 1) {
			 val = 4.00;
			
		}
		else if(cod == 2) {
			val = 4.50;
		}
		else if(cod == 3) {
			val = 5.00;
		}
		else if(cod == 4) {
			val = 2.00;
		}
		else if(cod == 5) {
			val = 1.50;
		}
						
			
		double total = quant * val;
		
		System.out.printf("TOTAL R$ %.2f",total);
	
		
		
		
		sc.close();
	}
}