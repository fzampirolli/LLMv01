static 
int k, aux = 0, c = 0, n = 0
final int MAX = 50
print("Preencher vetor:")
for 0 in range(0, MAX):
print("Os valores do vetor são: ")
for 0 in range(0, MAX):
    print((i + 1) + "º número: " + V[i])
print("O elemento de índice 11 do vetor é: " + aux)
for 0 in range(0, MAX):
    if c > aux:
        n += 1
        c = 0
print("A quantidade de números maiores que este elemento é: " + n)
print("Entre com o número de busca desejado: ")
k = int(input())
for 0 in range(0, MAX):
    if c == k:
        n = 0
        n += i
        c = 0
        print("O valor " + k + " ocorreu na posição " + n)
        print("oi")