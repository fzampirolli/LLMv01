
import java.util.Scanner;

public class Questao2Melhorada {

    public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
       Scanner B = new Scanner (System.in);

       int A[][]= new int [10][11];
       int lugares=440;
       int i,j = 0,v=0,p=-1,qnt=0;

       for(i=0;i<10;i++){
           for(j=0;j<11;j++){
               while(A[i][j]==v){
                   System.out.println("Cadeiras vazias");
               }
           }
         }
       while(A[i][j]==v){

        System.out.println("=======Menu======= /n A) Vender ingresso /n B)Exibir o total de ingressos vendidos /n C) Encerrar o programa");

       if(A.equals(B)){
           System.out.println("Digite a fileira" +i+ "desejada e da coluna"+j);
           A[i][j]=sc.nextInt();
           if(A[i][j]==v){

               qnt++;
           }else{
               System.out.println("Cadeira já foi vendida");
           }

       }
       if(B.equals(B))
            System.out.println("Total de ingressos vendidos é:"+qnt);
    }

} 
}
