package application;

import entities.Pessoa;

public class maisVelho {
    public static void main(String[] args) {
        
        Pessoa vect[] = {new Pessoa("Joao", 16),
        new Pessoa("Maria",21),
        new Pessoa("teresa",14),
        new Pessoa("Carlos",23),
        new Pessoa("Paulo",17)};
 
        String nomeVelho = "";
        int  maisVelho = vect[0].getAge();
        for (int i = 0 ; i < vect.length; i++){
    
            if ( vect[i].getAge() >= maisVelho ){
                maisVelho = vect[i].getAge();
                nomeVelho = vect[i].getName();

            }
            
        }
        
        System.out.println("PESSOA MAIS VELHA = " + nomeVelho);
       

    



    }
}
