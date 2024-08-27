int n
double k,p
for i=0 in range(0, 3):
    print("\n informe o nome do prduto")
    print("\n informe o codigo do prduto")
    print("\n informe o preço do prduto")
print("codigo  item      preço     ")
for i=0 in range(0, 6):
    print(codigo[i]+"     " +produto[i]+"       " + preco[i])
int u=1
while u!=0:
    print("Informe o codigo do pedido[300 3005] ")
    n=int(input())
    print(produto[n]+"   "+preco[n-1] )
    print("Informe a quantidade ")
    k=int(input())
    print("digite 0 para parar ou 1 para continuar")
    u=int(input())