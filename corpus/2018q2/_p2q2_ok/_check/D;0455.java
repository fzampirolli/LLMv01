
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char ingressos[][] = new char [40][60];
        int cont=0;
        int fileira, cadeira;
        String opcao;

        for (int i=0; i<40; i++){
            for (int j=0; j<60; j++){
                ingressos[i][j] = 'v';
                System.out.print(ingressos[i][j] +" ");
            }
            System.out.println();

        }

        System.out.println("Digite uma opção:");
        opcao = entrada.next();

        if(null == opcao){
            System.out.println("Sistema encerrado");
        }
        else switch (opcao) {
            case "A":
                System.out.println("Digite o número da fila e o número da cadeira:");
                fileira = entrada.nextInt();
                cadeira = entrada.nextInt();
                for (int i=0; i<40; i++){
                    for(int j=0; j<60; j++){
                        if(ingressos[fileira][cadeira]=='v'){
                            ingressos[fileira][cadeira]='p';
                            System.out.println(ingressos[fileira][cadeira]);
                        }
                        else {
                            System.out.println("cadeira já foi vendida");
                        }
                    }
                }   break;
            case "B":
                for (int i=0;i<40;i++){
                    for(int j=0; j<60; j++){
                        if(ingressos[i][j]=='p'){
                            cont++;
                        }
                    }
                }   System.out.println("Já foram vendidos" +cont+"ingressos");
                break;
            default:
                System.out.println("Sistema encerrado");
                break;
        }
    }

}
