
import java.util.Scanner;

public class P202 {
    public static String pesquisarDestino(String v1[],String v2[],String nome,int tam){

        int i;

        System.out.println("nome na função pesquisaDestino: "+nome);

        for(i=0;i<tam;i++){
            if(v1[i]==nome)
                return v2[i];
        }

        return "";
    }

    public static void cadastro(String vNome[],String vDestino[],int tam){
        Scanner entrada=new Scanner(System.in);

        int i;

        vNome[0]="ana";
        vNome[1]="bruno";

        vDestino[0]="fortaleza";
        vDestino[1]="arabia";
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int tam=2;
        String nome;
        String vNome[]=new String[tam];
        String vDestino[]=new String[tam];

        System.out.println("Forneça um nome: ");
        nome=entrada.nextLine();
        System.out.println("NOME DIGITADO: "+nome);

        cadastro(vNome,vDestino,tam);

        System.out.println(pesquisarDestino(vNome,vDestino,"bruno",tam));

    }

}
