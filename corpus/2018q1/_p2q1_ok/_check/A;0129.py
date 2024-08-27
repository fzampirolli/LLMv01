int t,i,k = 40
bool g
print("O tamanho do vetor será: ")
t = int(input())
for i=0 in range(0, t):
    print("Digite o número que deverá estar na posição "+(i +1))
g = comparaVetor(A,t,k)
if g == false:
    print("Não há o número 40 nesse vetor")
    }else if(g == true){
    print("Há o número 40 nesse vetor")
def comparaVetor(int A[],int t,int k):
    bool g=false
    for i=0 in range(0, t):
        g=true
    return g