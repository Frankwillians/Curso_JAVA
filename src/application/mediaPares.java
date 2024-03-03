package application;

public class mediaPares {
    public static void main(String[] args) {
        
        int vectA[] = {8,2,11,14,13,20};
        int vectB[] = {7,9,11};
        int somaPares = 0;
        int quantpar = 0;
        String impar = "";

        for (int i = 0 ; i < vectA.length ; i++) { 
            if (vectA[i] % 2 == 0 ){
                somaPares += vectA[i];
                quantpar++;
            }
        }

        int mediaPares = somaPares / quantpar;

        for (int i = 0 ; i < vectB.length ; i++) { 
            if (vectB[i] % 2 == 1 ){
                impar = "Nenhum numero Par.";
            }
        }

        System.out.println("Vetor A: Média dos pares = " + mediaPares);
        System.out.println();
        System.out.println("Vetor B: " + impar);
      

    }
}
