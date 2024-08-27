print("CARDÁPIO")
print("Código  Item             Preço Unitário")
print(" 100    Pão de Queijo ----  R$ 1,10")
print(" 101    Bauru ------------  R$ 1,30")
print(" 102    Cachorro quente --  R$ 1,50")
print(" 103    Cheeseburger -----  R$ 1,30")
print(" 104    Suco -------------  R$ 2,00")
print(" 105    Refrigerante------  R$ 1,00")
Cod = [100, 101, 102, 103, 104, 105]
Valor = [1.1 , 1.3, 1.5, 1.3, 2.0 , 1.0]
int c = 1
double q
while c !=0:
    print("Digite o código do produto (100 a 105): ")
    c = int(input())
    for i=0 in range(0, 6):
    print("Digite a quantidade do produto: ")
    q = entrada.nextDouble()
    double pagar = 0