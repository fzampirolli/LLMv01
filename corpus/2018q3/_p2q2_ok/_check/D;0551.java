
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i,j,n,A[][],contb=0,contp=0;

        System.out.println("digite o tamanho da matriz quadrada");
        n=ler.nextInt();

        A= new int [n][n];

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                A[i][j]=ler.nextInt();
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){

                if(i%2==0){
                  if(j%2==0){
                       contp=contp+A[i][j];

                  }
                  else{
                      contb=contb+A[i][j];
                  }
                }
                else{

                  if(i%2==0){
                      contb=contb+A[i][j];

                  } 
                  else{
                      contp=contp+A[i][j];
                  }
                }
            }
        }

        int r=0;
        if(contp==contb){
            r=2;
        }
        else if(contp<contb){
            r=1;
        }
        else if(contp>contb){
            r=0;
        }
        System.out.printf("%d %d %d\n",contp,contb,r);

    }

}
