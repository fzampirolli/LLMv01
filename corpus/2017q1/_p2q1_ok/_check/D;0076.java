
public class Exercicio1 {

    public static void main(String[] args) {
        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int[6];

        ImprimeVetor(A);
        ImprimeVetor(B);

        C = MaioresElementos(A,B);
        ImprimeVetor(C);  
    }

    public static void ImprimeVetor(int Vet1[]){
        int cont;
        for (cont = 0; cont < 6; cont++){
            System.out.print(Vet1[cont]+" ");
        }
        System.out.println("");
    }

    public static int [] MaioresElementos(int Vet1[], int Vet2[]){
        int cont, aux;

        for (cont = 0; cont < 6; cont++){
            if (Vet1[cont] >= Vet2[cont]){
                aux = Vet1[cont];
            }
            else {
                aux = Vet2[cont];
            }
        }
        return Vet3[];
    }
}
