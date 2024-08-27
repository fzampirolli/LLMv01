
import java.util.Scanner;

public class P2EX2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n=5;
        String vetorNome[]=new String[n];
        String vetorDestino[]=new String[n];
        String destino;
        int i,r;

        for(i=0;i<n;i++)    {
            System.out.print("DIGITE O NOME DO PASSAGEIRO: ");
            vetorNome[i]=teclado.next();
        }

        for(r=0;r<n;r++)    {
            System.out.print("DIGITE O DESTINO: ");
            vetorDestino[r]=teclado.next();
        }

        System.out.print("PESQUISE O DESTINO: ");
        destino = teclado.next();

        for(r=0;r<n;r++)    {
            if(vetorDestino[r]==destino)    {
                System.out.print(destino);
            }

        }

    }

    public static void Preencher(String v1,int n)  {
        int i;
        Scanner teclado = new Scanner(System.in);

        for(i=0;i<n;i++)    {
            System.out.print("DIGITE O NOME DO PASSAGEIRO: ");
            v1[i]=teclado.next();
        }
    }

    public static void pesquisaNome(String v1, String v2, String k)   {
        int i,r;
        String passageiro;

        for(i=0;i<5;i++)    {
            for(r=0;r<5;r++)    {
                if(r==k)    {
                    passageiro = v1[r];
                }
            }
        }

    }

}
