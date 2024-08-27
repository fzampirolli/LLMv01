
import java.util.Scanner;

public class Questao3P2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); 
        int l, c,valor;
        char conceitos[]={'A','B','C','D','F'};
        char A[][]=new char [150][4];
        for(l=0;l<150;l++){
            for(c=0;c<4;c++){
                valor= (int) (Math.random()*5);
                A[l][c]=conceitos[valor];}}

       Imprimeconceitofinal(Geramedia(A));
        }

        public static float[] Geramedia(char ori[][]) {
            int cont=0, n1,n2,n3,n4,MED,l,c;
            float V[]=new float [151];
            for(l=0;l<150;l++){
                for(c=0;c<4;c++){
                if(ori[l][c]=='A'){V[cont+1]=4;}
                if(ori[l][c]=='B'){V[cont+1]=3;}
                if(ori[l][c]=='C'){V[cont+1]=2;}
                if(ori[l][c]=='D'){V[cont+1]=1;}
                if(ori[l][c]=='F'){V[cont+1]=0;}}}
            V[l]=(V[0]*38+V[1]*10+V[2]*15+37*V[3])/100;
            return V;}
        public static void Imprimeconceitofinal(float mf[]) {
            int l;
            for(l=0;l<150;l++){
                if(mf[l]<0.8){System.out.println("media F");}else
                if(mf[l]<1.5){System.out.println("media D");}else
                if(mf[l]<2.5){System.out.println("media C");}else
                if(mf[l]<3.6){System.out.println("media B");}else
                    System.out.println("media A");}}

                }
