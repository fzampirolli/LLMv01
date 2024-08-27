public static void ImprimeVetor(int Vet1[]){
        Scanner entrada = new Scanner(System.in);
        int a, i;
	System.out.println("digite o tamanho do vetor: ");
	a =entrada.nextInt();
	for(i=0; i<a; i=i+1){
            System.out.println(" Digite o elemento "+ (i+1)+ " do vetor: ");
            Vet1[i]= entrada.nextInt();
		}
    }
    public static int MaioresElementos(int Vet1[], int Vet2[]){
        int maior = 0;
        if(Vet1[]>maior && Vet2[]<Vet1[]){
            maior = Vet1[];
            }
        else{
            maior = Vet2[]
        }
