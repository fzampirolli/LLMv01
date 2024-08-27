
import java.util.Scanner;

public class JavaApplication3exercios2 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int setor[]=new int[2];
      for(int i=0;i<2;i++){
          System.out.println("Digite o setor");
          setor[i]=entrada.nextInt();
            if(setor[i]==1){
                int matriz[][]=new int[11][10];
                for(int j=0;j<11;j++){
                for(int k=0;k<11;k++){    

                matriz[j][k]=entrada.nextInt(2);

          }

      }

    }

}
    }
}
