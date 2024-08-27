A = [100,101,102,103,104,105]
B = ["Pão de Queijo","Bauru","Cachorro Quente","Cheeseburguer","Suco","Refrigerante"]
C = [1.1,1.3,1.5,1.3,2.0,1.0]
int i,cod, quant=0
double valor=0.0
do{
print("Digite o código do produto (100 a 105): ")
cod = int(input())
if cod!=0:
    print("Quantidade de produtos: ")
if cod==100:
if cod==101:
if cod==102:
if cod==103:
if cod==104:
if cod==105:
}while(cod!=0)
print("Código "+ "Item "+"         Preço unitário")
for i=0 in range(0, 6):
    print(A[i]+"    "+B[i]+"   "+ C[i])
print("-------------------")
print("Total da compra:" +valor)