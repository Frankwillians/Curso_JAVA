//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double X = sc.nextInt();
		double Y = sc.nextInt();		
		while (X != 0 && Y != 0) {
			if (X > 0.0 && Y > 0.0 ){
				System.out.println("PRIMEIRO");
			}
			else if ( X < 0.0 && Y > 0.0){
				System.out.println("SEGUNDO");
			}
			else if (X < 0.0 && Y < 0.0) {
				System.out.println("TERCEIRO");
			}
			else if (X > 0.0 && Y < 0.0) {
				System.out.println("QUARTO");
			}
			
			X = sc.nextInt();
			Y = sc.nextInt();
				
		}
		
		sc.close();
	}
}