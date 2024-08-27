
import java.util.Scanner;
public class AmandaSilaibTofic__amanda_tofic__JavaApplication2 
{  
    public static void main(String[] args) 
    {
     String vN[] = new String [3];
     String vD[] = new String [3];
     String nome,resultado;

     Scanner entrada = new Scanner (System.in);
     for (int i=0; i<3; i++)
     {
         System.out.println("Digite o que se pede sem espaços entre as palavras:");
         System.out.println("Digite o nome da posição "+i+": ");
         vN[i] = entrada.next();
         System.out.println("Digite o destino da posição "+i+": ");
         vD[i] = entrada.next();
     }
     System.out.println("Digite o nome da pessoa: ");
     nome = entrada.next();
     resultado = pesquisarDestino(vN,vD,nome);

     if ("-".equals(resultado))
     {
         System.out.println("Passageiro não existe");
     }
     else 
     {
        System.out.println("Passageiro:"+nome+" Destino: "+resultado);
     }
     System.out.println("Fim do programa!");
    }

    public static String pesquisarDestino(String n[], String d[], String name)
    {
        String destino = "-";
        for (int i=0; i<3; i++)
        {
            if (name.equals(n[i]))
            {
                destino = d[i];
            }
        }
        return destino;
    }
}
