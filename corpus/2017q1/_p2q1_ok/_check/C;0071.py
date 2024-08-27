int n, i
print("Escreva o tamanho do vetor A e B: ")
n=int(input())
print("Escreva os elementos do vetor A: ")
for i=0 in range(0, n):
print("O vetor A é: ")
for i=0 in range(0, n):
    print(A[i] + " ")
print(" ")
print("Escreva os elementos do vetor B: ")
for i=0 in range(0, n):
print("O vetor B é: ")
for i=0 in range(0, n):
    print(B[i] + " ")
print(" ")
print("O vetor C é: ")
for i=0 in range(0, n):
    if A[i]>B[i]:
        print(A[i] + " ")
    else:
        print(B[i] + " ")