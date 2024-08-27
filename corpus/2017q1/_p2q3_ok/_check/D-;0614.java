
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
       lermatriz()
    }
    public static void lermatriz() {
        Scanner input = new Scanner(System.in);
        System.out.println("informe o tamanho da matriz");
        int m[][] = 
        int n  = input.nextInt(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("informe o valor da posição"+ (i+j));
                m[i][j] = input.nextInt;
            }

        }
    }

}
