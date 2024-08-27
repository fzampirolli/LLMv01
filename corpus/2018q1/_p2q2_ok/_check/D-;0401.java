
 import java.util.Scanner;

public class Exercicio2P2Pedro11201721462 {

    public static void main(String[] args) 
    {
        String vetnome[], vetdestino[];
        vetnome= new String [25];
        vetdestino= new String [25];
        String pergunta;
        int i;
         for(i = 0; i<25;i++){

   Scanner scan = new Scanner(System.in);

   System.out.println("Digite nome  e destino do passageiro "+(i+1)+" para cadastrá-lo:  ");
   vetnome[i]=scan.nextLine();
   vetdestino[i]=scan.nextLine();

    }
    nome
    pergunta = pesquisaDestino(String nome, String vetdestinopass[], String vetnomepass[])

}

    public static String pesquisaDestino(String nome, String vetdestinopass[], String vetnomepass[]){

    int n;

    int posicaonome;
    String resposta ;

    for(n = 0; n<25;n++){

        if(nome==vetnomepass[n]){
            resposta = vetdestinopass[n]+vetnomepass[n];}           

    return resposta;
    }
    }

}