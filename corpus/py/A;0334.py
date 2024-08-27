int i,c,x=0,qt
double total=0
Item = ["Pão de Queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigrante"]
codigo = [300,301,302,303,304,305]
preco = [1.30,1.40,1.50,1.40,2.20,1.00]
print("Código" + " Item" + "      Preço Unitário")
for i=0 in range(0, 6):
    {
    print(codigo[i]+ "   " +Item[i] + "    " + preco[i])
    print("Digite o código do produto(300 a 305) : ")
    c = int(input())
    while c!=0:
        {
        for i=0 in range(0, 6):
            {
            {
            print("Digite a quantidade do produto: ")
            qt = int(input())
            print("Digite um código entre 300 a 305")
            c = int(input())