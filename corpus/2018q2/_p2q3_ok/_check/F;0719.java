
import java.util.Scanner;

public class Ex3ten {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A[][] = new int [150][4];

        int conceito;
        for(int i =0; i<150;i++){
            for(int j=0; j<4; j++){
                System.out.println("Digite o conceito:");
                conceito = leia.nextInt();

            }
        }
    }
     static void GeraMat(char Mat[][]) {
        char conceitos[] = {'A', 'B', 'C', 'D', 'F'};
        int i, j, valor;

        for (i = 0; i < 150; i++) {
            for (j = 0; j < 4; j++) {
                valor = (int) (Math.random() * 5);
                Mat[i][j] = conceitos[valor];

            }
        }

    }
public static void GeraMedia(int[]vet){
    Scanner leia = new Scanner(System.in);
    for(int i=0;i<150;i++){
        System.out.println("Digite o valor:");
        vet[i]= leia.nextInt();
    }
}
}
