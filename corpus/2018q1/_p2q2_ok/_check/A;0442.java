import java.util.Scanner;
public class RafaelaFerrazMartin__r_ferraz__Principal
{
    public static void main(String[] args) 
    {
        Scanner teclado =  new Scanner(System.in);
        String vetorNome[], vetorAcento[], nome, resultado;
        vetorNome = new String[2];
        vetorAcento = new String[vetorNome.length];

        preencherVetores(vetorNome, vetorAcento);

        System.out.println("Informe o nome para pesquisa:");
        nome = teclado.nextLine();

        resultado = pesquisarAcento(vetorAcento, vetorNome, nome);

        if(resultado.equals(""))
        {
            System.out.println("Passageiro nao existe!");
        }
        else
        {
            System.out.println("\nNOME: "+nome+"\n"
                             + "ACENTO: "+resultado);
        }
    }

    public static void preencherVetores(String[] vetorNome, String[] vetorAcento) 
    {
        Scanner entrada =  new Scanner(System.in);

        for(int i=0; i<vetorNome.length; i++)
        {
            System.out.println("Digite o "+(i+1)+"º nome:");
            vetorNome[i] = entrada.nextLine();
            System.out.println("Digite o "+(i+1)+"º acento:");
            vetorAcento[i] = entrada.nextLine();
        }
    }

    public static String pesquisarAcento(String[] vetorAcento, String[] vetorNome, String nome)
    {
        boolean tem=false;
        int posicao=0;

        for(int i=0; i<vetorNome.length; i++)
        {
            if(vetorNome[i].equals(nome))
            {
               tem = true; 
               posicao = i;
               i = vetorNome.length;
            }
            else
            {
                tem = false;
            }
        }

        if(tem)
        {
            return vetorAcento[posicao];
        }
        else
        {
            return "";
        }
    }
}
