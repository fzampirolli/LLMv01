import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int n=45;   
        String vetorDestino[]=new String [n];
        String vetorNome[]=new String [n];
        String destino,nome;

        for(int i=0;i<n;i++){
            System.out.println("Qual o nome do passageiro ?: ");
            vetorNome[i]=t.next();
            System.out.println("Qual o destino do passageiro ?: ");
            vetorDestino[i]=t.next();
        }

        System.out.println("Insira um destino: ");
        destino=t.next();

        nome=pesquisarNome(vetorDestino,vetorNome,destino);
        if("".equals(nome)){
            System.out.println("Destino nao existe");
        }
        else System.out.println("Nome: "+nome+". Destino: "+destino);
    }
    public static String pesquisarNome(String d[], String n[], String lugar){
        int a=0,i=0;
        String nome="";
        do{
            if(d[i].equals(lugar)){
                a=1;
                nome=n[i];
            }
            i++;
        }while(i<d.length && a==0);
        return nome;
    }
}
