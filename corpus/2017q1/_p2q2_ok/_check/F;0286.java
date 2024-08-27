
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
      int p, q;
      int A[] = {300, 301, 302, 303, 304, 305};
      String B[] = {PãodeQueijo, Bauru, CachorroQuente, Chesseburguer, Suco, Refrigerante,};
      double C[] = {1.30, 1.40, 1.50, 1.50, 2.20, 1.00};

      MostrarCardapio(A, B, C);

      System.out.println("Digite o código do produto (300 a 305): ");
      Scanner entrada = new Scanner(System.in);
      p = entrada.nextInt();
      while (p!=0){
          System.out.println("Digite a quantidade do produto");
          q = entrada.nextInt();
          System.out.println("Digite o código do produto (300 a 305): ");
          p = entrada.nextInt();
      }

      Valorfinal(c,q);

    }
}
