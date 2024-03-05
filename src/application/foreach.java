package application;

public class foreach {
    public static void main(String[] args) {
        
        String[] vect = new String[]{"Maria", "Alex","Joao"};
        
        //laço for da maneira padrão
        for (int i = 0 ; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        
        System.out.println("-------------------------------");

        //laço for each, se declara o tipo, um apelido e a coleção que ele vai percorrer (vect).
        //se le, para cada objeto obj contido no vetor vect, faça.

        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
