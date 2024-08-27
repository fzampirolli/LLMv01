
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int l,c = 0,n=0,v=0,somapol=0;
        int setor1[][] = new int[40][60];
        int setor2[][] = new int[40][60];
        int op1,op2,op3;

        Scanner input = new Scanner(System.in);

        System.out.print("---MENU---");

        System.out.print("-Vender ingressos-");
        op1= input.nextInt();

        System.out.print("-Exibir total de cadeiras-");
        op2=input.nextInt();

        System.out.print("-Encerrar o programa-");
        op3=input.nextInt();

        if(n == op1){

            System.out.print("Qual o setor?");

            for(l= v; l <40; l++){
                for (c=v; c<60; c++)
                    setor1[l][c]=input.nextInt();
            }

            for(l= v; l <40; l++){
                for (c=v; c<60; c++)
                    setor2[l][c]=input.nextInt();
            }

            somapol=somapol+setor1[l][c]+setor2[l][c] ;

            System.out.println("Qual o número da fileira:");
            for(l= v; l <40; l++){
                for (c=v; c<60; c++)
                    setor2[l][c]=input.nextInt();
        }

        System.out.println("Qual o número da cadeira:");
            for(l= v; l <40; l++){
                for (c=v; c<60; c++)
                    setor2[l][c]=input.nextInt();

    }
}
