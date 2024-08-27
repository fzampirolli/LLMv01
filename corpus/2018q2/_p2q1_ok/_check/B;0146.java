
import java.util.*;

public class PROVAQ1 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        int max=50, aux=0, num, aux2=0;
        int v[]=new int [max];
        System.out.println("preenche vetor:");
        for (int i=0; i<max; i++){
            v[i]=(int)(Math.random()*72-21);
        }
        for (int i=0; i<max; i++){
            System.out.print(v[i]+" ");
        }
        System.out.println("\n");
        System.out.println(v[11]);  
        for (int i=0; i<50; i++){
            if(v[i]>v[11]){
                aux=aux+1;
            }
        }
        System.out.println("O número de elementos maior que v[11] é "+aux);
        System.out.println("Digite o número que deseja buscar:");
        num=entrada.nextInt();
        for(int i=0; i<max; i++){
            if (num==v[i]){
                System.out.println("O número " +num+ " ocorreu na posição "+i+ " do vetor");
            }
            if(num!=v[i]) {   
                aux2=aux2+1;
            }
            if (aux2==50){   
                System.out.println("O número " +num+ " não está no vetor.");
            }
        }

    }

}
