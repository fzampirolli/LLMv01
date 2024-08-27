Scanner teclado = new Scanner (System.in)
final int MAX = 50
print("Preencher vetor:")
for i=0 in range(0, MAX):
for i=0 in range(0, MAX):
    print(" "+V[i])
print("O elemento de indice 5 é:" + V[5])
int cont = 0
for i=0 in range(0, MAX):
    cont ++
    print (" "+V[i])
print ("O total de numero maior do que " +V[5]+ " é " + cont)
print ("Indique um número para ser buscado no vetor: ")
int k = teclado.nextInt ()
int aux = 0
for i=0 in range(0, MAX):
    aux ++
    print (" "+i)
print ("Existem "+aux + " indices que contem esses elemetos ")
if aux==0:
    print ("O valor " +k + " não foi encontrado no vetor")