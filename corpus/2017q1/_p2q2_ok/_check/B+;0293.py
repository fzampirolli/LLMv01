A = [300 , 301, 302 , 303, 304, 305]
C = [1.30 ,1.40 , 1.50 , 1.40 , 2.20 , 1.00]
for i=0 in range(0, 6):
    print("Código"+ A[i]+ "Preço" +C[i])
int n=1, q
double soma=0
while n>0:
    print("Qual o código?")
    n= int(input())
    print("Qual a quantidade? ")
    q= int(input())
    n=n-300
    print("Código" +A[n]+ "Preço" +C[n])
print("Valor total: " +soma)