
import java.util.Scanner;

public class questaotres {

    public static void main(String[] args) {
        int A[][] = new int[4][4]; 
        int B[][] = new int[4][4];
        Leia(A);

        Imprime(A);
    }

    public static void Leia(int LER[][]) {
        int loopl, loopc;
        Scanner c = new Scanner(System.in);
        System.out.println("Entre a Matriz");
        for (loopl = 0; loopl < 4; loopl++) {
            for (loopc = 0; loopc < 4; loopc++) {
                LER[loopl][loopc] = c.nextInt();
            }

        }

    }

    public static void Gerar(int B[][]) { 
        int loopl, loopc;
        Scanner c = new Scanner(System.in);
        System.out.println("Entre a Matriz");
        for (loopl = 0; loopl < 4; loopl++) {
            for (loopc = 0; loopc < 4; loopc++) {
                LER[loopl][loopc] = c.nextInt();
            }

        }

    }
    public static void Imprime(int TEMPO[][]) {
        int loopl, loopc;
        Scanner c = new Scanner(System.in);
        System.out.println("Entre a Matriz");
        for (loopl = 0; loopl < 4; loopl++) {
            for (loopc = 0; loopc < 4; loopc++) {
               System.out.println(TEMPO[loopl][loopc]); 
            }

        }

    }

}
