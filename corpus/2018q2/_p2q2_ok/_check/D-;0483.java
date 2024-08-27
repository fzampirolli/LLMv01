
import java.util.Scanner;

public class Questao2 {
 public static void main (String[] args){
     Scanner ler = new Scanner(System.in);
     int l = 40, c = 60;
     char set1[][] = new char [l][c];
     char set2[][] = new char [l][c];
     int i, j = 0, ent;

     for (i=0; i<l; i++){
        for(j=0; j<c; j++){
            set1[i][j]='v';
            set2[i][j]='v';
            System.out.print(set1[i][j]+" ");
           System.out.print(" "+set2[i][j]);
               System.out.println(" \n ");
             }
            }

     System.out.println("Digite o setor 1 ou setor 2");
     ent = ler.nextInt();
     if(ent == 1){
         set1[i][j] = (char) ent;
     }
     if(ent == 2){
         set2[i][j] = (char) ent;
    }
     else{
         System.out.println("Digite um setor válido, entre 1 e 2");
     }
 }   
}
