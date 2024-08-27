
import java.util.*;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s1[][]=new char[11][10];
        char s2[][]=new char[11][10];
         char conceitos[]={'v','p'};
         int s,f,c,contador=220;
         int z;

        for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){
                s1[i][j]= conceitos[0];
        }
    }
         for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){
                s2[i][j]=conceitos[0];
        }
    }

         while(contador>0){
             contador=contador-1;
         System.out.println("o que deseja fazer. 1) vender ingresso. 2)Exibir ingressos vendidos. 3)Encerrar programa ");
         z=sc.nextInt();
         if(z==1){

          System.out.println("\nQual poltrona deseja compra?");
          System.out.println("\nsetor entre 1 e 2?");
          s=sc.nextInt();
          System.out.println("\nfila entre 0 e 9?");
          f=sc.nextInt();
          System.out.println("\ncadeira entre 0 e 10?");
          c=sc.nextInt();

          if(s==1){
              if(s1[f][c]==conceitos[0]){
                  System.out.println("\n o lugar está vazio, compra efetuada");
                  s1[f][c]=conceitos[1];

              }
              else
                  System.out.println("\n o lugar nao está vazio");

          if(s==2){
              if(s1[f][c]==conceitos[0]){
                  System.out.println("\n o lugar está vazio, compra efetuada");
                  s2[f][c]=conceitos[1];

              }
              else
                  System.out.println("\n o lugar nao está vazio");

          }
    }}
         if (z==2){

             System.out.println("\n setro 1");
             for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){

             System.out.println("\n v para vazio p para comprado, fila "+i+" cadeira "+j+" :"+s1[i][j]);
         }
             }
             System.out.println("\n setro 1");
             for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){

             System.out.println("\n v para vazio p para comprado, fila "+i+" cadeira "+j+" :"+s2[i][j]);

            }
            }
}
         if(z==3){
             System.out.println("\n fim do programa");
             contador=0;
         }

         }
    }
}
