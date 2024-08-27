
import java.util.Scanner;
public class P201 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

	int A[]={-62,8,98,75,26,77};
        int B[]={-102,0,102,0,26,79};
        int C[] = new int [6];

	ImprimeVetor(A);
	ImprimeVetor(B);

	C=MaioresElementos(A,B);
	ImprimeVetor(C);

	}
	public static void ImprimeVetor(int Vet1[]){
	int i;

	for(i=0;i<6;i++){
	System.out.println("\n"+ Vet1[i]);
		}
	}

	public static int [] MaioresElementos(int Vet1[], int Vet2[]){
	int i;
        int Vet3[] = new int [6];

		for(i=0;i<6;i++){
			if (Vet1[i]>Vet2[i]){
				Vet3[i]=Vet1[i];
			}
			else{
				Vet3[i]=Vet2[i];
			}
		}
		return Vet3;
	}
}
