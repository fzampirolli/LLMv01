int max=50, aux=0, num, aux2=0
print("preenche vetor:")
for i=0 in range(0, max):
for i=0 in range(0, max):
    print(v[i]+" ")
print("\n")
print(v[11])
for i=0 in range(0, 50):
    if v[i]>v[11]:
        aux=aux +1
print("O número de elementos maior que v[11] é "+aux)
print("Digite o número que deseja buscar:")
num=int(input())
for i=0 in range(0, max):
    print("O número " +num + " ocorreu na posição "+i + " do vetor")
    aux2=aux2 +1
    if aux2==50:
        print("O número " +num + " não está no vetor.")