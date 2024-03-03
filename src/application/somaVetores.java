package application;

public class somaVetores {
    public static void main(String[] args) {
        double A[] = {8,2,11,14,13,20};
        double B[] = {5,10,3,1,10,7};

        double C[] = new double[A.length]; 
        System.out.println("Valores do vetor resultante: ");
        for (int i = 0 ; i < A.length ; i++){
          
            C[i] = A[i] + B[i] ;
           
        

            System.out.println(C[i]);
        }

        

        
    }
}
