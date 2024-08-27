
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
       String x=" ";
       double a, b, y, soma=0;
       String vetor1[]={"Item","Código","Preço"};       
       String vetor2[]={"100", "Pão de Queijo", "1.10"};
       String vetor3[]={"101","Bauru","1.30"};
       String vetor4[]={"102","Cachorro quente","1.50"};
       String vetor5[]={"103","Cheeseburger","1.30"};
       String vetor6[]={"104","Suco","2.00"};
       String vetor7[]={"105","Refrigerante","1.00"};

    ImprimeVetor(vetor1);
    ImprimeVetor(vetor2);
    ImprimeVetor(vetor3);
    ImprimeVetor(vetor4);
    ImprimeVetor(vetor5);
    ImprimeVetor(vetor6);
    ImprimeVetor(vetor7);

    while (!"0".equals(x)){
    System.out.println("Digite o código do produto (100 a 105):");
    Scanner sc= new Scanner(System.in);
    x= sc.nextLine();
        if(!"0".equals(x)){
        System.out.println("Digite a quantidade:");
        y= sc.nextInt();
            if("100".equals(x)){
            soma= soma + (1.1*y);
            }else{
                if("101".equals(x)){
                    soma= soma + (1.3*y);
                }else{
                    if("102".equals(x)){
                        soma= soma + (1.5*y);
                    }else{
                        if("103".equals(x)){
                            soma=soma+(1.3*y);
                        }else{
                            if("104".equals(x)){
                                soma=soma=(2*y);
                            }else{
                                soma=soma+y;
                            }
                        }
                    }
                }
            }
        }

    }
    System.out.println("Total da compra: "+soma);

    }
    public static void ImprimeVetor(String Vet1[]){
        for(int c=0; c<3; c++){
            System.out.print(Vet1[c]+" ");
        }
            System.out.println("");
    }
}
