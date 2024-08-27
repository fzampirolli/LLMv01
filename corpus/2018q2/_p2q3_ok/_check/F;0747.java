
import java.util.*;

public class PROVAQ3 {

    public static void main(String[] args) {

        float v1[]= new float [150];
        char p1, p2, a, p;
        float nota1, nota2, nota3;
        Scanner entrada= new Scanner(System.in);
        float v[]= new float [150];
        char mat[][]= new char[3][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<150; j++){
            System.out.println("Digite os conceitos do alunx:");
            mat[i][j]=entrada.next().charAt(0);
            }
        }
        for(int i=0; i<150;i++){
           v[i]=GeraMedia(mat); 
        }
    }
    public static float GeraMedia(char notas[][], float []vetor){
        for(int i=0; i<4; i++){
            for(int j=0; j<150; j++){
                vetor[i]=notas[i][j];
            }
        }
        return ;
    }

}
