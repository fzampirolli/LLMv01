Scanner input = new Scanner (System.in)
int somapreta=0
int somabranca=0
print("Digite n: ")
int n = int(input())
for i=0 in range(0, n):
    print("Numero de graos na proxima casa: ")
for i=0 in range(0, n):
for i=1 in range(1, n):
print("Graos na preta "+somapreta)
print("Graos na branca "+somabranca)
if somapreta>somabranca:
    print("Preta vence!")
else:
    print("Empate!")
else:
    print("Branca vence!")