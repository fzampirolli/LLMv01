
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
       int codigo[], digitado, quantos;
       String item[];
       double  preco[], valort=0;

        codigo= new int[6];
        preco= new double[6];
        item= new String[6];

        for(int k=0; k<6; k++){
        codigo[k]=299+(k+1);
        }

        item[0]= "Pão de Queijo";
        item[1]= "Bauru";
        item[2]= "Cachorro Quente";
        item[3]= "Cheeseburguer";
        item[4]= "Suco";
        item[5]= "Refrigerante";

        preco[0]= 1.30;
        preco[1]= 1.40;
        preco[2]= 1.50;
        preco[3]= 1.40;
        preco[4]= 2.20;
        preco[5]= 1.00;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digitar a seguir os códigos seguidos das quantidades de produtos desejados: ");
        do{
        digitado= entrada.nextInt();
        quantos= entrada.nextInt();
        int k;
        for(k=0; k<6; k++)
        if(digitado==codigo[k]){
            valort= valort+(quantos*preco[k]);
        }}  
        while(digitado!=0);

                System.out.println("Código  Preço  Produto");
        int i;
        for(i=0; i<6; i++){
           System.out.println(codigo[i]+"     "+preco[i]+"     "+item[i]);
        }

        System.out.println("Total da compra: "+valort);

    }

}
