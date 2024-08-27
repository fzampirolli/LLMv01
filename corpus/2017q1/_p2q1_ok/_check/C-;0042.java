
import java.util.Scanner;
public class Exercico1 {   
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = {74, 0, 1, 7, -8, 5};
        int B[] = {-5, 3, 6, 0, 7, 18};
        int C[] = new int[6];

        imprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A, B);
        ImprimeVetor(C);
}

public static void imprimeVetor(int Vet1[]) {

    for(int c=0; c<6; c++){
        System.out.println("Os valores do vetor são ["+c+"]"+Vet1[c]);

}
}

public static int [] MaioresElementos(int  Vet1[], int Vet2[]){     
        int M[] = new int [6];
        for(int i=0; i<6; i++){
            if(Vet1[i] > Vet2[i]){
                M[i] = Vet1[i];}
            else{M[i] = Vet2[i]);}
        }
            return M;
        }
        }
