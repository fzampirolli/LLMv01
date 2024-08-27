
import java.util.Scanner;

public class Exercicio02 {

    public static void  main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int n,somabranco=0, somapreto=0, r=0;

       System.out.println("Digite o valor de n: ");
        n = entrada.nextInt();

         int matriz[][] = new int[n][n];
            for(int i=0;i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.println("matriz["+i+"]["+j+"] = ");
                matriz[i][j] = entrada.nextInt();
         }
            }

                        for(int i=0;i<n;i++){
            for(int j = 0; j<n;j++){
        somabranco = matriz[i][j] +matriz[i-1][j-1];
                somapreto = matriz[i-1][j] + matriz[i-1][j-1];
            }
                        }
                if (somabranco>somapreto){
                    r=0;
            }else if(somapreto>somabranco){
             r=1;  
            }else{
               r=2;
            }
                System.out.print("resposta =\n"+somabranco+""+somapreto+""+r); 
           }   
     }
