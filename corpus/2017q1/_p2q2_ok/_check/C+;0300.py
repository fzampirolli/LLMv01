double a = 1, b, c, soma = 0
int z
Cod = [100, 101, 102, 103, 104, 105]
Item = ["Pao de Quijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"]
Pre = [(1.10), (1.30), (1.50), (1.30), (2.00), (1.00)]
print("Codigo  Item             Preco unitário")
for i=0 in range(0, 6):
    print(Cod[i])
    print("     ")
    print(Item[i])
    print("   ")
    print(Pre[i])
    print()
print()
while a != 0:
    print("Digite o codigo do produto (100 a 105) epara encerrar digite 0:")
    a = entrada.nextDouble()
    while a != 0:
        print("Digite a quantidade desejada:")
        b = entrada.nextDouble()
        z = a-100
        soma = soma +c
print("Valor Total:")
print(soma)