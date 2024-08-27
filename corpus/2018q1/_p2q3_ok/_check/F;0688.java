
import javax.swing.JOptionPane;
public class P2questao3 {

    public static void main(String[] args) {
        int T;
          int m[][]= new int [T][T];
         T= Integer.parseInt(JOptionPane.showInputDialog("Escolha um tamanho para o vetor"));
          int V[]=new int [T];
          for (int i=0; i<T; i++){
          V[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valores para o vetor"));
          }
          m=Matriz(V,T);
            for (int i=0;i<T;i++){
                for (int j=0;j<T;j++){
        JOptionPane.showMessageDialog(null,"elementos da matriz" + m[i][j]);
            } 
            }
    }

 public static int[][] Matriz(int v[],int T){
    int m[][]= new int [T][T];
    for(int i=0; i<T; i++){
         for (int j=0;j<T;j++){
         if (i==0 && j==0|| i== 2 && j==2 || i==3 && j=3){
             m[i][j]=v[i];
         }
         else{
          m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite valores para a matriz"));
         }

    }

        return m;

}
}
