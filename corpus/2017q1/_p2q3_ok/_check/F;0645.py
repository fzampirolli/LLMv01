int l=0, c=0
int i, k
Scanner leitor= new Scanner (System.in)
print("Digite um numero par de linhas:")
l = int(input())
print("Digite um numero par de colunas:")
c = int(input())
if l%2!=0 || c%2!=0 :
    print("Apenas numeros pares, rode o programa novamente!")
for i=0 in range(0, l):
    for k=0 in range(0, c):
        print("Digite o valor da linha "+i +" coluna "+k)