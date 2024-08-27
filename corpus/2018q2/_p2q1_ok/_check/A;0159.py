Scanner sca = new Scanner (System.in)
final int MAX = 50
int cont, i
cont=0
print("Preencher o vetor")
for i=0 in range(0, MAX):
    print(V[i])
print("O número dentro do V[12] é " + V[12])
for i=0 in range(0, MAX):
    if V[i]>V[12]:
        cont ++
print("A quantidade de números maiores que o número dentro do V[12] é " + cont)
int k
print("Agora digite um número qualquer para verificarmos se ele pertence ao vetor ")
k=int(input())
int a=0
cont=0
for i=0 in range(0, MAX):
    print("o número "+  k + " apareceu no vetor na posição " + i)
    cont ++
if cont==0:
    print("o número  " + k + " não foi encontrado em nenhuma posição")