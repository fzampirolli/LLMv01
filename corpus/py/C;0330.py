codigo = [100, 101, 102, 103, 104, 105]
preco = [1.10, 1.30, 1.50, 1.30, 2.00, 1.00]
int c,q
double total=0
int Item[]
for i=0 in range(0, 6):
    print(codigo[i])
    print("\t "+preco[i])
    do {
    print("Digite o código do produto (100 a 105): ")
    c = int(input())
    print("Digite a quantidade do produto: ")
    q = int(input())
    if c==100:
        total=(q*1.10)
    if c==101:
        total=(q*1.30)
    if c==102:
        total=(q*1.50)
    if c==103:
        total=(q*1.30)
    if c==104:
        total=(q*2.00)
    if c==105:
        total=(q*1.00)
    total=+total
    while c!=0:
print("Total da compra: "+total)