
import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        System.out.println("Quantidade de linhas:");
        int l=ent.nextInt(); 
        System.out.println("Quantidade de colunas:");
        int c=ent.nextInt();

        int A[][]=Lematriz(l,c);
        MatrizMode(A);

    }

    public static int[][] Lematriz(int l, int c){
        Scanner ent=new Scanner(System.in);
        int m[][]=new int[l][c];
            for(int i=0;i<l;i++){
                for(int j=0;j<c;j++){
                    System.out.println("Digite termo da linha"+i+ " coluna "+j+":");
                    m[i][j]=ent.nextInt();
                }
            }
            return m;
    }

    public static int[][] MatrizMode(int m[][]){
            int B[][]=new int[m.length][m[0].length];
            int maior=0;
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    if(i>(m.length/2)){
                        if(j>m[0].length/2){
                            if(maior<m[i][j]){
                                maior=m[i][j];    
                            }
                        }
                    }
                }
            }
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    if(i>(m.length/2)){
                        if(j>m[0].length/2){
                            B[i][j]=maior;
                        }
                    }
                    else {
                        B[i][j]=0;
                    }
                }
            }
            return B;
    }

    public static void ImprimeMatriz(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]);                
            }            
        }
    }
}
