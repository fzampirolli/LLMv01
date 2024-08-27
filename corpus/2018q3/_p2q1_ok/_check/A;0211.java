
import java.util.*;
public class P2PIEX1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n, aux;
        System.out.println("Digite um número n: ");
        n=s.nextInt();
        int v[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o termo "+i+" de v:");
            v[i]=s.nextInt();
            }
        for(int j=1;j<n/2;j++){
            if(j%2!=0){
                if(v[j]<v[n-(j+1)]){
                  aux = v[j];
                  v[j] = v[n-(j+1)];
                  v[n-(j+1)] = aux;
                }
            }
        }
        System.out.println("");
        for(int k=0;k<n;k++){
            System.out.println(v[k]);
        }
    }

}
