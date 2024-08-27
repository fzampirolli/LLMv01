
public class Questao1 {
 public static void main(String[] args) {

     int A []= {42,30,-215,20,25,7};
     int B []= {12,103,49,20,55,7};
     int C []= new int [6];

     ImprimeVetor(A);
     ImprimeVetor (B);

     C = MaioresElementos(A,B);
     ImprimeVetor (C);

 }
 public static void ImprimeVetor (int Vet1[]){
     int i;
     for (i=0; i<Vet1.length; i++){
         System.out.println(Vet1[i]);
     }
 }
 public static int [] MaioresElementos(int Vet1[], int Vet2[]){
     int i;
     int C [] = new int [6];
     for (i=0; i<6; i++){
         if(Vet1[i]>= Vet2[i]){
          C[i]= Vet1[i];   
         }else{
             C[i]= Vet2[i];
         }

     }
     return C;
 }
}
