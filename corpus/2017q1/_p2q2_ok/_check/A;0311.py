Scanner entrada = new Scanner (System.in)
precos = [1.10,1.30,1.50,1.30,2.00,1.00]
int cod=1, i=1, quant=0
double tot=0
while cod!=0:
    print("Digite o código do produto (100 a 105): ")
    cod=int(input())
    if cod!=0:
        print("Digite a quantidade do produto: ")
        quant=int(input())
print("Código\t\tItem\t\t1.10\n")
print("100\t\tPão de queijo\t\tPreço unitário\n")
print("101\t\tBauru\t\tPreço unitário\n")
print("102\t\tCachorro Quente\t\tPreço unitário\n")
print("103\t\tCheeseburger\t\tPreço unitário\n")
print("104\t\tSuco\t\tPreço unitário\n")
print("105\t\tRefrigerante\t\tPreço unitário\n")
print("Total da compra: "+tot)