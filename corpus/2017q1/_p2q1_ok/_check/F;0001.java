
public class Q1 {

    public static void main(String[] args) {

        int A[]={42,30,-215,20,25,7};
        int B[]={12,103,49,20,55,7};
        int C[]=new int [6];

        System.out.println("O vetor A é: ");
        ImprimeVetor(A);
        System.out.println("\nO vetor B é: ");
        ImprimeVetor(B);

        C=MaioresElementos(A,B);

        System.out.println("\nO vetor C é: ");
        ImprimeVetor(C);

    }

    public static void ImprimeVetor (int Vet1[])
    {
    for (int i = 0; i<Vet1.length;i++)
    {
        System.out.print(" "+ Vet1[i]);
    }

    }

    public static int [] MaioresElementos(int Vet1[],int Vet2[]){
        int K=Vet1.length;
        int A[]= new int [K];
        for(int c=0;c<Vet1.length;c++)     
        {
            if (Vet1[c]>Vet2[c])
            {
            A[c]=Vet1[c];    
            }
            else if (Vet2[c]>Vet1[c]) 
            {
              A[c]=Vet2[c];   
            }
            else if(Vet1[c]==Vet2[c])
            {
                A[c]=Vet1[c];
            }
        }
        return A;
    }

}
