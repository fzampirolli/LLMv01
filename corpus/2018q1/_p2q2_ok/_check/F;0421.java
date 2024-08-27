
import java.util.Scanner;

public class Questao2 {

    static String Nome[]= new String[45];
    static String Destino[]=new String [45];
    static Scanner entrada= new Scanner (System.in);

    public static void main(String[] args) {
    int n=0;

    while(n!=3){
    System.out.println("O que deseja fazer:\n"+"1-Cadastrar\n"+"2-Consultar\n"+"3-Sair");
    n=entrada.nextInt();

    if (n==1){
        Cadastrar();
    }

    if(n==2){
        Consultar();
    }
    }
    }

public static void Cadastrar() {

    String nome,destino;
    int i=0;

    System.out.println("Digite o nome do passageiro:");
    nome = entrada.next();
    Nome[i]=nome;

    System.out.println("Digite o destino do passageiro:");
    destino = entrada.next();
    Destino[i] = destino;

    i=i+1;

}

public static void Consultar() {
    String nome,destino;
    int i;
    System.out.println("Digite o nome do passageiro que deseja consultar:");
    Nome[i] = entrada.next();

    System.out.println("O nome do passageiro é:"+" e seu destino é"+Destino[i]);

}
}
