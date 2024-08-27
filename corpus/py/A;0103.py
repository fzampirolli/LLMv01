int i, n1, k = 30
bool resp
print("Digite o tamanho do vetor:")
n1 = int(input())
print("Digite os elementos do vetor:")
for 0 in range(0, n1):
resp = ComparaVetor(v1, n1, k)
if resp == true:
    print("Existe número menor que 30 nesse vetor.")
    } else {
    print("Não existe número menor que 30 nesse vetor.")
def ComparaVetor(int v[], int n, int k):
    bool resp = false
    int i
    k = 30
    for 0 in range(0, n):
    if v[i] < k:
        resp = true
    return resp