int q=0,t=0
Cardápio()
Pedidos(t)
def Pedidos(int t):
    double soma=0
    int l=-1,qtd=0
    while l!=0:
        print("Digite o código do pedido que deseja fazer :")
        l=int(input())
        if l!=0:
            if l==300:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(1.30*qtd)
            if l==301:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(1.40*qtd)
            if l==302:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(1.50*qtd)
            if l==303:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(1.40*qtd)
            if l==304:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(2.20*qtd)
            if l==305:
                print("Digite a quantidade que deseja comprar :")
                qtd=int(input())
                soma=soma +(1.00*qtd)
        qtd=0
    print("O valor da sua compra é :  "+soma)
    return soma
def Cardápio():
    for q=0 in range(0, 7):
        if q==0:
            for i=0 in range(0, 3):
                if i==0:
                    print(" Código ")
                    print("  ")
                if i==1:
                    print(" Item ")
                    print("  ")
                if i==2:
                    print(" Preço Unitário ")
                    print("  ")
            print("")
        if q==1:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 300 ")
                    print("  ")
                if i==1:
                    print(" Pão de Queijo ")
                    print("  ")
                if i==2:
                    print(" R$ 1,30 ")
                    print("  ")
            print("")
        if q==2:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 301 ")
                    print("  ")
                if i==1:
                    print(" Bauru ")
                    print("  ")
                if i==2:
                    print(" R$ 1,40 ")
                    print("  ")
            print("")
        if q==3:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 302 ")
                    print("  ")
                if i==1:
                    print(" Cachorro Quente ")
                    print("  ")
                if i==2:
                    print(" R$ 1,50 ")
                    print("  ")
            print("")
        if q==4:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 303 ")
                    print("  ")
                if i==1:
                    print(" Cheeseburguer ")
                    print("  ")
                if i==2:
                    print(" R$ 1,40 ")
                    print("  ")
            print("")
        if q==5:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 304 ")
                    print("  ")
                if i==1:
                    print(" Suco ")
                    print("  ")
                if i==2:
                    print(" R$ 2,20 ")
                    print("  ")
            print("")
        if q==6:
            for i=0 in range(0, 3):
                if i==0:
                    print(" 305 ")
                    print("  ")
                if i==1:
                    print(" Refrigerante ")
                    print("  ")
                if i==2:
                    print(" R$ 1,00 ")
                    print("  ")
            print("")