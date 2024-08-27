
import java.util.Scanner;

public class QUESTAO2 {

    public static void main(String[] args) {
        int n = 0;

        int codigo[] , pedido = 0,qtde = 0,indicePedido = 0;
        String[] lanche;
        float[] preco;

        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE A QUANTIDADE DE PRODUTOS DO CARDAPIO: ");
        n = scanner.nextInt();

        codigo = new int[n];
        lanche = new String[n];
        preco = new float[n];

        leCardapio(lanche.length,codigo,lanche,preco);

        do{

            System.out.println("\n\n\n");
            imprimeCardapio(lanche.length, codigo, lanche, preco);
            System.out.print("\nFAÇA SEU PEDIDO: ");
            pedido = scanner.nextInt();

            if(codigoExiste(codigo, pedido)){
                indicePedido = obtemIndice(codigo, pedido);
                System.out.print("DIGITE A QUANTIDADE: ");
                qtde = scanner.nextInt();
                calculaPedido(lanche[indicePedido], codigo[indicePedido], preco[indicePedido],qtde);
            }else{
                System.out.println("DIGITE UM PRODUTO VÁLIDO!!!");
            }
        }while(pedido!=0);
    }

    public static void leCardapio(int nItens,int[] codigo,String[] lanche,float[] preco){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < nItens; i++){
            System.out.print("\nLANCHE " + (i+1) + "\n\n");
            System.out.print("DIGITE O NOME DO LANCHE: ");
            lanche[i] = scanner.nextLine();
            System.out.print("DIGITE O CODIGO DO LANCHE: ");
            codigo[i] = scanner.nextInt();
            System.out.print("DIGITE O PRECO DO LANCHE: ");
            preco[i]=scanner.nextFloat();
            scanner.nextLine();
        }
    }

    public static void imprimeCardapio(int nItens,int[] codigo,String[] lanche,float[] preco){

        System.out.println("CARDAPIO");
        for(int i = 0; i < nItens; i++){
            System.out.print("\n" + codigo[i]+"  " + lanche[i] + "  " + preco[i]);
        }
    }

    public static void calculaPedido(String cardapio, int codigo,float preco, int quantidade){
        float precoTotal = quantidade * preco;

        System.out.println("\n\n*****************VOCÊ PEDIU " + quantidade + " de " + codigo + " " + cardapio + " POR R$ " + precoTotal + " *****************");
    }

    public static boolean codigoExiste(int[] codigo,int pedido){
        boolean codigoExiste = false;

        for(int i=0; i<codigo.length;i++){
            if(codigo[i]==pedido){
                codigoExiste=true;
            }
        }

        return codigoExiste;
    }

    public static int obtemIndice(int[] codigo,int pedido){
        int codigoExiste = 0;

        for(int i=0; i<codigo.length;i++){
            if(codigo[i]==pedido){
                codigoExiste=i;
            }
        }

        return codigoExiste;
    }

}
