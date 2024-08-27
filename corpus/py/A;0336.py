int pedido, qtd
float total = 0
codigo = [300, 301, 302, 303, 304, 305]
item = ["Pao de Queijo", "Bauru    ", "Cachorro Quente", "Cheeseburguer", "Suco    ", "Refrigerante"]
preco = [13 , 14 , 15 , 14 , 22 , 10]
print("Codigo\tItem    \t\tPreco Unitario")
for i=0 in range(0, 6):
    print(codigo[i] + "\t" + item[i] + "\t\t" + preco[i]/10)
print()
print("Digite o codigo do produto (300 a 305): ")
pedido = int(input())
while pedido != 0:
    print("Digite a quantidade do produto: ")
    qtd = int(input())
    print("Digite o codigo do produto (300 a 305): ")
    pedido = int(input())
print()
print("Total da compra: " + total)