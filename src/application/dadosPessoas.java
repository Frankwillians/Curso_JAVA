package application;

import entities.Pessoa;

public class dadosPessoas {
    public static void main(String[] args) {
        
        Pessoa[] pessoa = 
        {new Pessoa(1.70, "F"),
        new Pessoa(1.83, "M"),
        new Pessoa(1.54, "M"),
        new Pessoa(1.61, "F"),
        new Pessoa(1.75, "F")};
        int mulheres = 0;
        int homens = 0;
        double menorAltura = 0 ; 
        double maiorAltura = 0 ; 
        double sum = 0.0;

        for (int i = 0 ; i < pessoa.length; i++){
            if (pessoa[i].getGenero() == "M"){
                sum+=pessoa[i].getHeight();
                mulheres++;
            }
            else {
                homens++;
            }

            if (pessoa[i].getHeight() > maiorAltura){
                maiorAltura = pessoa[i].getHeight();
                menorAltura = pessoa[i].getHeight();

            }
            else if (pessoa[i].getHeight() < menorAltura ){
                menorAltura = pessoa[i].getHeight();

            }
        

        }
        double mediaMulheres = sum / mulheres;

        
        System.out.printf("Menor Altura = " + String.format("%.2f", menorAltura));
        System.out.println();
        System.out.printf("Maior Altura = " + String.format("%.2f", maiorAltura));
        System.out.println();
        System.out.printf("Media de Altura das mulheres = " + String.format("%.2f", mediaMulheres));;
        System.out.println();
        System.out.println("Quantidade de homens = " + homens);

        

    }
}
