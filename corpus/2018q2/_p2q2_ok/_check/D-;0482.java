
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

     int i,j;
     char v = 0;
     char setor1[][] = new char [10][11];
     for (i=0;i<10;i++){
         for (j=0;j<11;j++){
             setor1[i][j] = v;
         }
     } 
       int l;
       int c = 0;
     char setor2[][] = new char [10][11];
     for (l=0;l<10;l++){
         for (j=0;j<11;j++){
             setor2[l][c] = v;
         }
     }
     int setor; 
     int cont=0;
     Scanner fl = new Scanner(System.in);
     System.out.println("deseja o setor 1 ou 2");
     setor = fl.nextInt();
     if (setor == 1){   

        System.out.println("informe o numero da fila");
        i = fl.nextInt();

        System.out.println("infome o numero da cadeira");
        j = fl.nextInt();
        if (setor1[i][j] == v){
            char p ;
            setor1[i][j] == p;
            System.out.println("a cadeira está vazia");

             else{ (System.out.println("a cadeira ja foi vendida"))
                     } 
             cont = cont+1;

    }  else{
        System.out.println("informe o numero da fila");
        l = fl.nextInt();
        System.out.println("infome o numero da cadeira");
        j = fl.nextInt();
       cont = cont+1;
    }
}
}
}
