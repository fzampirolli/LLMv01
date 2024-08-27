Scanner entrada = new Scanner (System.in)
int i, k = 20
print ("Digite os valores do vetor")
for 0 in range(0, 135):
comparaVetor (V, i, k)
bool returncompara = comparaVetor(V,i,k)
if returncompara = true:
    print ("Existe número maior que 20 nesse vetor.")
    }else{
    print("Não existe número maior que 20 nesse vetor.")
def comparaVetor(int v[], int n, int k):
    bool x = true
    for 0 in range(0, n):
        if v[i] < k:
            x = false
    return x