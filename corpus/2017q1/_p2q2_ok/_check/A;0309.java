1 programa:

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        	double soma=0;
                int a, b, c, d ,f, g, codigo;
		int A[] = new int [6];
		A[0]=300;
		A[1]=301;
		A[2]=302;
		A[3]=303;
		A[4]=304;
		A[5]=305;
		System.out.println(" CÓDIGO: 300	|	ITEM: Pão de Queijo		|	PREÇO UNITÁRIO: 1,30 ");
		System.out.println(" CÓDIGO: 301	|	ITEM: Bauru			|	PREÇO UNITÁRIO: 1,40 ");
		System.out.println (" CÓDIGO: 302	|	ITEM: Cachorro Quente           |	PREÇO UNITÁRIO: 1,50 ");
		System.out.println (" CÓDIGO: 303	|	ITEM: Chesseburguer		|	PREÇO UNITÁRIO: 1,40 ");
		System.out.println (" CÓDIGO: 304	|	ITEM: Suco			|	PREÇO UNITÁRIO: 2,20 ");
		System.out.println (" CÓDIGO: 305	|	ITEM: Refrigerante		|	PREÇO UNITÁRIO: 1,00 ");
		System.out.println("Digite o código do produto(300 a 305): ");
		codigo = entrada.nextInt();
		while( codigo!=0){
			if (codigo==A[0]){
				System.out.println("Digite a quantidade de produtos: ");
				a= entrada.nextInt();
				soma = soma +(a* (1.30));
				System.out.println("digite o código do produto(300 a 305): ");
				codigo= entrada.nextInt();
			}
                        else {
				if(codigo==A[1]){
				System.out.println("Digite a quantidade de produtos: ");
				b= entrada.nextInt();
				soma = soma+(b*1.40);
				System.out.println("digite o código do produto(300 a 305): ");
				codigo= entrada.nextInt();
				}
				if(codigo==A[2]){
				System.out.println("Digite a quantidade de produtos: ");
				c= entrada.nextInt();
				soma = soma+(c*1.50);
				System.out.println("digite o código do produto(300 a 305): ");
				codigo= entrada.nextInt();
				}
				if(codigo==A[3]){
				System.out.println("Digite a quantidade de produtos: ");
				d= entrada.nextInt();
				soma = soma+(d*1.40);
				System.out.println("digite o código do produto(300 a 305): ");
				codigo= entrada.nextInt();
				}
				if(codigo==A[4]){
				System.out.println("Digite a quantidade de produtos: ");
				f = entrada.nextInt();
				soma = soma+(f*2.20);
				System.out.println("digite o código do produto(300 a 305): ");
				codigo = entrada.nextInt();
				}
				if(codigo==A[5]){
				System.out.println("Digite a quantidade de produtos: ");
				g= entrada.nextInt();
				soma = soma+(g*1);
				System.out.println("digite o código do produto(300 a 305): ");
				codigo= entrada.nextInt();
				}
			}
		}
		System.out.print(" a soma é igual a: "+ soma);
    }

}

PROGRAMA 2:

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        	int i, j;
		int A[][] = new int [4][4];
		int B[][] = new int [4][4];
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" Digite o elemento da linha "+ (i+1)+ " e coluna "+ (j+1)+ " da matriz: ");
				A[i][j]= entrada.nextInt();
			}
		}
		for (i=0; i<3; i=i+1){
			for (j=2; j<4; j= j+1){
				B[i][j]= A[i][j];
			}
		}
		for (i=0; i<4; i=i+1){
			for (j=0; j<2; j= j+1){
				B[i][j]=0;
			}
		}
		for (i=2; i<4; i=i+1){
			for (j=2; j<4; j= j+1){
				B[i][j]=0;
			}
		}
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" \n O elemento ["+ (i+1)+ "]["+ (j+1)+ "] da matriz A = "+ A[i][j]);
			}
		}
		for(i=0; i<4; i=i+1){
			for(j=0; j<4; j = j+1){
				System.out.println(" \n O elemento ["+ (i+1)+ "]["+ (j+1)+ "] da matriz B = "+ B[i][j]);
			}
		}

    }

}

PROGAMA 3:
public static void ImprimeVetor(int Vet1[]){
        Scanner entrada = new Scanner(System.in);
        int a, i;
	System.out.println("digite o tamanho do vetor: ");
	a =entrada.nextInt();
	for(i=0; i<a; i=i+1){
            System.out.println(" Digite o elemento "+ (i+1)+ " do vetor: ");
            Vet1[i]= entrada.nextInt();
		}
    }
    public static int MaioresElementos(int Vet1[], int Vet2[]){
        int maior = 0;
        if(Vet1[]>maior && Vet2[]<Vet1[]){
            maior = Vet1[];
            }
        else{
            maior = Vet2[]
        }
