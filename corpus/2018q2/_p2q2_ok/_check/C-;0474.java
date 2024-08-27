
import java.util.Scanner;

public class Questao2P2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); 
        int M, l, c, ala, tot=0;
        char A[][]=new char [10][11];
        char B[][]=new char [10][11];

        for(l=0;l<10;l++){
            for(c=0;c<11;c++){
                A[l][c]='p';}}
        for(l=0;l<10;l++){
            for(c=0;c<11;c++){
                B[l][c]='v';}}

        System.out.println("Menu: digite 1 para comprar ingresso, 2 para ver total de ingressos vendidos e 3 para encerrar programa");
        M=teclado.nextInt();

            if(M==1){
                System.out.println("digite a ala em que deseja comprar(1 ou 2): ");
                ala=teclado.nextInt();
                if(ala==1){
                    System.out.println("digite a fila e a fileira do assento que deseja adiquirir");
                    l=teclado.nextInt();
                    c=teclado.nextInt();
                    A[l][c]='p';tot++;
                    System.out.println("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa");
                    M=teclado.nextInt();}

                if(ala==2){
                    System.out.println("digite a fila e a fileira do assento que deseja adiquirir");
                    l=teclado.nextInt();
                    c=teclado.nextInt();
                    A[l][c]='p';tot++;
                    System.out.println("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa");
                    M=teclado.nextInt();}

            if(M==2){System.out.println("O numero de assentos vendidos é de: " + tot);
             System.out.println("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa");
                    M=teclado.nextInt();}
            if(M==3){System.out.println("programa finalizado");}}}}
