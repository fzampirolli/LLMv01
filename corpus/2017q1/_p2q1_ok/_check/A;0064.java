
public class Questao1 {

    public static void main(String[] args) {
    int A[] = {80,30,101,20,25,7};
    int B[] = {60,103,49,20,55,7};
    int C[] = new int [6];

        System.out.println("A");
        imprimeVetorA(A);
        System.out.println("");
        System.out.println("B");
        imprimeVetorB(B);
        System.out.println("");

        for(int i = 0; i < 6; i++){
          C[i] = maioresElementos(A,B,i);  
        }
        System.out.println("C");
        imprimeVetorC(C);

    }

    public static void imprimeVetorA(int vetorA[]){

        for(int i = 0;i < 6 ; i++){
            System.out.print(vetorA[i]+ " ");
        }

    }

    public static void imprimeVetorB(int vetorB[]){

        for(int i = 0;i < 6 ; i++){
            System.out.print(vetorB[i]+ " ");
        }

    }

    public static void imprimeVetorC(int vetorC[]){

        for(int i = 0;i < 6 ; i++){
            System.out.print(vetorC[i] + " ");
        }

    }

    public static int maioresElementos(int vetorA[],int vetorB[],int i){

        int c;
        if (vetorA[i]>= vetorB[i]){

                c = vetorA[i];

        }else{
                c = vetorB[i];
        }

        return c;

    }

}
