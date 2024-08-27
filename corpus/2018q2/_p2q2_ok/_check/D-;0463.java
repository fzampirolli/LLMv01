
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int setor1[][] = new int[40][60];
        int setor2[][] = new int[40][60];
        int i, j, fila, cadeira, vendidos=0;
        char v, p;
        String b = "N";
        String Setor1, Setor;

        for(i=0; i<40; i++){
            for(j=0;j<60;j++){
                setor1[i][j] = 'v';  
            }
        }

        for(i=0; i<40; i++){
            for(j=0;j<60;j++){
                setor2[i][j] = 'v';
            }
        }

        System.out.println("Para iniciar, digite alguma das opções:");
        System.out.println("A) VENDER INGRESSO B) EXIBIR TOTAL DE INGRESSOS VENDIDOS C) ENCERRAR O PROGRAMA");

       while(!"C".equals(b)){
           for(i=0;i<40;i++){
               for(j=0;j<60;j++){
                     System.out.println("Escolha: Setor1 ou Setor2 ");
                 Setor1 = sc.nextLine();
                 System.out.println("Digite o número da fila que deseja comprar, sendo que temos apenas 40 fileiras:");
                 fila = sc.nextInt();
                 System.out.println("Digite o número da cadeira, sendo que temos apenas 40 lugares por fileira:");
                 cadeira = sc.nextInt();
                 Setor1[i][j] = 'p';
                 if(i>=40||j>60){
                     System.out.println("Número inválido");

                 }
               }

               vendidos = vendidos + Setor1[i][j];

           }

       }

    }

}
