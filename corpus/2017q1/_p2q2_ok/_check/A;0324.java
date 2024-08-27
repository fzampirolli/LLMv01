
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) { 
    int A[] ={100,101,102,103,104,105};
    String B[] ={"Pão de Queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigerante"};
    double C[] = {1.1,1.3,1.5,1.3,2.0,1.0};
    Scanner entrada = new Scanner(System.in);
    int i,cod, quant=0;
    double valor=0.0;
    do{
    System.out.println("Digite o código do produto (100 a 105): ");
    cod = entrada.nextInt();
    if(cod!=0){
    System.out.println("Quantidade de produtos: ");
    quant = entrada.nextInt();}

    if(cod==100){
    valor += 1.1*quant;}
    if(cod==101){
        valor += 1.3*quant;}
        if(cod==102){
            valor += 1.5*quant;}
            if(cod==103){
                valor += 1.3*quant;}
                if(cod==104){
                    valor += 2.0*quant;} 
                    if(cod==105){
                        valor += 1.0*quant;}
    }while(cod!=0);
    System.out.println("Código "+ "Item "+"         Preço unitário");
    for(i=0;i<6;i++){
        System.out.println(A[i]+"    "+B[i]+"   "+ C[i]);
    }  
        System.out.println("-------------------");
        System.out.println("Total da compra:" +valor);

    }

}
