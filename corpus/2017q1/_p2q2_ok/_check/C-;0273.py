int i=0,j=0, k=0, codigopedido=1, c=0, qtde=0
double conta=0
int codes[]
String nomes[]
int puni[]
for i=0 in range(0, 6):
    print("Digite os códigos dos produtos: ")
    sc.nextInt(codes[i])
for j=0 in range(0, 6):
    print("Digite os nomes dos produtos: ")
    sc.next(nomes[j])
for k=0 in range(0, 6):
    print("Digite os preço unitário dos produtos: ")
    sc.nextInt(puni[k])
print("Código   Item   Preço Unitário")
i = 0
j = 0
k = 0
while i<6:
    print(codes[i]+"  "+nomes[j]+"  "+puni[k])
    i ++
    j ++
    k ++
while codigopedido != 0:
    print("Digite o código do seu pedido (100 a 105): ")
    sc.nextInt(codigopedido)
    for i=0 in range(0, 6):
        i=c
        print("Digite a Quantidade de Produtos")
        sc.nextInt(qtde)
print("Total da compra: "+conta)