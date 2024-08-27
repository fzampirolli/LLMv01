
import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int seta[][] = new int[40][60];
    int setb[][] = new int[40][60];

    int i, j, v=0, s,f,c, r, setor,p=0, ingresso=0;

    for(i=0;i<39;i++){
        for(j=0;j<59;j++){
            seta[i][j] = v;
            setb[i][j] = v;
        }
    }

        System.out.println("1-Vender ingresso | 2-Exibir o total de ingressos vendidos | 3-Encerrar o programa");
        r = sc.nextInt();

        while(r !=3){

        if(r==1){
            System.out.println("Insira o setor (1 ou 2)");
            setor = sc.nextInt();
            System.out.println("Insira o numero da fila");
            i = sc.nextInt();
            System.out.println("Insira o numero da cadeira");
            j = sc.nextInt();

            if(setor == 1){
                if(seta[i][j] == v){
                    System.out.println("cadeira vazia");
                    v = p;
                    ingresso++;
                }
                else
                    System.out.println("cadeira ja foi vendida");
            }

            if(setor == 2){
                if(setb[i][j] == v){
                    System.out.println("cadeira vazia");
                    v = p;
                    ingresso++;
                }
                    else
                    System.out.println("cadeira ja foi vendida");
            }
        }

        if(r==2){
            System.out.println("Foram vendidos "+ingresso+" ingressos");
        }

        System.out.println("1-Vender ingresso | 2-Exibir o total de ingressos vendidos | 3-Encerrar o programa");
        r = sc.nextInt();

}
    }
        }
