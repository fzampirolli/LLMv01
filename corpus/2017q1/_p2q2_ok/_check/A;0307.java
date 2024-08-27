
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Código -      Item       - Preço Unitario");
        System.out.println("300    - Pão de Queijo   -    1,30");
        System.out.println("301    -     Bauru       -    1,40");
        System.out.println("302    - Cachorro Quente -    1,50");
        System.out.println("303    -  CheeseBurguer  -    1,50");
        System.out.println("304    -      Suco       -    2,20");
        System.out.println("305    -  Refrigerante   -    1,00");
        int A[], C[];
        double soma=0;
        A = new int[6];
        C = new int[6];
        for(int i=0; i<6; i++){
            System.out.println("Digite o código do produto(300 a 305): ");
            A[i] = entrada.nextInt();
            if(A[i]!=0){
                System.out.println("Digite a quantidade do produto: ");
                C[i] = entrada.nextInt();
            }
            if(A[i]==300){
                soma = soma + C[i]*1.3;
            }
            if(A[i]==301){
                soma = soma + C[i]*1.4;
            }
            if(A[i]==302){
                soma = soma + C[i]*1.5;
            }
            if(A[i]==303){
                soma = soma + C[i]*1.5;
            }
            if(A[i]==304){
                soma = soma + C[i]*2.2;
            }
            if(A[i]==305){
                soma = soma + C[i]*1;
            }
            if(A[i]==0){
            System.out.println("O valor total da compra foi: "+soma); 
            break;
            }

    }

}
