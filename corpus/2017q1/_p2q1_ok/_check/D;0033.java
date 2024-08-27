
public class Questao1 {

    public static void main(String[] args) {

        int A[] = {0, 7, 32, -12, 42, 100};
        int B[] = {23, -80, 6, -2, 9, 6};
        int C[] = new int [6];

        ImprimeVetor(A);
        ImprimeVetor(B);       

        C = MaioresElementos(A,B);
        ImprimeVetor(C);        

    }

    public static void ImprimeVetor(int Vet1[]) {

    int indice=0;

    while (indice<6){

    System.out.println(Vet1[indice]);

    indice++;

    }

    return int Vet1 [];

    }

    public static int [] MaioresElementos(int Vet1[], int Vet2[]) {

    int indice=0;    

    while (indice<6){

    if (Vet1[indice] > Vet2[indice]){

    int C [indice] = Vet1[indice];

    }

    else {

    int C [indice] = Vet2[indice];

    }

    indice++;

    }

    return int C = [];

    }

    }
