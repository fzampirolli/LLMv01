vet1 = ["Código", "Item", "Preço Unitário"]
vet2 = [300, 201, 302, 303, 304, 305]
vet3 = ["Pão de queijo", "Bauru", "Cachorro Quente", "Cheeseburger", "Suco", "Refrigerante"]
vet4 = [1.30, 1.40, 1.50, 1.40, 2.20, 1.00]
int tam1=3, i
int tam2 =6
for i=0 in range(0, tam1):
    print(vet1[i]+"       ")
print (" ")
for i=0 in range(0, tam2):
    print("  "+vet2[i]+"  "+ vet3[i]+"            "+vet4[i]+"    ")
int codigo
print("Digite o código do produto: ")
codigo=int(input())
double valor=0
while codigo >=300 && codigo <306:
    if codigo == 300:
        valor=valor + 1.30
    else:
        if codigo == 301:
            valor = valor + 1.40
        else:
            if codigo ==302:
                valor=valor + 1.50
            else:
                if codigo==303:
                    valor = valor + 1.40
                else:
                    if codigo == 304:
                        valor = valor + 2.20
                    else:
                        valor = valor + 1.00
    print("Digite o pedido:")
    codigo=int(input())
print ("O valor da compra foi de : "+valor +" reais")
print ("O valor a pagar é:"+ valor)