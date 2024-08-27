1 programa:
double soma=0
int a, b, c, d ,f, g, codigo
print(" CÓDIGO: 300	|	ITEM: Pão de Queijo		|	PREÇO UNITÁRIO: 1,30 ")
print(" CÓDIGO: 301	|	ITEM: Bauru			|	PREÇO UNITÁRIO: 1,40 ")
print (" CÓDIGO: 302	|	ITEM: Cachorro Quente           |	PREÇO UNITÁRIO: 1,50 ")
print (" CÓDIGO: 303	|	ITEM: Chesseburguer		|	PREÇO UNITÁRIO: 1,40 ")
print (" CÓDIGO: 304	|	ITEM: Suco			|	PREÇO UNITÁRIO: 2,20 ")
print (" CÓDIGO: 305	|	ITEM: Refrigerante		|	PREÇO UNITÁRIO: 1,00 ")
print("Digite o código do produto(300 a 305): ")
codigo = int(input())
while  codigo!=0:
    print("Digite a quantidade de produtos: ")
    a= int(input())
    soma = soma +(a* (1.30))
    print("digite o código do produto(300 a 305): ")
    codigo= int(input())
    else:
        print("Digite a quantidade de produtos: ")
        b= int(input())
        soma = soma +(b*1.40)
        print("digite o código do produto(300 a 305): ")
        codigo= int(input())
        print("Digite a quantidade de produtos: ")
        c= int(input())
        soma = soma +(c*1.50)
        print("digite o código do produto(300 a 305): ")
        codigo= int(input())
        print("Digite a quantidade de produtos: ")
        d= int(input())
        soma = soma +(d*1.40)
        print("digite o código do produto(300 a 305): ")
        codigo= int(input())
        print("Digite a quantidade de produtos: ")
        f = int(input())
        soma = soma +(f*2.20)
        print("digite o código do produto(300 a 305): ")
        codigo = int(input())
        print("Digite a quantidade de produtos: ")
        g= int(input())
        soma = soma +(g*1)
        print("digite o código do produto(300 a 305): ")
        codigo= int(input())
print(" a soma é igual a: "+ soma)
PROGRAMA 2:
int i, j
for i=0 in range(0, 4):
    for j=0 in range(0, 4):
        print(" Digite o elemento da linha "+ (i +1)+ " e coluna "+ (j +1)+ " da matriz: ")
for i=0 in range(0, 3):
    for j=2 in range(2, 4):
for i=0 in range(0, 4):
    for j=0 in range(0, 2):
for i=2 in range(2, 4):
    for j=2 in range(2, 4):
for i=0 in range(0, 4):
    for j=0 in range(0, 4):
for i=0 in range(0, 4):
    for j=0 in range(0, 4):
PROGAMA 3:
def ImprimeVetor(int Vet1[]):
    int a, i
    print("digite o tamanho do vetor: ")
    a =int(input())
    for i=0 in range(0, a):
        print(" Digite o elemento "+ (i +1)+ " do vetor: ")
def MaioresElementos(int Vet1[], int Vet2[]):
    int maior = 0
    if Vet1[]>maior && Vet2[]<Vet1[]:
    else: