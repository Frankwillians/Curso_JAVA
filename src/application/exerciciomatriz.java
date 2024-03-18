package application;

import java.util.Scanner;

public class exerciciomatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
      
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
               
            }
        }

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("position: " + i + "," + j);

                if (j > 0) {
                    System.out.println("Left: " + mat[i][j-1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i-1][j]);
                }
                if (j < mat[i].length-1) {
                    System.out.println("Right: " + mat[i][j+1]);
                }
                if (i < mat.length-1) {
                    System.out.println("Down: " + mat[i+1][j]);
                }
               
            
        }
        
        sc.close();
    }
}
}
