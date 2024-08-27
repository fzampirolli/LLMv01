
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
     Scanner e = new Scanner(System.in);
     int L,C;
     System.out.print("Digite o número de linhas: ");
          L = e.nextInt();
     System.out.print("Digite o número de Colunas: ");
          C = e.nextInt();
     int A[][] = new int[L][C];
     int B[][] = new int[L][C];

     A = LeMatriz(L,C);
     System.out.println("a) Matriz A ");
     ImprimeVetor(A,L,C);
     B = MaiorElemento(A,L,C);
     System.out.println("b) Matriz B ");
     ImprimeVetor(B,L,C);
    }

     public static void ImprimeVetor(int Vet1[][],int L,int C){
        String s = "";
        for(int i = 0; i<L;i++){
            for(int x = 0;x<C;x++){
            s += Vet1[i][x]+" \t";
        }
        s += "\n";
        }
        System.out.println(s);
    }

    public static int[][] MaiorElemento( int Vet1[][],int L,int C){
            int v[][] = new int[L][C];
            int m =0;

            for(int i =0; i<L;i++){
                for(int x = 0;x<C;x++){
                 if((i>(L/2)-1) && (x>(C/2)-1)){
                    if(Vet1[i][x] > m){
                        m = Vet1[i][x];
                    }
                 }
        }
            }

            for(int i =0; i<L;i++){
                for(int x = 0;x<C;x++){
                 if((i>(L/2)-1) && (x>(C/2)-1)){
                 v[i][x] = m;
                 }  else{
                 v[i][x] = 0;
                 }
        }
            }
            return v;
        }
    public static int[][] LeMatriz(int L, int C){
        Scanner e = new Scanner(System.in);
        int Vet1[][] = new int[L][C];
        for(int i = 0; i<L;i++){
         System.out.print("Digite os valores da linha "+ (i+1)+": ");
        for(int x = 0;x<C;x++){
            Vet1[i][x] = e.nextInt();
        }
     }
        return Vet1;
    }

}
