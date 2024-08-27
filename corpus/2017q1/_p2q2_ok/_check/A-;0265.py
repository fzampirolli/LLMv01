int num=1
int i
int cont=0
double qtd, cont1 = 0
while num!=0:
    print(" Codigo  |      Item      | Preco unitario")
    for i=0 in range(0, 5):
        print("   "+Cod[i]+"   |"+it[i])
        if i==0:
            print("   |")
        else:
            if i==1:
                print("           |")
            else:
                if i==2:
                    print(" |")
                else:
                    if i==3:
                        print("    |")
                    else:
                        if i==4:
                            print("            |")
                        else:
                            if i==5:
                                print("    |")
        print(" "+Pr[i]+" ")
    print("Digite o codigo do produto desejado")
    num = int(input())
    if num!=0:
        print("Digite a quantidade")
        qtd = int(input())
        for i=0 in range(0, 5):
            cont = i
print("Total da Compra = R$"+cont1)