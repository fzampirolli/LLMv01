
import java.util.Scanner;

public class P2E02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q=0,t=0;
        Cardápio();
        Pedidos(t);

    }
    public static double Pedidos(int t){
        Scanner input = new Scanner(System.in);
        double soma=0;
        int l=-1,qtd=0;
        while (l!=0){
            System.out.println("Digite o código do pedido que deseja fazer :");
            l=input.nextInt();
            if (l!=0){
                if (l==300){
                    System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(1.30*qtd);
                }
                if (l==301){
                    System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(1.40*qtd);
                }
                if (l==302){
                   System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(1.50*qtd); 
                }
                if (l==303){
                    System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(1.40*qtd);
                }
                if (l==304){
                   System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(2.20*qtd); 
                }
                if (l==305){
                    System.out.println("Digite a quantidade que deseja comprar :");
                    qtd=input.nextInt();
                    soma=soma+(1.00*qtd);
                }
            }
            qtd=0;
        }
        System.out.println("O valor da sua compra é :  "+soma);
        return soma;

    }
    public static void Cardápio (){
        int L2[]= new int [2];
        int L3[]= new int [2];
        int L4[]= new int [2];
        int L5[]= new int [2];
        int L6[]= new int [2];
        int L7[]= new int [2];

        for (int q=0;q<7;q++){
                            if (q==0){
                                for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" Código ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Item ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" Preço Unitário ");
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println("");
                            }
                            if (q==1){
                                for (int i=0;i<3;i++){
                                   if (i==0){
                                        System.out.print(" 300 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Pão de Queijo ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 1,30 ");
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println("");
                            }
                            if (q==2){
                               for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" 301 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Bauru ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 1,40 ");
                                        System.out.print("  ");
                                    }
                                }
                               System.out.println("");
                            }
                            if (q==3){
                               for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" 302 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Cachorro Quente ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 1,50 ");
                                        System.out.print("  ");
                                    }
                                }
                               System.out.println("");
                            }
                            if (q==4){
                               for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" 303 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Cheeseburguer ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 1,40 ");
                                        System.out.print("  ");
                                    }
                                }
                               System.out.println("");
                            }
                            if (q==5){
                               for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" 304 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Suco ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 2,20 ");
                                        System.out.print("  ");
                                    }
                                }
                               System.out.println("");
                            }
                            if (q==6){
                               for (int i=0;i<3;i++){
                                    if (i==0){
                                        System.out.print(" 305 ");
                                        System.out.print("  ");
                                    }
                                    if (i==1){
                                        System.out.print(" Refrigerante ");
                                        System.out.print("  ");
                                    }
                                    if (i==2){
                                        System.out.print(" R$ 1,00 ");
                                        System.out.print("  ");
                                    }
                                }
                               System.out.println("");
                            }

        }
    }
}
