Scanner teclado = new Scanner (System.in)
int L, C, i, j
print("Digite dimensão para na linha L: ")
L=int(input())
print("Digite Coluna C:")
C=int(input())
float matrizA[][]
for i=0 in range(0, L):
    for j=0 in range(0, C):
        print("Digite o elemento da linha "+(j +1)+" coluna "+(i +1)+":")
for i=0 in range(0, L):
    for j=0 in range(0, C):
        print(matrizA[i][j])
for i=0 in range(0, 5):
    print(matriz[i][n])