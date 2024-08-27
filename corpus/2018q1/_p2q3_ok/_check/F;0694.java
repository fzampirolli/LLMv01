
import java.util.Scanner;

public class P203 {

    public static void criaMatriz(int v[],int tam){

        int l,c,x=0;
        int m[][]=new int[tam][tam];

        for(l=0;l<tam;l++){
            for(c=0;c<tam;c++){
                m[l][c]=x;
                x++;
            }
        }

    }

    public static void mostraMatriz(int m[])

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int tam=3,x=0,i;
        int v[]=new int[tam];

        for(i=0;i<tam;i++){
            v[i]=x;
            x++;
        }

        for(i=0;i<tam;i++){
            System.out.println(" "+v[i]);
        }
    }

}
