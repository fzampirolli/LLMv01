int c= 0, pedido=0, quantidade=0,  sair = 0 
codigo = [100, 101, 102, 103, 104, 105]
preco = [1.1, 1.30, 1.50, 1.30, 2, 1]
double compra =0, soma =0
item = ["Pão de Queijo", "Bauru", "Cachorro Quente", "Cheeseburger", "Suco", "Refrigerante"]
for c=0 in range(0, 6):
    print(codigo[c] + ": " + item[c] + "Preço: " + preco[c])
do {
print("Digite o número de seu pedido: ")
pedido = int(input())
while pedido <100:
    print("Número do código invalido, por favor digite novamente: ")
    pedido = int(input())
while pedido>105:
    print("Número do código invalido, por favor digite novamente: ")
    pedido = int(input())
print("Digite a quantidade desejada: ")
quantidade = int(input())
print("Deseja realizar outra compra? (digite 0 para sair)")
sair = int(input())
for c=0 in range(0, 6):
soma = soma + quantidade*compra
}while (sair != 0)
print("Total da compra: " + soma)