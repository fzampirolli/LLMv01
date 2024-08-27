A = [-62,8,98,75,26,77]
B = [-102,0,102,0,26,79]
ImprimeVetor (A)
ImprimeVetor (B)
C = MaioresElementos (A,B)
ImprimeVetor (C)
def ImprimeVetor(int Vet1[]):
    A = [-62,8,98,75,26,77]
    B = [-102,0,102,0,26,79]
    Scanner input = new Scanner (System.in)
    for i=0 in range(0, 6):
        print(A[i]+"   ")
    print("")
    for j=0 in range(0, 6):
        print(B[j]+"   ")
    print("")
def MaioresElementos(int Vet1[], int Vet2[]):
    A = [-62,8,98,75,26,77]
    B = [-102,0,102,0,26,79]
    int x = 0
    int xmaior = 0
    Scanner input = new Scanner (System.in)
    for i=0 in range(0, 6):
        if A[i]>x:
            x = xmaior