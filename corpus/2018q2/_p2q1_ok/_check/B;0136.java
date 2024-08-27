
import java.util.Scanner;

public class Questao1P2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cont,comp,N=0,k, oc=0;
        final int MAX= 50;
        int V[]=new int [MAX];
        System.out.println("preencher vetor: ");
        for ( int i=0; i<MAX; i++){
            V[i]=(int)(Math.random()*72-21);}
    for(cont=0;cont<MAX;cont++){
        System.out.println(V[cont]);}
    System.out.println(V[7]);
    for(cont=7;cont<MAX;cont++){   
        comp=V[7];
        if(V[cont]>comp){N++;}}
    System.out.println("O numero de elemento na 7a posicao é: " + V[7]);
    System.out.println("O numero de elementos maior que o elemento na 7a posiçao é: " + N);  
    System.out.println("digite um numero k");
    k=teclado.nextInt();
    for(cont=0;cont<MAX;cont++){
        if(V[cont]==k){System.out.print("K ocorre na posicçao:" + cont); oc++;}}
    if(oc==0){ System.out.println("O numero k nao ocorre no vetor");}  

    }

    }  
