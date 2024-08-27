
int n = 125
int k = 30
bool resultado = false
for a=0 in range(0, n):
    Scanner entrada = new Scanner (System.in)
    print("Digite um número inteiro: ")
resultado = comparaVetor(v, n, k)
if resultado=true:
    print("Existe número menor a 30 nessa vetor. ")
    }else{
    print("Não existe número menor a 30 nessa vetor. ")
def comparaVetor(int v[], int n, int k):
    bool result = false
    for a=0 in range(0, n):
        if v[a]< k:
            result = true
    return result