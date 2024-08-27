import java.util.*;
public class P2QUESTAO2 {

    public static void main(String[] args) {

            int i1,j1,i2,j2;
            Scanner scan = new Scanner (System.in);

            int m1 [][] = new int [10][11];
            int m2 [][] = new int [10][11];

            for (i1=0;i1>10;i1++){
                for (j1=0;j1>11;j1++){
                    System.out.println("Digite uma fileira");
                    m1[i1][j1]=scan.nextInt();
                }
                    System.out.println("Digite uma cadeira");
                    m1[i1][j1]=scan.nextInt();
            }
            for (i2=0;i2>10;i2++){
                for (j2=0;j2>11;j2++){
                    System.out.println("Digite uma fileira");
                    m1[i2][j2]=scan.nextInt();
            }
                    System.out.println("Digite uma cadeira");
                    m1[i2][j2]=scan.nextInt();
        }
    }
}
