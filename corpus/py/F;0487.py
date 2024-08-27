int k=4 int p=4
int i,j
for q=0 in range(0, k):
    for h=0 in range(0, p):
        print("Digite p ou v")
print("a) Vender ingressos:")
print("b) Exibir total de ingressos")
print("c) SAIR")
w=ch.next().charAt(0)
if w=='a':
    print("Digite a fileira 0 a 3")
    i=int(input())
    print("Digite o numero da cadeira (0 a 3:")
    j=int(input())
    print("Lugar vazio, pode comprar!")
else:
    for i=0 in range(0, k):
        for j=0 in range(0, k):
            print(mat[i][j]+" ")
        print("")
else:
    print("fim")