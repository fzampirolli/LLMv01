
import java.util.Scanner;
public class Q3p2bruno {

    public static void main(String[] args) {
      lerA();
    }
    public static void lerA(){
        System.out.println("digite o numero de linhas:\n");
        Scanner input = new Scanner(System.in);
         int L= input.nextInt();
         System.out.println("digite o numero de colunas:\n");
         int C= input.nextInt();

         int A[][] = new int[L][C];

            for (int i = 0; i < L; i++) {
                for (int j = 0; j <C ; j++) {
               System.out.println("digite os valor de A na linha"+(i+1)+" e coluna"+(j+1));
                    A[i][j]= input.nextInt();
             }
            }
             for (int i = 0; i <L ; i++) {
                 System.out.println();
                 for (int j = 0; j < C; j++) {   
                 System.out.print("("+i+"|"+j+"): "+A[i][j]+"\t");

                 }
             }

        }
    }
