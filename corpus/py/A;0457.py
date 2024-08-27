int i, j, opcao, setor, a, b, i1 = 0, i2 = 0, total
for i=0 in range(0, 60):
    for j=0 in range(0, 40):
print("1) Vender Ingresso")
print("2) Exibir o total de ingressos vendidos")
print("3) Encerrar o Programa")
print("Escolha uma opção: ")
opcao = int(input())
while opcao != 3:
    print("1) Vender Ingresso")
    print("2) Exibir o total de ingressos vendidos")
    print("3) Encerrar o Programa")
    print("Escolha uma opção: ")
    opcao = int(input())
    if opcao == 1:
        print("Digite o setor: ")
        setor = int(input())
        print("Digite o número da fileira: ")
        b = int(input())
        print("Digite o número da cadeira: ")
        a = int(input())
        print("Cadeira já foi vendida.")
        if setor == 1:
            i1 ++
        else:
            i2 ++
    else:
        if opcao == 2:
            total = i1 + i2
            print("Foram vendidos "+total +" ingressos no total.")
print("Programa encerrado.")