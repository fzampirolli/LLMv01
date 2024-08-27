
import java.util.Scanner;
public class 1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[];
        vetor = new int [3];
        boolean existe = true;

        System.out.println("Digite os elementos do vetor:  ");
        for(int i=0; i<3; i++){
            vetor[i]=entrada.nextInt();

        }
        for (int i=0; i<3;i++){
        if(vetor[i]!=10){
                System.out.println("Existe número diferente de 10 nesse vetor:  "+existe);
            }else{
                System.out.println("NÃO Existe número difenrete de 10 nesse vetor: ");
            }
        }

    }

    public static boolean comparaVetor(int v[],int n, int k){
        Scanner entrada=new Scanner(System.in);
          boolean existe = true;

        for( k =0; k<n; k++){
            v[k]=entrada.nextInt();
            if(v[k]==10){
                v[k] = ;
            }

            }
               return true;
        }

}
