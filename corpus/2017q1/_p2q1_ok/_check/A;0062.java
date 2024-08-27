
public class Questao1P2 {

    public static void main(String[] args) {
        int A[] = {-62,8,98,75,26,77};
        int B[] = {-102,0,102,0,26,79};
        int C[] = new int[6];
        ImprimeVetor(A);
        ImprimeVetor(B);
        C = MaioresElementos(A,B);
        ImprimeVetor(C);
    }
    public static void ImprimeVetor(int Vet1[]){
        int n= Vet1.length;
        for(int i=0;i<n;i++){
            System.out.print(Vet1[i]+" ");
        }
        System.out.print("\n ");
    }
    public static int[] MaioresElementos(int Vet1[], int Vet2[]){
      int m = Vet1.length;
      int v[] = new int [m];
      for (int i=0;i<m;i++){
          if(Vet1[i]>Vet2[i]){
              v[i]=Vet1[i];
          }
          else{
              v[i] = Vet2[i];
          }
      }
      return v;
    }  
}    
