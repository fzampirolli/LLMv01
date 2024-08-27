int codigo[], digitado, quantos
String item[]
for k=0 in range(0, 6):
print("Digitar a seguir os códigos seguidos das quantidades de produtos desejados: ")
do{
digitado= int(input())
quantos= int(input())
int k
for k=0 in range(0, 6):
while digitado!=0:
    print("Código  Preço  Produto")
    int i
    for i=0 in range(0, 6):
        print(codigo[i]+"     "+preco[i]+"     "+item[i])
    print("Total da compra: "+valort)