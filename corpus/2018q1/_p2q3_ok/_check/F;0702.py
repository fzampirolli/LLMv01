Scanner ler= new Scanner (System.in)
int x
print("Quantos elementos tem o vetor?")
x= int(input())
for i=0 in range(0, x):
    print("Quais os valores do vetor na posição : " +i)
chamado(v, x)
def chamado(int v[],int x):
    Scanner ler= new Scanner (System.in)
    int l
    print("Quantas linhas tem a matriz?")
    l= int(input())
    int c
    print("Quantas colunas tem a matriz?")
    c= int(input())
    for i=0 in range(0, l):
        for j=0 in range(0, c):
            print("Quais são os valores da matriz na linha "+ i + "e na coluna "+ j)
    return 0