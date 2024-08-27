
public class Main {

    public static void main(String[] args) {
        int A[] = {-62,8,98,75,26,77};
        int B[] = {-102,0,102,0,26,79};
        int C[] = new int[6];

        System.out.println("a) ImprimeVetor(A) ");
        ImprimeVetor(A);
        System.out.println("b) ImprimeVetor(B) ");
        ImprimeVetor(B);
        C = MaioresElementos(A,B);
        System.out.println("c) ImprimeVetor(C) ");
        ImprimeVetor(C);

    }

    public static void ImprimeVetor(int Vet1[]){
        String s = "";
        for(int i = 0; i<Vet1.length;i++){
            s += Vet1[i]+" \t";
        }
        System.out.println(s);
    }

    public static int[] MaioresElementos( int Vet1[] ,int Vet2[]){
            int v[] = new int[6];
            for(int i =0; i<Vet1.length;i++){
                if(Vet1[i] > Vet2[i]){
                v[i] = Vet1[i];
                }else{
                v[i] = Vet2[i];
                }
            }
            return v;
        }
}
