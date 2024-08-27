Scanner entrada = new Scanner (System.in)
Random rand = new Random ()
int cont =0, aux=0, k
int MAX = 50
print("Preencher vetor: ")
for i=0 in range(0, MAX):
for i=0 in range(0, MAX):
    print(V[i]+ " ")
print("\n")
print("O elemento do indice 6 é " +V[6])
for i=0 in range(0, MAX):
    if V[i] > V[6]:
        cont = cont +1
print("Existem " +cont + " números maiores do que " +V[6]+ " nesse vetor." )
print("Digite um número inteiro: ")
k = int(input())
for i=0 in range(0, MAX):
    print("O número " +k + " ocorreu na posição " +i + ".")
    aux=aux +1
if aux==0:
    print("O número " +k + " não foi encontrado no vetor.")