Scanner Teclado=new Scanner (System.in)
print("CÓDIGO      ITEM            PREÇO UNITÁRIO  ")
print("100       Pão de Queijo        1.10")
print("101       Bauru                1.30")
print("102       Cachorro Quente      1.50")
print("103       Cheeseburguer        1.30")
print("104       Suco                 2.00")
print("105       Refrigerante         1.00")
print(" ")
print("Digite o código do produto: ")
double produto =int(input())
print("Digite a Quantidade do produto: ")
int quantidade =int(input())
if produto==100:
    double preco=1.10
    double valortotal=preco*quantidade
    print("Total da compra: " +valortotal)
else:
    if produto==101:
        double preco=1.30
        double valortotal=preco*quantidade
        print("Total da compra: " +valortotal)
    else:
        if produto==102:
            double preco=1.50
            double valortotal=preco*quantidade
            print("Total da compra: " +valortotal)
        else:
            if produto==103:
                double preco = 1.30
                double valortotal=preco*quantidade
                print("Total da compra: " +valortotal)
            else:
                if produto==104:
                    double preco=2.00
                    double valortotal=preco*quantidade
                    print("Total da compra: " +valortotal)
                else:
                    if produto==105:
                        double preco=1.00
                        double valortotal=preco*quantidade
                        print("Total da compra: " +valortotal)