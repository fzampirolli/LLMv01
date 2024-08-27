String A,B,C
int setor,K=1,L=2, i=40, j=60
char opcao
print("MENU, digite sua opção: ")
print("A)Vender ingressos")
print("B)Exibir total de ingressos vendidos")
print("C)Encerrar o programa")
opcao = entrada.nextLine().charAt(0)
int f,c,aux
if opcao=='A':
    print("Digite o setor desejado, 1 ou 2: ")
    setor = int(input())
    if setor==K:
        print("Digite a fileira desejada")
        f = int(input())
        print("Digite a cadeira desejada")
        c = int(input())
        f=i
        c=j
        print(W[i][j])
        print("Cadeira: " + W[f][i] + "vendida")
    if setor==L:
        print("Digite a fileira desejada")
        f = int(input())
        print("Digite a cadeira desejada")
        c = int(input())
        print(Z[f][i])
        print("Cadeira: " + Z[f][i] + "vendida")
if opcao=='B':
if opcao=='C':
    print("Programa encerrado.")