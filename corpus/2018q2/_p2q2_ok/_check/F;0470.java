
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int A=1, B=2, C=3;
        int opcao;
        int setor2[][]=new int [10][11];
        int setor1[][]=new int [10][11];
        int Lin, Col;

        System.out.println("MENU"+"\nA)Vender ingressos (Digite 1 para escolher essa opção)"+"\nB)Exibir o total de ingressos vendidos(Digite 2 para escolher essa opção)"+"\nC)Encerrar o programa(Digite 3 para escolher essa opção)");
        System.out.println("Escolha uma opção: ");
        opcao=ent.nextInt();

       for (Lin=0; Lin<10; Lin++){
           for(Col=0; Col<11; Col++){

           }
       }        
        if(opcao==1){
            System.out.println("Você selecionou - Vender ingressos");
        }
        if(opcao==2){
            System.out.println("Você selecionou - Exibir o total de ingressos vendidos");
        }
        if(opcao==3){
            System.out.println("Você selecionou - Encerrar o programa");
        }
    }

}
