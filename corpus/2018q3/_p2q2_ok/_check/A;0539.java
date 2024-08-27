
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       System.out.println("Tamanho");
      int n = scan.nextInt();
      int A[][] = new int [n][n];
      int i, j, contp=0, contb=0;
       for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
           A[i][j] = scan.nextInt();
            }
        }
       for(i = 0; i < n; i++){
                if (i % 2 == 0){
                    for(j = 0; j < n; j = j + 2){
                    contp = A[i][j]+ contp;  
                    }
                } else {
                for(j = 1; j < n; j = j + 2){
                    contp = A[i][j]+ contp;  
                    }
                }  
            }
        for(i = 0; i < n; i++){
                if (i % 2 == 1){
                    for(j = 0; j < n; j = j + 2){
                    contb = A[i][j]+ contb;  
                    }
                } else {
                for(j = 1; j < n; j = j + 2){
                    contb = A[i][j]+ contb;  
                    }
                }  
            }
       if (contp > contb){
       System.out.println(contp + " " + contb + " 0");    
       } else if (contp == contb){
      System.out.println(contp + " " + contb + " 2");       
       } else {
     System.out.println(contp + " " + contb + " 1");   
       }
    }

}
