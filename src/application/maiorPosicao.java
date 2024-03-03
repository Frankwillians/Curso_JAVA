package application;

import java.util.Locale;

public class maiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double vect[] = {8.0,4.0,10.0,14.0,13.0,7.0};
        double maior = vect[0];
        int posi = 0;
        for (int i = 0 ; i < vect.length; i++){
            if (vect[i] > maior ){
                maior = vect[i];
                posi = i;
                
                
            }
            
           
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posi);
     

    }
}
