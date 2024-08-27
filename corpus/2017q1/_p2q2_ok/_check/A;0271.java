
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A[] = {100, 101, 102, 103, 104, 105};
        String B[] = {"Pão de Queijo", "Bauru", "Cachorro Quente", "Cheeseburger", "Suco", "Refrigerante"};
        double C[] = {1.1, 1.3, 1.5, 1.3, 2.0, 1.0};
        int cod = 1;        
        double SomaP=0;
        int SomaQ;

            System.out.print("O cardápio é:\n");
            for (int j = 0; j < 6; j++) {
                System.out.print(A[j] + "   ");
                System.out.print(B[j] + "   ");
                System.out.print(C[j] + "   ");
                System.out.println();
            }

           System.out.print("\nDigite o Código do produto [100 a 105]: ");
                cod = entrada.nextInt(); 
           while (cod>0){ 

            System.out.print("\nDigite a quantidade do produto: ");
                int quant = entrada.nextInt();

                if(cod==100){
                    cod=1;
                } else if (cod==101){
                    cod=2;
                }else if (cod==102){
                    cod=3;
                }else if (cod==103){
                    cod=4;
                }else if (cod==104){
                    cod=5;
                }else if (cod==105){
                    cod=6;
                }

                SomaP = SomaP + C[cod-1]*quant;
                System.out.print("\nDigite o Código do produto [100 a 105]: ");
                cod = entrada.nextInt(); 
           }
           System.out.print("\nTotal da compra é R$:"+SomaP + "\n");

        }

    }
