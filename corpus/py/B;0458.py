conceitos = ['v','p']
int s,f,c,contador=220
int z
for i=0 in range(0, 11):
    for j=0 in range(0, 10):
for i=0 in range(0, 11):
    for j=0 in range(0, 10):
while contador>0:
    contador=contador-1
    print("o que deseja fazer. 1) vender ingresso. 2)Exibir ingressos vendidos. 3)Encerrar programa ")
    z=int(input())
    if z==1:
        print("\nQual poltrona deseja compra?")
        print("\nsetor entre 1 e 2?")
        s=int(input())
        print("\nfila entre 0 e 9?")
        f=int(input())
        print("\ncadeira entre 0 e 10?")
        c=int(input())
        if s==1:
            print("\n o lugar está vazio, compra efetuada")
            else:
                print("\n o lugar nao está vazio")
                if s==2:
                    print("\n o lugar está vazio, compra efetuada")
    if z==2:
        print("\n setro 1")
        for i=0 in range(0, 11):
            for j=0 in range(0, 10):
                print("\n v para vazio p para comprado, fila "+i +" cadeira "+j +" :"+s1[i][j])
        print("\n setro 1")
        for i=0 in range(0, 11):
            for j=0 in range(0, 10):
                print("\n v para vazio p para comprado, fila "+i +" cadeira "+j +" :"+s2[i][j])
    if z==3:
        print("\n fim do programa")
        contador=0