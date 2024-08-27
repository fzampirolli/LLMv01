Scanner teclado = new Scanner (System.in)
int n=22,i,j,somap=0,somab=0,r=0
print("Insira o valor de casas: ")
n=int(input())
for i=0 in range(0, n):
    for j=0 in range(0, n):
        print("Insira o valor de grãos nesta casa: ")
for i=0 in range(0, n):
    if i%2==0:
        for j=0 in range(0, n):
    if i%2!=0:
        for j=1 in range(1, n):
for i=0 in range(0, n):
    if i%2==0:
        for j=1 in range(1, n):
    if i%2!=0:
        for j=0 in range(0, n):
if somap>somab:
    r=0
if somap<somab:
    r=1
if somap==somab:
    r=2
print(somap +" "+somab +" "+r)