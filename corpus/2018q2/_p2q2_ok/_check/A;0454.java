
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        String S1[][]=new String [40][60];
        String S2[][]=new String [40][60];

        final int fileiras=40;
        final int cadeiras = 60;

        for (int i=0; i<fileiras; i++){
            for (int j=0; j<cadeiras; j++){
                S1[i][j]=("v");
                S2[i][j]=("v");
            }
        }

        int n=menu();

        while (n!=3){

            if (n==1){

                System.out.println("Insira o setor: 1 ou 2");
                int setor=entrada.nextInt();
                System.out.println("Insira o número da fila: ");
                int fila=entrada.nextInt();
                System.out.println("Insira o número da cadeira: ");
                int cadeira = entrada.nextInt();

                if (setor==1){
                    if (S1[fila-1][cadeira-1]==("v")){
                        S1[fila-1][cadeira-1]=("p");                   
                }
                    else {
                        System.out.println("A cadeira já foi vendida.");
                    }
                }
                if (setor==2){
                    if (S2[fila-1][cadeira-1]==("v")){
                        S2[fila-1][cadeira-1]=("p");                   
                }
                    else {
                        System.out.println("A cadeira já foi vendida.");
                    }
                }
            }

            if (n==2){
                int cont=0;
                for(int i=0; i<fileiras; i++){
                    for (int j=0; j<cadeiras; j++){
                        if (S1[i][j]==("p")){
                            cont++;
                        }
                        if (S2[i][j]==("p")){
                            cont++;
                        }                        
                    }                   
                }
                System.out.println("Até agora foram vendidos "+cont+" ingressos. ");

            }

        n=menu();
        }

    }

    public static int menu(){
        Scanner entrada = new Scanner (System.in);
        int n;
        System.out.println("1 - Vender Ingresso");
        System.out.println("2 - Exibir total de ingressos vendidos");
        System.out.println("3 - Encerrar Programa");
        n=entrada.nextInt();
        return n;

    }
}
