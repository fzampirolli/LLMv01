
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod, qtd; 
        double total = 0;

        String A[] = {"Código", "Item           ", "Preço Unitário"};
        String B[] = {"300   ", "Pão de Queijo  ", "1.30"};
        String C[] = {"301   ", "Bauru          ", "1.40"};
        String D[] = {"302   ", "Cachorro Quente", "1.50"};
        String E[] = {"303   ", "Cheeseburguer  ", "1.50"};
        String F[] = {"304   ", "Suco           ", "2,20"};
        String G[] = {"305   ", "Refrigerante   ", "1.00"};
        double Bb[] = {300, 1.30};
        double Cc[] = {301, 1.40};
        double Dd[] = {302, 1.50};
        double Ee[] = {303, 1.50};
        double Ff[] = {304, 2.20};
        double Gg[] = {305, 1.00};

        ImprimeVetor(A);
        ImprimeVetor(B);
        ImprimeVetor(C);
        ImprimeVetor(D);
        ImprimeVetor(E);
        ImprimeVetor(F);
        ImprimeVetor(G);

        System.out.println("");

        do{
        System.out.print("Digite o código do produto (300 a 305): ");
        cod = scan.nextInt();    

        if (cod != 0){
            System.out.print("Digite quantidade do produto: ");
        qtd = scan.nextInt();

        if (cod == Bb[0]){
            total += (Bb[1] * qtd); 
        }
        else if (cod == Cc[0]){
            total += (Cc[1] * qtd); 
        }
        else if (cod == Dd[0]){
            total += (Dd[1] * qtd); 
        }
        else if (cod == Ee[0]){
            total += (Ee[1] * qtd); 
        }
        else if (cod == Ff[0]){
            total += (Ff[1] * qtd); 
        }
        else if (cod == Gg[0]){
            total += (Gg[1] * qtd); 
        }      
        }
        }
        while (cod > 299 && cod <306);

        System.out.println("");
        System.out.println("Total da Compra: " + total);
    }

   public static void ImprimeVetor(String Vet1[]){
        for (int i = 0; i < 3; i++) {
            System.out.print(Vet1[i] + "   ");
        }
        System.out.println("");
    } 
}
