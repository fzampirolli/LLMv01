
import java.util.Scanner;
public class AlbadoQuestao2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        int quant, soma=0;
        int codigo[]= {100, 101, 102, 103, 104, 105};
        String item []= {Pão de Queijo, Bauru, Cachorro Quente, Cheeseburguer, Suco, Refrigerante};
        double preco[]= {1.10, 1.30, 1.50, 1.30, 2.00, 1.00};

        ImprimeCodigo (codigo[]);
        ImprimeItem (item[]);
        ImprimePreco (preco[]);

    public static void ImprimeCodigo (int Vet1[]){
    System.out.println ("Código");
    for (int i=0; i<6; i++) {
    System.out.println(Vet1[i]+"");
     }
    }

    public static void ImprimeItem (int Vet2[]){
    System.out.println ("Item");
    for (int i=0; i<6; i++) {
    System.out.println(Vet2[i]+"");
     }
    }

     public static void ImprimePreco (int Vet3[]){
    System.out.println ("Preço");
    for (int i=0; i<6; i++) {
    System.out.println(Vet3[i]+"");
     }
    }

    while (codigo!=0){
    for (int i=0; i<6; i++){
    System.out.println ("Insira o código do item:"+codigo[i]);
    System.out.println ("Insira a quantidade do item"+quant);
    soma=quant*preco
    }
}         
   System.out.println ("Total da Compra:"+soma);

  }

}
