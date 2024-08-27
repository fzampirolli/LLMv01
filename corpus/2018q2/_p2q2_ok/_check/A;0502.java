
import java.lang.Math;
import java.util.Scanner;

public class 2 {

    public static void main(String[] args) {
        int contVendas, opcaoMenu;

        String[][] setor_A, setor_B;
        setor_A = new String[40][60];
        setor_B = new String[40][60];
        for (int i=0;i<40;i++){
            for (int j=0;j<60;j++){
                setor_A[i][j]="v";
                setor_B[i][j]="v";
            }
        }

        while (true){      
            MostrarMenu();
            opcaoMenu=EscolhaMenu();

            if (opcaoMenu==1){
                VenderIngresso(setor_A, setor_B);
            } else if (opcaoMenu==2){
                contVendas = RelatorioVendas(setor_A, setor_B);
                System.out.println("Total de ingressos vendidos: " + contVendas);
            } else if (opcaoMenu==3){
                break;
            }
        }  
    }

    static void MostrarMenu(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("A) Vender Ingresso");
        System.out.println("B) Exibir o total de ingressos vendidos");
        System.out.println("C) Encerrar o programa");
        System.out.println("");
    }

    static int EscolhaMenu(){
        Scanner teclado = new Scanner(System.in);
        int escolha;

        System.out.println("Qual item do menu voce quer?");
        System.out.println("Digite 1 para A, 2 para B e 3 para C");
        escolha = teclado.nextInt();
        while (escolha>3 | escolha <1){
            System.out.println("Opcao invalida, tente novamente");
            System.out.println("Digite 1 para A, 2 para B e 3 para C");
            escolha = teclado.nextInt();
        }
        return escolha;
    }

    static void VenderIngresso(String[][] setor_A, String[][] setor_B){
        Scanner teclado = new Scanner(System.in);
        String setor;
        int fila, cadeira;

        System.out.println("");
        System.out.println("Venda de ingresso:");
        System.out.println("Qual o setor desejado?");
        System.out.println("informe A ou B: ");
        setor = teclado.next();

        System.out.println("Qual a fila desejada? ");
        System.out.println("informe um valor de 0 a 40: ");
        fila = teclado.nextInt();

        System.out.println("Qual a cadeira desejada? ");
        System.out.println("informe um valor de 0 a 60: ");
        cadeira = teclado.nextInt();

        if ("A".equals(setor)){
            if ("v".equals(setor_A[fila][cadeira])){
                setor_A[fila][cadeira]="p";
                System.out.println("compra efetuada com sucesso");
            } else {
                System.out.println("Cadeira ja vendida, tente novamente");
            }
        } else if("B".equals(setor)){
            if ("v".equals(setor_B[fila][cadeira])){
                setor_B[fila][cadeira]="p";
                System.out.println("compra efetuada com sucesso");
            } else {
                System.out.println("Cadeira ja vendida, tente novamente");
            }
        }
    }

    static int RelatorioVendas(String[][] setor_A, String[][] setor_B){
        int cont = 0;
        for (int i=0;i<40;i++){
            for (int j=0;j<60;j++){
                if("p".equals(setor_A[i][j])){
                    cont=cont+1;
                }
                if ("p".equals(setor_B[i][j])){
                    cont=cont+1;
                }
            }
        }
        return cont;
    }

}
