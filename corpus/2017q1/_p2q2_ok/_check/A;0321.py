int cod, qtd
double total = 0
A = ["Código", "Item           ", "Preço Unitário"]
B = ["300   ", "Pão de Queijo  ", "1.30"]
C = ["301   ", "Bauru          ", "1.40"]
D = ["302   ", "Cachorro Quente", "1.50"]
E = ["303   ", "Cheeseburguer  ", "1.50"]
F = ["304   ", "Suco           ", "2,20"]
G = ["305   ", "Refrigerante   ", "1.00"]
Bb = [300, 1.30]
Cc = [301, 1.40]
Dd = [302, 1.50]
Ee = [303, 1.50]
Ff = [304, 2.20]
Gg = [305, 1.00]
ImprimeVetor(A)
ImprimeVetor(B)
ImprimeVetor(C)
ImprimeVetor(D)
ImprimeVetor(E)
ImprimeVetor(F)
ImprimeVetor(G)
print("")
do{
print("Digite o código do produto (300 a 305): ")
cod = int(input())
if cod != 0:
    print("Digite quantidade do produto: ")
    qtd = int(input())
while cod > 299 && cod <306:
    print("")
    print("Total da Compra: " + total)
def ImprimeVetor(String Vet1[]):
    for 0 in range(0, 3):
        print(Vet1[i] + "   ")
    print("")