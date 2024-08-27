int codProduto, quant
vetCod = [100,101,102,103,104,105]
double total = 0
vetItem = ["Pão de queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigerante"]
vetPreco = [1.10,1.30,1.50,1.30,2,1]
mostrarCardapio(vetCod, vetItem, vetPreco)
print("----------------------")
codProduto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto: "))
quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade: "))
while codProduto != 0:
    total = total + pegarCodigo(codProduto, vetCod, vetPreco, quant)
    codProduto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto: "))
    quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade: "))
mostrarCardapio(vetCod, vetItem, vetPreco)
print("Total da compra: "+total)
def mostrarCardapio(int vetorCod[],String vetorItem[],double vetorPreco[]):
    for 0 in range(0, 6):
        print(vetorCod[i])
        print(" ")
        print(vetorItem[i])
        print(" ")
        print(vetorPreco[i])
def pegarCodigo(int codProduto,int vetorCod[],double vetorPreco[],int quant):
    double soma = 0
    for 0 in range(0, 6):
    return soma