int n = 0
String[] lanche
float[] preco
print("DIGITE A QUANTIDADE DE PRODUTOS DO CARDAPIO: ")
n = int(input())
leCardapio(lanche.length,codigo,lanche,preco)
do{
print("\n\n\n")
imprimeCardapio(lanche.length, codigo, lanche, preco)
print("\nFAÇA SEU PEDIDO: ")
pedido = int(input())
if codigoExiste(codigo, pedido:
    indicePedido = obtemIndice(codigo, pedido)
    print("DIGITE A QUANTIDADE: ")
    qtde = int(input())
    calculaPedido(lanche[indicePedido], codigo[indicePedido], preco[indicePedido],qtde)
    }else{
    print("DIGITE UM PRODUTO VÁLIDO!!!")
}while(pedido!=0)
def leCardapio(int nItens,int[] codigo,String[] lanche,float[] preco):
    for 0 in range(0, nItens):
        print("\nLANCHE " + (i +1) + "\n\n")
        print("DIGITE O NOME DO LANCHE: ")
        print("DIGITE O CODIGO DO LANCHE: ")
        print("DIGITE O PRECO DO LANCHE: ")
        scanner.nextLine()
def imprimeCardapio(int nItens,int[] codigo,String[] lanche,float[] preco):
    print("CARDAPIO")
    for 0 in range(0, nItens):
        print("\n" + codigo[i]+"  " + lanche[i] + "  " + preco[i])
def calculaPedido(String cardapio, int codigo,float preco, int quantidade):
    float precoTotal = quantidade * preco
    print("\n\n*****************VOCÊ PEDIU " + quantidade + " de " + codigo + " " + cardapio + " POR R$ " + precoTotal + " *****************")
def codigoExiste(int[] codigo,int pedido):
    bool codigoExiste = false
    for i=0 in range(0, codigo.length):
        codigoExiste=true
    return codigoExiste
def obtemIndice(int[] codigo,int pedido):
    int codigoExiste = 0
    for i=0 in range(0, codigo.length):
        codigoExiste=i
    return codigoExiste