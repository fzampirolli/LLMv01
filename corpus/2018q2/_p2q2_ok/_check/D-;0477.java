
import java.util.*;

public class P22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String A,B,C;
        int setor,K=1,L=2, i=40, j=60;
        char opcao;
        int W[][] = new int[i][j];
        int Z[][] = new int[i][j];
        System.out.println("MENU, digite sua opção: ");
        System.out.println("A)Vender ingressos");
        System.out.println("B)Exibir total de ingressos vendidos");
        System.out.println("C)Encerrar o programa");
        opcao = entrada.nextLine().charAt(0);
        int f,c,aux;
        if(opcao=='A'){
            System.out.println("Digite o setor desejado, 1 ou 2: ");
            setor = entrada.nextInt();
            if(setor==K){
            System.out.println("Digite a fileira desejada"); 
            f = entrada.nextInt();
            System.out.println("Digite a cadeira desejada"); 
            c = entrada.nextInt();
            f=i;
            c=j;
            aux = W[f][c];
            System.out.println(W[i][j]);
            System.out.println("Cadeira: " + W[f][i] + "vendida");
            }
            if(setor==L){
            System.out.println("Digite a fileira desejada"); 
            f = entrada.nextInt();
            System.out.println("Digite a cadeira desejada"); 
            c = entrada.nextInt();
            aux = Z[f][c];
            System.out.println(Z[f][i]);
            System.out.println("Cadeira: " + Z[f][i] + "vendida");
            }  
        }
        if(opcao=='B'){

        }
        if(opcao=='C'){
            System.out.println("Programa encerrado.");
        }
    }
}
