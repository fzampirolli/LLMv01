
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, codigo, qtd;

        int A[] = new int [6];

        float C[] = new float [6];

        System.out.println("Códigos: ");
        for(i=0;i<6;i++){
            A[i]=entrada.nextInt();
        }

        System.out.println("Preços: ");
        for(i=0;i<6;i++){
            C[i]=entrada.nextFloat();
        }

        for(i=0;i<6;i++){
        System.out.println("Código: " + A[i] + " Preço: " + C[i]);
        } 

        float total=0, valorproduto=0;

        do{
            System.out.println("Digite o código do produto(300-305): ");
            codigo=entrada.nextInt();

            System.out.println("Quantidade: :");
            qtd=entrada.nextInt();

            for(i=0;i<6;i++){
            if(codigo == A[i]){
              codigo=A[i];
              valorproduto = qtd*C[i];
            }

}            
            total=total+valorproduto;

        }
        while(codigo!=0);

        System.out.println("Total da compra: " + total);

    }

}
