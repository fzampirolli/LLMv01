
public class P2 {

    public static void main(String[] args) {
        final int MAX=50;
        int V[]=new int[MAX];
        System.out.println("Preencher vetor:");
        for(int i=0; i<MAX; i++){
            V[i] = (int) (Math.random()*72-21);
            System.out.println(V[i]);

        }
        System.out.println("O elemento de índice 10 é: "+V[10]);
        System.out.println();

    }   

}  
