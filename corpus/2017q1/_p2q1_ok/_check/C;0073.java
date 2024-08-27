
import java.util.Arrays;

public class Questao01 {

    public static void main(String[] args) {
     int A[] = {0,7,32,-12,42,100};
     int B[] = {23,-80,6,-2,9,6};
     int C[] = new int [6];

     ImprimeVetor(A);
     ImprimeVetor(B);

     C = MaioresElementos(A,B);
     ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[])
    {
        int n = 6;
         for (int i = 0; i<n;i++)
        {
           System.out.println(Vet1[i]);

       }

    }
      public static int[] MaioresElementos(int Vet1[], int Vet2[])
    {

         int VetC[] = new int [6];

         Arrays.sort(Vet1);

        int n = 6;
         for (int i = 0; i<2;i++)
        {
            for (int j = 0; j<2;j++)
            {
           VetC[i] = Vet1[i=5];
           System.out.println("\n ");

            }        
       }
        return   VetC;

    }

}
