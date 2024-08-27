
import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i, j, k=0;

        while(k<6){

            for (i=0; i<6; i++){
                System.out.print(A[i]+" ");

                for (j=0; i<6; i++){
                    System.out.print(B[j]);

                   if(A[i]>B[j]){            
                        C[k]=A[i]; 
                   }
                   else
                     C[k]=B[i];  
                }                      
            }
          k++;  
        }

    }

}
