Cod = [300,301,302,303,304,305]
Item = ["Pão de queijo","Bauru","Cachorro Quente","Cheeseburger","Suco","Refrigerante"]
Preço = [1.30,1.40,1.50,1.50,2.20,1.00]
int n
for n=0 in range(0, 6):
    print(Cod[n]+" ")
    print(Item[n]+" ")
    print("R$"+Preço[n]+" ")
    print()
int a=1,b,i
double total=0
while a>0:
    print("Digite o código do produto (300 a 305): ")
    a= int(input())
    if a>0:
        print("Digite a quantidade do produto: ")
        b= int(input())
        for i=0 in range(0, 6):
print("Total da compra: R$"+total +"0")