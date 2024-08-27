
import java.util.Scanner;

public class Questao2 {
    static final int T=15;
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String VetorAcento[]=new String[T];
        String VetorNome[]=new String[T];
        String Nome, pesquisa;
        LerVetorNome(VetorNome, T);
        LerVetorAcento(VetorAcento, VetorNome, T);
        System.out.println("Digite o nome do passageiro cujo acento será pesquisado: ");
        Nome=ent.nextLine();
        pesquisa=pesquisarAcento(VetorAcento, VetorNome, Nome, T);
        if("".equals(pesquisa)){
            System.out.println("Passageiro não existe");
        }else{
            System.out.println("Resultado: "+pesquisa);
        }
    }
    public static String pesquisarAcento(String A[],String B[],String Nome, int T){
        int i=0;
        String acento="";
        for(i=0;i<T;i++){
            if(B[i].equals(Nome)){
                acento= A[i];
            }
        }
        return acento;
    }
    public static void LerVetorNome(String B[], int T){
        Scanner ent=new Scanner(System.in);
        int i;
        for(i=0;i<T;i++){
            System.out.println("Digite o nome do passageiro: ");
            B[i]=ent.nextLine();
        }
    }
    public static void LerVetorAcento(String A[],String B[],int T){
        Scanner ent=new Scanner(System.in);
        int i;
        for(i=0;i<T;i++){
            System.out.println("Digite o acento do(a) passageiro(a) "+B[i]+":");
            A[i]=ent.nextLine();
        }
    }
}
