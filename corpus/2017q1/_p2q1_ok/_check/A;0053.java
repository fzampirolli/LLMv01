
public class VetoresEModulos {

    public static void main(String[] args) {
        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int[6];

        imprimeVetor(A);
        imprimeVetor(B);

        C = maioresElementos(A, B);
        imprimeVetor(C);
    }

    public static void imprimeVetor(int vet1[]) {
        for(int i : vet1){
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int[] maioresElementos(int vet1[], int vet2[]) {
        int[] retorno = new int[6];
        for(int i = 0; i < vet1.length; i++){
            int maior = (vet1[i] >= vet2[i]) ? vet1[i] : vet2[i]; 
            retorno[i] = maior;
        }

        return retorno;
    }
}
