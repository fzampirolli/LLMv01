
public class Questao1 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);

        int nMaior = 0;
        final int MAX = 50;
        int V[] = new int [MAX];
        System.out.println("Preencher Vetor: ");
        for (int i=0; i<MAX; i++) {
            System.out.println(V[i] = (int)(Math.random()*72-21));
        }
        System.out.println("\nElemento índice 8: " + V[8]);
            for (int i=9; i<MAX; i++) {    
                if (V[i] > V[8]) {   
                    nMaior++;
                }
            }
        System.out.println("\nA quantidade de elementos maiores que o contido no V[8] é " + nMaior);
        System.out.println("\nDigite um número inteiro: ");

    }
}
