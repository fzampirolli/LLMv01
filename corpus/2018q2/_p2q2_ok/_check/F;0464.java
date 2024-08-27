
import java.util.Scanner; 

public class Questao2 {

    int quant = 0;
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int menu, setor, i, j;
        int Setor1 [][] = new int [40][60];
        int Setor2 [][] = new int [40][60];

        for (int a = 0; a <40; a++){
                for (int b = 0; b < 60; b++){
                    Setor1 [a][b] = vazio;
                    Setor2 [a][b] = vazio;
                }
        }

        while (menu !=3){
            System.out.println ("---- MENU ----");
            System.out.println ("1) Vender Ingresso");
            System.out.println ("2) Exibir total de ingressos preenchidos");
            System.out.println ("3) Encerrar o programa");
            menu = entrada.nextInt();  
        }

        if (menu == 1){
            System.out.println ("Selecione o setor desejado para comprar: ");
            setor = entrada.nextInt();
                if (setor == 1){
                        LerMatrizSetor1(setor);
                }
                if (setor == 2){
                        LerMatrizSetor2(setor);
                }
        }

        if (menu == 2){
           System.out.println ("Total de ingressos vendidos até o momento: "+ quant);
        }

        if (menu == 3){
            return;
        }

    }

    public static String LerMatrizSetor1 (int menu){
        Scanner entrada = new Scanner (System.in);
            System.out.println ("Selecione a fila desejada para comprar: ");
            int fila = entrada.nextInt();
            System.out.println ("Selecione a cadeira desejada para comprar: ");
            int cadeira = entrada.nextInt();
            boolean achou = false;
            for (int i = 0; i <40; i++){
                for (int j = 0; j < 60; j++){
                if (Setor1 [fila][cadeira] == vazio){
                    Setor1 [fila][cadeira] = preenchido;
                    quant = quant + 1;
                    achou = true;                    
                }
            }
                if (achou == false){
                    System.out.println ("A cadeira já foi vendida");

                }       
            }              
    }

    public static String LerMatrizSetor2 (int menu){
         Scanner entrada = new Scanner (System.in);
            System.out.println ("Selecione a fila desejada para comprar: ");
            int fila = entrada.nextInt();
            System.out.println ("Selecione a cadeira desejada para comprar: ");
            int cadeira = entrada.nextInt();
            boolean achou = false;
            for (int i = 0; i <40; i++){
                for (int j = 0; j < 60; j++){
                if (Setor2 [fila][cadeira] == vazio){
                    Setor2 [fila][cadeira] = preenchido;
                    quant = quant + 1;
                    achou = true;                    
                }
            }
                if (achou == false){
                    System.out.println ("A cadeira já foi vendida");

                }       
            }         
    }

}   
