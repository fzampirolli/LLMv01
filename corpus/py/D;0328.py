Cod = [300, 301, 302, 303, 304, 305]
Item = ["Pão de Queijo", "Bauru", "Cachorro Quente", "Cheesburger", "Suco", "Refrigerante"]
Preco = [1.30, 1.40, 1.50, 1.40, 2.20, 1.00]
int pedido=1
while pedido != 0:
    ImprimeCardapio (Cod, Item, Preco)
    LerPedido (pedido, Cod, Preco)
private static void ImprimeCardapio(list Cod, String[] Item, double[] Preco) {
print("Cardápio: ")
print("Código:")
print("   Descrição:")
print("              Preço:")
for i=0 in range(0, 6):
    print("\n "+Cod[i])
    print("       "+Item[i])
    print("               "+Preco[i])
private static void LerPedido(int pedido, list Cod, double[] Preco) {
print("\n\nDigite aqui o código do produto que você deseja: ")
pedido = int(input())
double valor = 0
while pedido<300 || pedido>305:
    print("Código não existe. Digite aqui o código do produto que você deseja: ")
    pedido = int(input())
print("Quantidade: ")
int qtdd = int(input())
for i=0 in range(0, 6):
print("Preço: " +valor)