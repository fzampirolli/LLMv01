int linha, c = 0, i, j
print("Escreva a quantidade de linhas desejadas da matriz A: ")
linha = int(input())
if linha%2==0:
    print("Escreva a quantinha de colunas desejadas da matriz A: ")
    c = int(input())
if c%2==0:
    print("Digite os elementos da matriz A: ")
    for i=0 in range(0, linha):
        for j=0 in range(0, c):
    print("Matriz A: ")
    for i=0 in range(0, linha):
        for j=0 in range(0, c):
            print(A[i][j] + " ")
        print(" ")
    int imaior=0, jmaior=0
    for i=0 in range(0, linha):
        for j=0 in range(0, c):
            if A[i][j]>A[imaior][jmaior]:
                print("Matriz B: ")
                for i=0 in range(0, linha):
                    for j=0 in range(0, c):
                        print(B[i][j] + " ")
                    print(" ")