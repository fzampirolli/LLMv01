int validacao, contadorA=0, codigo, quantidade, qtprod, n=0
A = [100, 101, 102, 103, 104, 105]
B = ["Pao de queijo", "Bauru", "Cachorro quente", "Cheeseburger", "Suco", "Refrigerante"]
C = [1.10, 1.30, 1.50, 1.30, 2.00, 1.00]
double soma = 0.0
for 0 in range(0, 6):
    print("Código: " + A[i] + " Produto: " + B[i] + " Preço: " + C[i])
print("Digite qualquer número para fazer o pedido ou 0 pra sair")
validacao = int(input())
if validacao != 0:
    print("Quantos produtos deseja comprar? ")
    qtprod = int(input())
    for 0 in range(0, qtprod):
        print("Digite o código do produto que deseja e a quantidade em seguida ")
        codigo = int(input())
        quantidade = int(input())
        for 0 in range(0, 6):
            print("Você pediu " + quantidade + B[i] + "preço " + C[i] * quantidade + "Reais")
    } else {
    print("Obrigado!")
print("O valor total da compra é de " + soma)