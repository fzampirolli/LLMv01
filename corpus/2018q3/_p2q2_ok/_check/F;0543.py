Scanner entrada = new Scanner (System.in)
int npos, n
print("Digite um numero n positivo entre 2 e 18: ")
npos = int(input())
print("Digite o tamanho desejado da matriz n x n: ")
n = int(input())
for i=0 in range(0, n):
    for j=0 in range(0, n):
        print("Digite o número de milhos na posição i" + (i +1)+ " e posição j"+ (j +1))
for i=0 in range(0, n):
    print(" ")
    for j=0 in range(0, n):
        print(A[i][j] + " ")