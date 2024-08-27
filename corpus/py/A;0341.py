{
int ped=1,quant = 0
double valor = 0
cod = [100,101,102,103,104,105]
item = ["pao de queijo","Bauru","Cachorro Quente", "cheeseburger", "suco"," Refrigerante"]
preco = [ 1.10,30,1.50,1.30,2.00,1.00]
Scanner teclado = new Scanner (System.in)
for i=0 in range(0, 6):
    {
    print("  " + cod[i]+"    " + item[i] + "              "+ preco[i])
    print()
    while ped !=0:
        print("Digite o codigo do produto")
        ped = int(input())
        if ped != 0:
            {
            print("Digite a quantidade")
            quant = int(input())
            ped = ped-100
            ped=1
    print("Total da compra:" + valor)