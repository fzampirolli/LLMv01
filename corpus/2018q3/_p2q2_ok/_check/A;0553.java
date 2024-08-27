import java.util.Scanner;

public class ex2 {

    public static int[] contGrao(int[] a,int b){
        int i,countPretas=0,countBrancas=0;
        int[] cont = new int[a.length];

        if( b == 0){

            i=0;
            while(i<a.length){
                countPretas+=a[i];
                i+=2;
            }
            i=1;
            while(i<a.length){
                countBrancas+=a[i];
                i+=2;
            }
        }else{
            i=0;
            while(i<a.length){
                countBrancas+=a[i];
                i+=2;
            }
            i=1;
            while(i<a.length){
                countPretas+=a[i];
                i+=2;
            }
        }
        cont[0] = countPretas;
        cont[1] = countBrancas;
        return cont;
    }

    public static void main(String[] args) {

        int n,i,j;
        int[] a = new int[2];
        int tab[][];
        int aux[];
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        tab = new int[n][n];
        aux = new int[n];
        a[0]=0;a[1]=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                tab[i][j] = s.nextInt();
                aux[j]=tab[i][j];
            }
            a[0] += contGrao(aux,i%2)[0];
            a[1] += contGrao(aux,i%2)[1];
        }

        if(a[0]>a[1]){
            System.out.printf(a[0]+" "+a[1]+" "+0+"\n");
        }else if(a[0]<a[1]){
            System.out.printf(a[0]+" "+a[1]+" "+1+"\n");
        }else{
            System.out.printf(a[0]+" "+a[1]+" "+2+"\n");
        }

    }

}
