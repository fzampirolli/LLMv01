static int N=6
cod = [100,101,102,103,104,105]
item = ["pão de queijo  ", "bauru          ", "cachorro quente", "cheeseburger   ", "suco           ", "refrigerante   "]
preco = [1.10,1.30,1.50,1.30,2.00,1.00]
int i,x=1,y,z
double total=0
print ("Cardápio:")
print("\nCódigo      Item      Preço unitário")
for i=0 in range(0, 6):
    print ("\n"+ cod[i]+"      "+item[i]+"      "+preco[i])
while x>0:
    print ("\nQual o código do item que deseja?")
    x=int(input())
    if x==0:
        print("Total da compra: "+ total)
    print ("Qual a quantidade que deseja deste produto?")
    y = int(input())
    z=x-100
print("Total da compra: "+ total)