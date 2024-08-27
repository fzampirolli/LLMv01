
import java.util.Scanner;
import java.util.Random;

public class Questao1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    final int Max=50;
    int maior,cont=0,num, resp =0, ind =0;
    int v[]= new int [Max];

    System.out.println("Preencher Vetor: ");

    for (int i=0; i<Max; i++){
    v[i]=(int)(Math.random()*72-21);
    }

    for (int i=0; i<Max; i++){
    System.out.print(v[i]+"|");
    }

    maior = v[7];
    for (int i =0; i<Max; i++){
        if(v[i]>maior){
        cont++;
        }
    }
    System.out.println();
    System.out.print("Questão 1 - a:");
    System.out.println();
    System.out.print("Elemento de indice 7: "+v[7]);
    System.out.println();
    System.out.print("Existem "+cont+" números maiores do que "+v[7]+" neste vetor.");
    System.out.println();

    System.out.print("Questão 1 - b:");
    System.out.println();
    System.out.print("Digite um número inteiro: ");
    num = sc.nextInt();

    System.out.println();
    for (int i =0; i<Max; i++){
        if (v[i]==num){
        resp = resp+1;
        ind = i;

      }
        else{
        resp =resp +0;

        }

    }
    if (resp==1){    
        System.out.print("O número "+num+" encontra-se na posição "+ind);

      }
        else{   
        System.out.print("O número "+num+" não foi encontrado");
        }

    }   

}
