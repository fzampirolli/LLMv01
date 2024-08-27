
import java.util.*;

public class PROVAQ2 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        int k=4; int p=4;
        int i,j;
        char mat[][]= new char [k][p], w;
        for(int q=0; q<k;q++){
            for(int h=0; h<p; h++){
            System.out.println("Digite p ou v");
            mat[q][h]=entrada.next().charAt(0);
            }
        }
        System.out.println("a) Vender ingressos:");
        System.out.println("b) Exibir total de ingressos");
        System.out.println("c) SAIR");
        w=ch.next().charAt(0);
        if (w=='a'){
            System.out.println("Digite a fileira 0 a 3");
            i=entrada.nextInt();
            System.out.println("Digite o numero da cadeira (0 a 3:");
            j=entrada.nextInt();
            if( mat[i][j]!= 'p'){
                System.out.println("Lugar vazio, pode comprar!");
            }
        }
        else if(w=='b'){
            for(i=0; i<k; i++){
                for(j=0; j<k; j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("fim");
        }
    }

}
