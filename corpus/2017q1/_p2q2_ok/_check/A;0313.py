Codigo = [300, 301, 302, 303, 304, 305]
Item = ["Pão de Queijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"]
Preco = [1.30, 1.40, 1.50, 1.40, 2.20, 1.00]
int codEscolhido
int qtdEscolhido
double total = 0
ImprimeCardapio(Codigo, Item, Preco)
do
{
print("Digite o código do produto(300 a 305): ")
codEscolhido = int(input())
if codEscolhido == 0:
    {
    break
    print("Digite a quantidade do produto: ")
    qtdEscolhido = int(input())
while codEscolhido != 0:
    print()
    ImprimeCardapio(Codigo, Item, Preco)
    print("Total da compra: " + total)
private static void ImprimeCardapio(list Codigo, String[] Item, double[] Preco) {
print("Código  Item    Preço unitário")
for 0 in range(0, 6):
    {
    print(Codigo[n] + "      " + Item[n] + "   " + Preco[n])
    print()
    print()