int i, j
double  preco
A = [1.10,1.30,1.50,1.30,2.00,1.00]
print("Cód.   Item             Preço unitário")
print("100    Pão de queijo        1,10")
print("101    Bauru                1,30")
print("102    Cachorro quente      1,50")
print("103    Cheeseburguer        1,30")
print("104    Suco                 2,00")
print("105    Refrigerante         1,00\n")
do{
print("Digite o cód. do prod.(100 a 105): ")
i = int(input())
i= i-100
print("Digite a quant. do prod.: ")
j = int(input())
}while((i!=0)|(j!=0))
print("Total da compra: "+preco)