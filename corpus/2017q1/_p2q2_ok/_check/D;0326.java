
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int i, quant, quant1=0, quant2=0, quant3=0, quant4=0, quant5=0, quant6=0; 
        double valor=0; 

        int Codigo[]={300, 301, 302, 303, 304, 305};
        String Item[]={"Pão de queijo", "Bauru", "Cachorro Quente", "Cheeserburguer", "Suco", "Refrigerante"};
        double Preco[]={1.3, 1.4, 1.5, 1.4, 2.2, 1};

        for(i=0; i<6; i=i+1){
        System.out.println("O código do item "+Item[i]+" é: "+Codigo[i]);
        }

        for(i=0; i<6; i=i+1){
            System.out.println("Insira o Codigo do item escolhido ");
            Codigo[i]=teclado.nextInt();
            System.out.println("Informe a quantidade desse item: ");
            quant=teclado.nextInt();
        }

        for(i=0; i<6; i=i+1){
            while(Codigo[i]!=0){
                if(Codigo[i]==300){
                quant1=quant;                          
                valor=(valor+Preco[i])*quant1;
                }
                if(Codigo[i]==301){
                quant2=quant;                          
                valor=(valor+Preco[i])*quant2;
                }
                if(Codigo[i]==302){
                quant3=quant;                          
                valor=(valor+Preco[i])*quant3;
                }
                if(Codigo[i]==303){
                quant4=quant;                          
                valor=(valor+Preco[i])*quant4;
                } 
                if(Codigo[i]==304){
                quant5=quant;                 
                valor=(valor+Preco[i])*quant5;
                }
                if(Codigo[i]==305){
                quant6=quant;                          
                valor=(valor+Preco[i])*quant6;
                }
            }       
        }
    System.out.println("Total da compra: "+valor);

    }
}
