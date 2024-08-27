import java.util.Scanner;
public class 3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        char Mat[][] = new char[150][4];
        GeraMat(Mat, 150, 4);
        GeraMedia(Mat);
        ImprimeConceitoFinal(GeraMedia(Mat));
    }

    public static void GeraMat(char Mat[][], int nlinhas, int ncolunas){
        char conceitos[] = {'A', 'B', 'C','D', 'F'};
        int i, j, valor;
        for (i=0; i<nlinhas; i++){
            for (j=0; j<ncolunas; j++){
                valor = (int) (Math.random()*5); 

                Mat[i][j] = conceitos[valor];
            }
        }
    }
    public static double[] GeraMedia(char Mat[][]){
        double media[] = new double[150];
        for (int i=0; i<150; i++){
               media[i] = ((34*Mat[i][0])+(10*Mat[i][1])+(15*Mat[i][2])+(41*Mat[i][3]))/100;
        }
        return media;
    }
    public static void ImprimeConceitoFinal(double media[]){
        for (int i=0; i<150; i++){
            if (media[i] < 0.8){
                System.out.println("Conceito final = F");
            }
            else {
                if (media[i] <1.5){
                    System.out.println("Conceito final = D");
                }
                else{
                    if (media[i] < 2.5){
                        System.out.println("Conceito final = C");
                    }
                    else{
                        if (media[i] < 3.6){
                            System.out.println("Conceito final = B");
                        }
                        else{
                            System.out.println("Conceito final = A");
                        }
                    }
                }
            }
        }
    }
}