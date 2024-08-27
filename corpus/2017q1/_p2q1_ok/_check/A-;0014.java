
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int A[] = {-62,8,98,75,26,77};
    int B[] = {-102,0,102,0,26,79};
    int C[] = new int[6];
    System.out.println("O vetor A é: ");
    ImprimeVetor(A);
    System.out.println("O vetor B é: ");
    ImprimeVetor(B);

    C = MaioresElementos(A,B);
    System.out.println("O vetor C é: ");
    ImprimeVetor(C);
    }

public static void ImprimeVetor(int Vet1[]){
    for(int i = 0; i<6; i++){
        System.out.println("Na posição ("+i+") o vetor tem valor: "+ Vet1[i]);
    }
}

public static int [] MaioresElementos(int Vet1[], int Vet2[]){
    int x = 0;
    int C[] = new int[6];
    for(int i=0;i<6;i++){
        if(Vet1[i]>Vet2[i]){
            C[i] = Vet1[i];}
        if(Vet2[i]>Vet1[i]){
            C[i] = Vet2[i];
        }
        if(Vet1[i]==Vet2[i]){
            C[i] = Vet1[i];
        }
    }
        return C;
}
