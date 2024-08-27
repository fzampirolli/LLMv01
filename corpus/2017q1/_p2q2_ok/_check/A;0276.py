int codigo, qtde=0
double pcototal=0
cod = [300, 301, 302, 303,304,305]
item = ["Pão de Queijo","Bauru","Hot Dog","Cheese burguer","Suco","Refri"]
pco = [1.3,1.4,1.5,1.5,2.2,1.0]
for i=0 in range(0, item.length):
    print(cod[i]+" "+item[i]+" "+pco[i])
print("Digite o Código do produto desejado: ")
Scanner sc = new Scanner (System.in)
codigo=int(input())
while codigo!=0:
    for i=0 in range(0, 6):
        print("Digite a qtde desejada: ")
        qtde=int(input())
        qtde=0
    print("Digite o Código do produto desejado: ")
    codigo=int(input())
print("Total da compra: "+pcototal)