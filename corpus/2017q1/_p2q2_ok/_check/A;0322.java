
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        float card[][]=new float[6][2];
        card[0][0]=100;
        card[0][1]=(float) 1.1;
        System.out.println(card[0][0]+" Pão de Queijo "+card[0][1]);

        card[1][0]=101;
        card[1][1]=(float) 1.30;
        System.out.println(card[1][0]+" Baurú "+card[1][1]);

        card[2][0]=102;
        card[2][1]=(float) 1.50;
        System.out.println(card[2][0]+" Cachorro Quente "+card[2][1]);

        card[3][0]=103;
        card[3][1]=(float) 1.30;
        System.out.println(card[3][0]+" Cheeseburguer "+card[3][1]);

        card[4][0]=104;
        card[4][1]=(float) 2.00;
        System.out.println(card[4][0]+" Suco "+card[4][1]);

        float ref[]=new float[2];
        card[5][0]=105;
        card[5][1]=(float) 1.00;
        System.out.println(card[5][0]+" Refrigerante "+card[5][1]);

        int i;
        int qntd[]=new int[6];
        System.out.print("Digite o código do produto (100 a 105): ");
        i=entrada.nextInt();

        while(i!=0){
            System.out.print("Digite a quantidade do produto: ");
            int n=entrada.nextInt();
            for(int j=0;j<6;j++){
                if(i==card[j][0]){
                    qntd[j]=n;
                }
            }
            System.out.print("Digite o código do produto (100 a 105): ");
            i=entrada.nextInt();
        }
        float soma=0;
        for(int m=0;m<6;m++){
            soma = soma+(qntd[m]*card[m][1]);
        }
        System.out.println("Total da compra é: "+soma);

    }

}
