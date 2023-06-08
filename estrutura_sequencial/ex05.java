//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package curso_progamacao;
	import java.util.Locale; 
	import java.util.Scanner;
	public class urisoma{
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			int pcs_1,quantpcs_1,pcs_2,quantpcs_2;
			double valpcs_1,valpcs_2;
			
			
			Scanner sc = new Scanner(System.in);
			
			pcs_1= sc.nextInt();
			quantpcs_1 = sc.nextInt();
			valpcs_1 = sc.nextDouble();
			
			pcs_2= sc.nextInt();
			quantpcs_2 = sc.nextInt();
			valpcs_2 = sc.nextDouble();
			
			double pc1_S = quantpcs_1 * valpcs_1;
			double pc2_S = quantpcs_2 * valpcs_2;
			
			
			
			double total = pc1_S+pc2_S;
			
			System.out.printf("VALOR A PAGAR = %.2f \n",total);
		
			
					sc.close();
		}

}
