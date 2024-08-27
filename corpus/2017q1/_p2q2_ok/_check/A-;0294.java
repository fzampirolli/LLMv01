
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        float soma = 0;
        String A[] = new String[306];
        float B[] = new float[306];
        int C[] = new int[306];
        Scanner leia = new Scanner(System.in);

        C[300] = 300;
        C[301] = 301;
        C[302] = 302;
        C[303] = 303;
        C[304] = 304;
        C[305] = 305;

        A[300] = "Pão de Queijo";
        A[301] = "Bauru";
        A[302] = "Cachorro quente";
        A[303] = "Cheeseburguer";
        A[304] = "Suco";
        A[305] = "Refrigerante";

        B[300] = (float) 1.30;
        B[301] = (float) 1.40;
        B[302] = (float) 1.50;
        B[303] = (float) 1.50;
        B[304] = (float) 2.20;
        B[305] = (float) 1.00;

        for (int i = 300; i <306 ; i++) {
            System.out.println(C[i] + " " + A[i] + " " + B[i] + "\n");
        }

        System.out.println("Digite o código do produto (300 a 305): ");
        int n = leia.nextInt();
        while (n>0){

                System.out.println("Digite a quantidade do produto: ");
                int m = leia.nextInt();
                System.out.println("Digite o código do produto (300 a 305):  ");
                n = leia.nextInt();

                soma = soma + B[n] * m;
            }

                System.out.println("Total da compra: " + soma);

            }
        }
