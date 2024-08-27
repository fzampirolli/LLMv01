print("verificador de numero menor que 30 no vetor: ")
print("Digite os valores do vetor: ")
for 0 in range(0, A.length):
comparaVetor(A, 3, 30)
def comparaVetor(int v[], int n, int k):
    bool num = false
    int a = 0, b =0
    for i=0 in range(0, v.length):
        if v[i] < 30:
            a = a + 1
            num = true
        else:
            num = false
            b = b + 1
    if a>0:
        print("Existe número menor a 30 nesse vetor.")
    else:
        print("Nao existe número menor a 30 nesse vetor.")
    return num