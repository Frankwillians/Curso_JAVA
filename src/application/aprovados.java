package application;

import entities.Aluno;

public class aprovados {
    public static void main(String[] args) {
        
        
        Aluno[] alunos = 
        {new Aluno("João Silva", 7.0, 8.5),
        new Aluno("Maria Teixeira", 9.2,6.5),
        new Aluno("Carlos Carvalho", 5.0, 6.0),
        new Aluno("Teresa Pires", 5.5, 6.5)};
        
        System.out.println("Alunos Aprovados: ");
        
        for (int i = 0 ; i < alunos.length ; i++){
            
            double sum = alunos[i].getNota1() + alunos[i].getNota2(); 
            double media = sum/2;
            
            if(media >= 6 ){
                System.out.println(alunos[i].getName());;

            }
        }

    }
}
