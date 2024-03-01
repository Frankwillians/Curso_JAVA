package application;

import java.util.Scanner;

public class negativosproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }
        System.out.println("Números Negativos : ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
                ;
            }
        }
        sc.close();
    }
}