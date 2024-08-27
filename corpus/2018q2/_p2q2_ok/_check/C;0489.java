import java.util.Scanner;
public class 2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        char A[][] = new char[10][11];
        char B[][] = new char[10][11];
        int i, j, fila, cadeira, cont=0;
        char setor;
        for (i=0; i<10; i++){
            for (j=0; j<11; j++){
                A[i][j] = 'v';
                B[i][j] = 'v';
            }
        }
        System.out.println("Informe o setor: ");
        setor = entrada.nextLine().charAt(0);
        while (setor!='A' && setor!='B'){
            System.out.println("Escolha entre setor A ou setor B. ");
            setor = entrada.nextLine().charAt(0);
        }
        System.out.println("Informe o número da fila e o número da cadeira: ");
        fila = entrada.nextInt();
        cadeira = entrada.nextInt();
        while (fila >10 && cadeira >11){
            System.out.println("Há no máximo 10 filas e 11 cadeiras disponíveis: ");
            fila = entrada.nextInt();
            cadeira = entrada.nextInt();
        }
        if (A[fila][cadeira]=='v'){
            A[fila][cadeira]='p';    
        } 
        else {
            System.out.println("cadeira já foi vendida. ");
        }
        for (i=0; i<10; i++){
            for (j=0; j<11; j++){
                if (A[i][j]=='p'){
                    cont ++;
                }
            }
        }
        System.out.println("O número de cadeiras vendidas é; "+cont);
    }
}