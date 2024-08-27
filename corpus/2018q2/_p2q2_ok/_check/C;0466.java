
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int s,f,cad,l=0,c=0,setor,i=0,j=0;

    String VA[][] = new String[10][11];
    String VB[][] = new String[10][11];
    String setorString;

    while(c<10){
        while(l<11){
        VA[i][j]="a venda";
        l++;
        }
    l=0;
    c++;
    }

    while(j<220){

    System.out.print("Qual o setor desejado: ");
    setorString = entrada.nextLine();

    if ("A".equals("A")){

    System.out.print("Qual o número da fila: ");
    f = entrada.nextInt();

    System.out.print("Qual o número da cadeira: ");
    cad = entrada.nextInt();

    l = cad;
    c = f;

    if(VA[l][c]!="p"){
    VA[l][c] = "P";
    }
    else{
    System.out.print("Lugar já foi vendido");
    }
    }

    else{

    System.out.print("Qual o número da fila: ");
    f = entrada.nextInt();

    System.out.print("Qual o número da cadeira: ");
    cad = entrada.nextInt();

    l = cad;
    c = f;

    if(VB[l][c]!="p"){
    VB[l][c] = "P";
    }
    else{
    System.out.print("Lugar já foi vendido");
    }

    }
    j++;
    }

    }

    }
