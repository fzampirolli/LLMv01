int n, k=20
print("Digite o tamanho do vetor V : ")
n = int(input())
for i=0 in range(0, n):
    print("Digite o valor para a posição "+(i +1)+"ºdo vetor V : ")
print(comparaVetor)
def comparaVetor(int V[], int n, int k ):
    bool controle = false
    for i=0 in range(0, n):
        if V[i]>k:
            controle = true
        else:
            controle = false
    return controle