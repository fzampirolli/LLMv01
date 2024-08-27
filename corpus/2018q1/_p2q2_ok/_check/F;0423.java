
import java.util.Scanner;

public class questao2 {
Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aqui o tamanho do vetor");
        int k = sc.nextInt();
        int aux = k;
        int tam[] = new int[k];
        for(int i=0;i<tam.length;i++){
            tam[i]=k;
            k=k-1;
        }
      k = aux;
     int mat[][] = new int [aux][aux];
        for(int l=0;l<mat.length;l++){
            for (int c=0;c<mat.length;c++){
                if(c==l){
                    mat[c][l]=tam[k];

                }
                else{
                    mat[c][l]=sc.nextInt();

                }
            }
        }     
     System.out.println(mat[2][3]);       

    }

}
