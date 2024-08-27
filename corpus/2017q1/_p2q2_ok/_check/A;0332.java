
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int Cod[] = {300,301,302,303,304,305};
        int qnt=0;
        int cod;
        int choice=0;
        float total=0;
        String[] Item = new String[6];
        double Preco[] = {1.3, 1.4, 1.5, 1.4, 2.2, 1.0};

        Item[0] = "Pão de Queijo";
        Item[1] = "Bauru";
        Item[2] = "Cachorro Quente";
        Item[3] = "Cheeseburger";
        Item[4] = "Suco";
        Item[5] = "Refrigerante";

        ImprimeVetor(Cod, Item, Preco);

        System.out.println();
        System.out.println("Digite o código do produto (300 a 305):");
        cod = teclado.nextInt();        

        while(cod != 0){
            System.out.println("Digite a quantidade do produto:");
            qnt = teclado.nextInt();

            for(int i=0; i < 6; i++){
                if (Cod[i] == cod){
                    choice = i;
                }            
            }

            total += qnt * Preco[choice];

            System.out.println("Digite o código do produto (300 a 305):");
            cod = teclado.nextInt();
        }

        System.out.println("Total da compra: " + total);

    }

    public static void ImprimeVetor(int Vet1[], String Vet2[], double Vet3[]){
            System.out.println("Código" + "Item" + "Preço Unitário");
            for (int i = 0; i <6; i++){
                System.out.print(Vet1[i] + " ");
                System.out.print(Vet2[i] + " ");
                System.out.print(Vet3[i] + " ");
                System.out.println();
            }
    }

}
