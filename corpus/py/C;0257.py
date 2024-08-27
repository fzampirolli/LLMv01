int v[], n, L,g
print("digite o tamanho do vetor")
n=int(input())
for i=0 in range(0, n):
    print("digite o valor da posição "+ i)
g = n-1
for i=0 in range(0, n/2):
    if  v[i] < v[g-i]:
for i=0 in range(0, n):
    print(v[i])