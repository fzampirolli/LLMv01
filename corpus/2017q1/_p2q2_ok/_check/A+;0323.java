
import javax.swing.JOptionPane;

public class Questao2 {

    public static void main(String[] args) {
       int codProduto, quant;
       int vetCod[] = {100,101,102,103,104,105};
       double total = 0;
       String vetItem[] = {"Pão de queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigerante"};
       double vetPreco[] = {1.10,1.30,1.50,1.30,2,1};

       mostrarCardapio(vetCod, vetItem, vetPreco);
       System.out.println("----------------------");

       codProduto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto: "));
       quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade: "));

       while(codProduto != 0){

        total = total + pegarCodigo(codProduto, vetCod, vetPreco, quant);

        codProduto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto: "));
        quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade: "));
       }

       mostrarCardapio(vetCod, vetItem, vetPreco);
       System.out.println("Total da compra: "+total);

    }
    public static void mostrarCardapio(int vetorCod[],String vetorItem[],double vetorPreco[]){

        for(int i = 0;i < 6 ; i++){
            System.out.print(vetorCod[i]);
            System.out.print(" ");
            System.out.print(vetorItem[i]);
            System.out.print(" ");
            System.out.println(vetorPreco[i]);
        }

    }

    public static double pegarCodigo(int codProduto,int vetorCod[],double vetorPreco[],int quant){
        double soma = 0;
        for(int i = 0;i < 6 ; i++){
            if(codProduto == vetorCod[i]){

                soma = soma + (vetorPreco[i] * quant);

            }
        }
        return soma;
    }

}
