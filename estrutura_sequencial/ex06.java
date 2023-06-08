
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//mostre: 
//a) a área do triângulo retângulo que tem A por base e C por altura. 
//b) a área do círculo de raio C. (pi = 3.14159) 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B. 
  
package curso_progamacao;
	import java.util.Locale; 
	import java.util.Scanner;
	public class urisoma{
	
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			
			double A,B,C;
			
			Scanner sc = new Scanner(System.in);
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			
			double area = (A*C)/2;
			double circ = Math.PI*(C*C);
			double trapez = ((A+B)*C)/2;
			double quad = B*B;
			double a_ret = A*B;
			
			
			
			
			
			System.out.printf("TRIANGULO: %.3f \n",area);
			System.out.printf("CIRCULO: %.3f \n",circ);
			System.out.printf("TRAPEZIO: %.3f \n",trapez);
			System.out.printf("QUADRADO: %.3f \n",quad);
			System.out.printf("RETANGULO: %.3f \n",a_ret);
			
					sc.close();
		}

}
