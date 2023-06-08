//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.

import java.util.Locale; 
	import java.util.Scanner;
	public class main{
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			int func;
			double horaTrabalhada,sal;
			
			
			Scanner sc = new Scanner(System.in);
			func = sc.nextInt();
			horaTrabalhada = sc.nextDouble();
			sal = sc.nextDouble();
			
			
			double salary = sal*horaTrabalhada;
			System.out.printf("Number = %d \n",func);
			System.out.printf("Salary = R$ %.2f",salary);
					
			
					sc.close();
		}

}
