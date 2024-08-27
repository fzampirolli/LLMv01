Scanner sc = new Scanner (System.in)
int tamanho,i,k
bool conf
print("insira o tamanho do vetor: ")
tamanho=int(input())
for i=0 in range(0, tamanho):
print("insira o numero que deseja conferir ")
k=int(input())
conf = comparaVetor (vetor,tamanho,k)
if conf == true:
    print ("Existe número igual a "+ k + "nesse vetor")
else:
def comparaVetor( int v[], int tamanho, int k):
    bool confere=true
    for i=0 in range(0, tamanho):
        confere = true
        else:
    return confere