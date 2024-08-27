int i, j, v=0, s,f,c, r, setor,p=0, ingresso=0
for i=0 in range(0, 39):
    for j=0 in range(0, 59):
print("1-Vender ingresso | 2-Exibir o total de ingressos vendidos | 3-Encerrar o programa")
r = int(input())
while r !=3:
    if r==1:
        print("Insira o setor (1 ou 2)")
        setor = int(input())
        print("Insira o numero da fila")
        i = int(input())
        print("Insira o numero da cadeira")
        j = int(input())
        if setor == 1:
            print("cadeira vazia")
            v = p
            ingresso ++
            else:
        if setor == 2:
            print("cadeira vazia")
            v = p
            ingresso ++
            else:
    if r==2:
        print("Foram vendidos "+ingresso +" ingressos")
    print("1-Vender ingresso | 2-Exibir o total de ingressos vendidos | 3-Encerrar o programa")
    r = int(input())