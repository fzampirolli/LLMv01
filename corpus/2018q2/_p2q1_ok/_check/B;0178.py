final int MAX = 20
print("Preencher o vetor:")
for i=0 in range(0, MAX):
i=0
while i<MAX:
    print(V[i])
    i ++
print("O valor do vetor de índice 13 é: "+V[13])
i=0
print("Os valores dos vetores maiores ou iguais ao vetor 13 com valor igual a " +V[13]+ ", são: \n")
while i<MAX:
    print(V[i])
    i ++
print("Digite um número para busca: ")
k = int(input())
i=0
int t=0
while i<MAX:
    while i<MAX:
        t ++
        print("O número "+k +" esta na posição "+i + " do vetor.")
        i ++
    if t==0:
        print("O número "+k + " não foi encontrado no vetor.")