
import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String VetorNome[] = new String [35];
        String VetorAcento[] = new String [35];
        Preencher(VetorNome);
        Preencher(VetorAcento);
        ProcuraAcento(VetorNome,VetorAcento);     

    }
    public static String[] Preencher(String V[])
    {
        Scanner read = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            System.out.println("digite:");
            V[i] = read.next();
        } 
        return V;
    }
    public static String ProcuraAcento(String Vn[],String Va[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual acento deseja consultar:");
        String ac = read.next();
        String pessoa = " ";
        boolean teste = true;

        for(int i = 0;i<4;i++)
        { 

           if(ac.equals(Va[i]))
           {

               pessoa = Vn[i];
               teste = false;
           }

        }
        if(teste)
        {

          System.out.println("acento não existe");

        }
         System.out.println("O passageiro é o(a) "+ pessoa);

        return pessoa;

}
}