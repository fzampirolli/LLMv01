
    import java.util.Scanner;
public class P2pi2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vetorNome [] = new String [25];
        String vetorDestino [] = new String [25];
        System.out.println("Digite os nomes");
        Vetores(vetorNome);
        System.out.println("Digite os destinos");
        Vetores(vetorDestino);
        System.out.println("Digite o nome da pessoa: ");
        String nome = teclado.nextString();
        pesquisarDestino(vetorNome,vetorDestino,nome);
    }
    public static String pesquisarDestino(String v1[], String v2[], String n){
        String aux;
        for(int i=0;i<25;i++){
            if (n == v1[i]){
                aux = v2[i];
            }else if{
                aux = ( );    
            }
        } 
       return aux; 
}
    public static void Vetores(String vet[]){
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<25;i++){
            vet[i] = teclado.nextString();
        }
    } 
}
}
