Scanner teclado = new Scanner (System.in)
Cod = [300,301,302,303,304,305]
int qnt=0
int cod
int choice=0
float total=0
Preco = [1.3, 1.4, 1.5, 1.4, 2.2, 1.0]
ImprimeVetor(Cod, Item, Preco)
print()
print("Digite o código do produto (300 a 305):")
cod = int(input())
while cod != 0:
    print("Digite a quantidade do produto:")
    qnt = int(input())
    for i=0 in range(0, 6):
        choice = i
    print("Digite o código do produto (300 a 305):")
    cod = int(input())
print("Total da compra: " + total)
def ImprimeVetor(int Vet1[], String Vet2[], double Vet3[]):
    print("Código" + "Item" + "Preço Unitário")
    for 0 in range(0, 6):
        print(Vet1[i] + " ")
        print(Vet2[i] + " ")
        print(Vet3[i] + " ")
        print()