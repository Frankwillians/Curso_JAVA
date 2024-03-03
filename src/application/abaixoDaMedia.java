package application;

public class abaixoDaMedia {
    public static void main(String[] args) {
        
        double vect[] = {10.0,15.5,13.2,9.8};
        double somaVetores = 0.0;
        
        for (int i = 0 ; i < vect.length; i++){
            somaVetores += vect[i];
            
        }
        double media = somaVetores / vect.length ;
        
        System.out.print("Média do vetor =  " + String.format("%.3f", media));
        System.out.println();
        System.out.println("Elementos abaixo da media: ");

        for (int i = 0 ; i < vect.length; i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
            
        }

        

    }
}
