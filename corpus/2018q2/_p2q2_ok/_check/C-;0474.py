int M, l, c, ala, tot=0
for l=0 in range(0, 10):
    for c=0 in range(0, 11):
for l=0 in range(0, 10):
    for c=0 in range(0, 11):
print("Menu: digite 1 para comprar ingresso, 2 para ver total de ingressos vendidos e 3 para encerrar programa")
M=int(input())
if M==1:
    print("digite a ala em que deseja comprar(1 ou 2): ")
    ala=int(input())
    if ala==1:
        print("digite a fila e a fileira do assento que deseja adiquirir")
        l=int(input())
        c=int(input())
        print("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa")
    if ala==2:
        print("digite a fila e a fileira do assento que deseja adiquirir")
        l=int(input())
        c=int(input())
        print("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa")
    if M==2:
        print("venda realizada com sucesso, digite 1 para continuar comprando, 2 para total de ingressos vendidos e 3 para encerrar programa")