
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        String vet1[] = {"Código", "Item", "Preço Unitário"};
        int vet2[]= {300, 201, 302, 303, 304, 305};
        String vet3[]= {"Pão de queijo", "Bauru", "Cachorro Quente", "Cheeseburger", "Suco", "Refrigerante"};
        double vet4[] = {1.30, 1.40, 1.50, 1.40, 2.20, 1.00};

        Scanner teclado= new Scanner(System.in);
        int tam1=3, i;
        int tam2 =6;

            for (i=0; i<tam1; i++){
            System.out.print(vet1[i]+"       ");  

            } 
            System.out.println (" ");
            for (i=0; i<tam2; i++){
                 System.out.println("  "+vet2[i]+"  "+ vet3[i]+"            "+vet4[i]+"    ");               

            }
            int codigo;
            System.out.println("Digite o código do produto: ");
            codigo=teclado.nextInt();
             double valor=0;

            while (codigo >=300 && codigo <306){
                if (codigo == 300){
                    valor=valor + 1.30;
                }
                    else{ 
                        if (codigo == 301){
                            valor = valor + 1.40;

                        } 
                        else {
                            if (codigo ==302){
                                valor=valor + 1.50; 
                        }
                            else {
                                if (codigo==303){
                                valor = valor + 1.40;

                            }
                            else {
                                if (codigo == 304){
                                valor = valor + 2.20;

                            }
                                else {
                                    valor = valor + 1.00;       
                                        }

                           }
                           }   
                        }     
                } 
                System.out.println("Digite o pedido:");
                codigo=teclado.nextInt();       
            }  
            System.out.println ("O valor da compra foi de : "+valor+" reais");  
    }

                }

            }
            System.out.println ("O valor a pagar é:"+ valor);

    }

}
