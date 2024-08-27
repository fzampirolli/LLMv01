int n, k
Scanner entrada=new Scanner (System.in)
print("insira o numero de linhas")
n=int(input())
print("insira o numero de colunas")
k=int(input())
LerMatriz(A,n,k)
def LerMatriz(int m[][], int n, int k):
    int i, j
    Scanner entrada=new Scanner (System.in)
    for i=0 in range(0, n):
        for j=0 in range(0, k):
            print("digite a entrada"+i +","+j +"da matriz")
    for i=0 in range(0, n):
        for j=0 in range(0, k):