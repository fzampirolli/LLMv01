import java.util.Scanner;
public class BeatrizdeCastroMoreiraFarkas__beatriz_farkas__questao2 
{

    public static void main(String[] args) 
    {

        String vetorNome[], vetorDestino[], destino;
        vetorNome = new String [45];
        vetorDestino = new String [45];     
        Scanner entrada = new Scanner(System.in);

        for(int i=0;i<2;i++)
        {
            System.out.println("Digite o nome do passageiro: ");
            vetorNome[i]=entrada.nextLine();
        }

        for(int i=0;i<2;i++)
        {
            System.out.println("Digite o destino do passageiro: ");
            vetorDestino[i]=entrada.nextLine();
        }

        System.out.println("Digite um destino: ");
        destino = entrada.nextLine();

        System.out.print("O nome do passageiro é: ");
        System.out.println(pesquisarNome(vetorNome,vetorDestino,destino));

    }

    private static String pesquisarNome(String[] vetorNome, String[] vetorDestino, String destino) 
    {
        int aux=0;
        for(int i=0;i<45;i++)
        {
            if(vetorDestino[i].equals("destino"))
            {
                aux=i;              
            }          
        }
        return vetorNome[aux];
    }    
}
