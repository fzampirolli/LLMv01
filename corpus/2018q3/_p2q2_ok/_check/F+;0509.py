Scanner leitor = new Scanner (System.in)
print("Digite o tamanho de um dos lados do tabuleiro")
int n = int(input())
while n<2 || n>20:
    print("Para o lado do tabuleiro, favor digitar um número entre 2 e 20")
    n = int(input())
for i=0 in range(0, n):
    for j=0 in range(0, n):
        print("Digite o valor da posição "+ i +", "+ j)
int contpreta=0, contbranca=0
for i=0 in range(0, n):
    for j=0 in range(0, n):
        if i>0:
            if j>0: