
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int k=0, cont=0, z, o, h;
        String x;
        char C[][] = new char [40] [60];
        char D[][] = new char [40] [60];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 60; j++) {
                C[i][j] = 'v';
                D[i][j] = 'v';
            }
        }
        Scanner L = new Scanner (System.in);

        while(k==0){
            System.out.println("A)Vender Ingressos   B) Exibir o total de Ingressos vendidos   C)Encerrar o programa");
            x = L.nextLine();
            if("A".equals(x)){
                System.out.println("Escolha o setor(1 ou 2)");
                z = L.nextInt();
                System.out.println("Escolha a fileira(1 a 40)");
                o = L.nextInt();
                System.out.println("Escolha a cadeira(1 a 60)");
                h = L.nextInt();
                if (z==1){
                    if (C[o-1][h-1]=='v'){ 
                       System.out.println("Compra efetuada");
                       C[o-1][h-1] = 'p';
                    }
                    else {
                       System.out.println("Cadeira ocupada");
                    }
                }
                if (z==2){
                    if (D[o-1][h-1] == 'v'){ 
                       System.out.println("Compra efetuada");
                       D[o-1][h-1] = 'p';
                    }
                    else {
                       System.out.println("Cadeira ocupada");
                    }
                }

            }
            if("B".equals(x)){
                for (int r = 0; r < 40; r++) {
                    for (int j = 0; j < 60; j++) {
                        if(C[r][j] == 'p'){
                            cont++;
                        }
                        if (D[r][j]=='p'){
                            cont++;
                        }    
                        }
                    }

                System.out.println("Foram vendidos " + cont + " ingressos"); 
            }

            if("C".equals(x)){
              System.out.println("Fim do programa");
              k=1;
           }
        }  

    }

}