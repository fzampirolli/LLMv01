Scanner scan= new Scanner (System.in)
int quant, soma=0
codigo = [100, 101, 102, 103, 104, 105]
item = [Pão de Queijo, Bauru, Cachorro Quente, Cheeseburguer, Suco, Refrigerante]
preco = [1.10, 1.30, 1.50, 1.30, 2.00, 1.00]
ImprimeCodigo (codigo[])
ImprimeItem (item[])
ImprimePreco (preco[])
def ImprimeCodigo(int Vet1[]):
    print ("Código")
    for i=0 in range(0, 6):
        print(Vet1[i]+"")
def ImprimeItem(int Vet2[]):
    print ("Item")
    for i=0 in range(0, 6):
        print(Vet2[i]+"")
def ImprimePreco(int Vet3[]):
    print ("Preço")
    for i=0 in range(0, 6):
        print(Vet3[i]+"")
while codigo!=0:
    for i=0 in range(0, 6):
        print ("Insira o código do item:"+codigo[i])
        print ("Insira a quantidade do item"+quant)
        soma=quant*preco
print ("Total da Compra:"+soma)