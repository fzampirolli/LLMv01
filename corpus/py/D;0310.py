Scanner leitor=new Scanner (System.in)
int cod,quant
double soma=0
print("Código     Item            Preço Unitário ")
print("100        Pão de Queijo             1.10 ")
print("101        Bauru                     1.30 ")
print("102        Cachorro Quente           1.50 ")
print("103        Cheeseburger              1.30 ")
print("104        Suco                      2.00 ")
print("105        Refrigerante              1.00 ")
print()
print("Digite o código do produto(100 a 105): ")
cod=int(input())
if cod == 0:
    print("Total da compra: "+soma)
else:
    if cod == 100:
        print("digite a quantidade: ")
        quant=int(input())
        soma=soma +(1.10*quant)
        print("Digite o código do produto(100 a 105): ")
        cod=int(input())
        if cod == 101:
            print("digite a quantidade: ")
            quant=int(input())
            soma=soma +(1.30*quant)
            print("Digite o código do produto(100 a 105): ")
            cod=int(input())
            if cod == 102:
                print("digite a quantidade: ")
                quant=int(input())
                soma=soma +(1.50*quant)
                print("Digite o código do produto(100 a 105): ")
                cod=int(input())
                if cod == 103:
                    print("digite a quantidade: ")
                    quant=int(input())
                    print("Digite o código do produto(100 a 105): ")
                    cod=int(input())
                    soma=soma +(1.30*quant)
                    if cod == 100:
                        print("digite a quantidade: ")
                        quant=int(input())
                        print("Digite o código do produto(100 a 105): ")
                        cod=int(input())
                        soma=soma +(2.00*quant)
                        if cod == 100:
                            print("digite a quantidade: ")
                            quant=int(input())
                            print("Digite o código do produto(100 a 105): ")
                            cod=int(input())
                            soma=soma +(1.00*quant)