Código = [300,301,302,303,304,305]
Item = ["pãodequeijo","Bauru","cachorro quente", "Cheesburguer", "Suco", "Refrigerante"]
PreçoUnitário = [1.30, 1.40, 1.50, 1.50, 2.20, 1.00]
Scanner entrada=new Scanner (System.in)
print("Código")
ImprimeVetor1(Código)
print("Item")
ImprimeVetor2(Item)
print("Preço")
ImprimeVetor3(PreçoUnitário)
int quantidade, preço, codigo
print("Digite o codigo do pedido ")
codigo=int(input())
print("digite a quantidade ")
quantidade=int(input())
if codigo!=0:
    double soma=0
    while codigo>299 && codigo<306:
        if codigo==300:
            soma=(soma +1.30)*quantidade
        if codigo==302:
            soma=(soma +1.50)*quantidade
        if codigo==301:
            soma=(soma +1.40)*quantidade
        if codigo==303:
            soma=(soma +1.50)*quantidade
        if codigo==304:
            soma=(soma +2.20)*quantidade
        if codigo==305:
            soma=(soma +1.00)*quantidade
    print(soma)
def ImprimeVetor1(int Vet1[]):
    int i
    Scanner entrada= new Scanner (System.in)
    for i=0 in range(0, 6):
        print( Vet1[i])
def ImprimeVetor2( String Vet2[]):
    int i
    Scanner entrada= new Scanner (System.in)
    for i=0 in range(0, 6):
        print( Vet2[i])
def ImprimeVetor3( double Vet3[]):
    int i
    Scanner entrada= new Scanner (System.in)
    for i=0 in range(0, 6):
        print( Vet3[i])