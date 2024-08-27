
import java.util.Scanner;

public class P2Q2 {

    public static void main(String[] args) {

         Scanner entrada= new Scanner(System.in);
         char Sec1[][] = null, Sec2[][] = null;

         int i,j, sec, cont=0;

         for(i=0; i<10; i++){
            for (j=0; j<11; j++){
                Sec1[i][j]='v';

            }
         }

         System.out.println("A) para vender o ingresso");
         System.out.println("B )Exibir total de ingressos vendidos");
         System.out.println("C) para sair");

        String aux = entrada.next();
        String a = null;

        if ("a".equals(aux)){
        System.out.println("diga o setor da venda");
        sec=entrada.nextInt();
        if (sec==1){
            System.out.println("diga a fileira da venda");
            i=entrada.nextInt();
            System.out.println("diga a coluna da venda");
            j=entrada.nextInt();
            Sec1[i][j]='p';
        }
        if (sec==2){
             System.out.println("diga a fileira da venda");
            i=entrada.nextInt();
            System.out.println("diga a coluna da venda");
            j=entrada.nextInt();
            Sec2[i][j]='p';
        }

        }
        if ("b".equals(aux)){
            for(i=0; i<10; i++){
            for (j=0; j<11; j++){
                if(Sec1[i][j]=='v'){
                cont++;
                }
                if(Sec2[i][j]=='v'){
                cont++;
                }

            }
         }
        System.out.println(" numero de ingressos vendidos ="+cont);

        }

        if ("c".equals(aux)){
        System.out.println("programa encerrado");

        }

    }

}
