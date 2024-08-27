
import java.util.Scanner;

public class Q2_ {
static int n=25;
static int next=0;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String Nome[]= new String[n];
        String Destino[] = new String[n];
        String nome = "";
        int opcao=0;

        System.out.println("--Entre com as informações. Digite 0 para sai. ");
        System.out.println("--Digite 1 para Cadastrar");
        System.out.println("--Digite 2 para Pesquisar ");

        while(opcao!=3){
        opcao=ent.nextInt();
        if (opcao==1){
        Nome(Nome,Destino);
        }
        else if (opcao==2){
        pesquisarDestino(Nome, Destino,nome);
        }
        System.out.println("--Digite 0 para sair ou apenas continue cadastrando. ");
        opcao=ent.nextInt();             
        next=next+1;

        }

    }
    public static void Nome(String Nome [],String Destino[]){
        Scanner ent = new Scanner(System.in);

            System.out.println("Informe o nome do passageiro: ");
            Nome[next]=ent.nextLine();
            System.out.println("Informe o destino: ");
            Destino[next]=ent.nextLine();

    }
    public static void pesquisarDestino(String Nome [],String Destino[], String nome){
    Scanner entry = new Scanner(System.in);
    System.out.println("Informe o nome a ser localizado: ");
    nome = entry.nextLine();

        for(int i =0; i<n;i++){
           if(nome==Nome[i]){
        System.out.println("Nome:"+Nome[i]+"");
        System.out.println("Destino:"+Destino[i]+"");
        }
           else{
        System.out.println("Null");
        }

        }
}
}
