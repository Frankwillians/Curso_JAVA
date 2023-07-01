//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
//exemplo

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int comb = 0;
		int contGas = 0;
		int contAlc = 0;
		int contDis = 0;

		while (comb != 4) {
			comb = sc.nextInt();

			switch (comb) {
			case 1:
				contGas += 1;
				break;
			case 2:
				contAlc += 1;
				break;
			case 3:
				contDis += 1;
				break;

			}

			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Gasolina: %s \nAlcool: %s \nDiesel: %s", contGas, contAlc, contDis);
		sc.close();
	}
}