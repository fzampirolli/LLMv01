int i, quant, quant1=0, quant2=0, quant3=0, quant4=0, quant5=0, quant6=0
double valor=0
Codigo = [300, 301, 302, 303, 304, 305]
Item = ["Pão de queijo", "Bauru", "Cachorro Quente", "Cheeserburguer", "Suco", "Refrigerante"]
Preco = [1.3, 1.4, 1.5, 1.4, 2.2, 1]
for i=0 in range(0, 6):
    print("O código do item "+Item[i]+" é: "+Codigo[i])
for i=0 in range(0, 6):
    print("Insira o Codigo do item escolhido ")
    print("Informe a quantidade desse item: ")
    quant=int(input())
for i=0 in range(0, 6):
    quant1=quant
    quant2=quant
    quant3=quant
    quant4=quant
    quant5=quant
    quant6=quant
print("Total da compra: "+valor)