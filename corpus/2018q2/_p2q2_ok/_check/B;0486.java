
import java.util.Scanner; 

public class Questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

        String matriz1 [][] = new String [40][60];
        String matriz2 [][] = new String [40][60];

        inicializacao (matriz1, matriz2, 40, 60);

        System.out.println ("Escolha uma das opçoes abaixo: "); 
        System.out.println ("\nA) Vender Ingresso \nB)Exibir o total de ingressos vendidos \n C) Encerrar o Programa");
        String r = teclado.next(); 

        while (!r.equals ("C")){
            if (r.equals ("A")){
                Venda (matriz1, matriz2, 40, 60);

            }
            if (r.equals ("B")){
                TotalIngressos (matriz1, matriz2, 40, 60);

            }

        System.out.println ("Escolha uma das opçoes abaixo: "); 
        System.out.println ("\nA) Vender Ingresso \nB)Exibir o total de ingressos vendidos \n C) Encerrar o Programa");
        r = teclado.next(); 

        }
        for (int i=0; i<40; i++){
            for (int j=0; j<60; j++){ 
         System.out.print (" "+ matriz1[i][j]);
            }
        System.out.println (" ");
        }

         for (int i=0; i<40; i++){
            for (int j=0; j<60; j++){ 
         System.out.print (" "+ matriz2[i][j]);
            }
        System.out.println (" ");

         }

    }

public static void inicializacao(String M1[][], String M2[][], int n, int m ){
    Scanner teclado = new Scanner (System.in);
    System.out.println ("SETOR 1");
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){ 
            M1[i][j] = "v";

            System.out.print (" "+ M1[i][j]);
        }
        System.out.println (" ");

        }

            System.out.println ("SETOR 2");
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){ 
                M2[i][j] = "v";

            System.out.print (" "+ M2[i][j]);
            }
        System.out.println (" ");

        }
    }

public static void Venda (String M1[][], String M2 [][],int n, int m){
     Scanner teclado = new Scanner (System.in);
     System.out.println("Digite o setor: ");
     int s = teclado.nextInt (); 
     System.out.println("Digite a fileira: ");
     int i = teclado.nextInt (); 
     System.out.println("Digite a poltrona: ");
     int j = teclado.nextInt (); 

     if (s==1){
         int vendido = 0;

                 if (M1[i][j].equals ("v")){
                     System.out.println("Poltrona livre ");
                     M1[i][j] = "p"; 
                     vendido ++; 

                 }
                 else { 
                     System.out.println("Poltrona ocupada! ");

                 }
             }

     if (s==2){
         int vendido = 0;

                 if (M2[i][j].equals ("v")){
                     System.out.println("Poltrona livre ");
                     M2[i][j] = "p"; 
                     vendido ++; 

                }
                 else {
                     System.out.println("Poltrona ocupada!");
                }

           }

        }

public static void TotalIngressos (String M1[][], String M2 [][],int n, int m){

     for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){ 
            if (!M1[i][j].equals("v")){
                int contvenda1=0;
                contvenda1 ++; 
                System.out.println("O total de ingressos vendidos do setor 1 foi "+contvenda1);
        }

        }
    }

            for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){ 
            if (!M2[i][j].equals("v")){
               int contvenda2=0;
                contvenda2 ++; 
                System.out.println("O total de ingressos vendidos do setor 1 foi "+contvenda2);
        }

        }
    }

}

}
