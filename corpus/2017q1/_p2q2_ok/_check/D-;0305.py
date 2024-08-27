Scanner entrada = new Scanner (System.in)
int ind=0
int quant=0
double total=0.0
codigo = [300, 301, 302, 303, 304, 305]
preco = [1.30, 1.40, 1.50, 1.40, 2.20, 1.00]
item = ["Pão de Queijo", "Bauru", "Cachorro quente", "Cheeseburguer", "Suco", "Refrigerante"]
for ind=0 in range(0, 6):
    print ("\n"+codigo[ind]+" ")
    print (item[ind]+" ")
    print (preco[ind]+ " ")
print("\nDigite o código do produto (300 a 305): ")
print ("Digite a quantidade do produto: ")
quant = int(input())