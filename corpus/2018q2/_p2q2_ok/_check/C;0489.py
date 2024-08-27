int i, j, fila, cadeira, cont=0
char setor
for i=0 in range(0, 10):
    for j=0 in range(0, 11):
print("Informe o setor: ")
setor = entrada.nextLine().charAt(0)
while setor!='A' && setor!='B':
    print("Escolha entre setor A ou setor B. ")
    setor = entrada.nextLine().charAt(0)
print("Informe o número da fila e o número da cadeira: ")
fila = int(input())
cadeira = int(input())
while fila >10 && cadeira >11:
    print("Há no máximo 10 filas e 11 cadeiras disponíveis: ")
    fila = int(input())
    cadeira = int(input())
else:
    print("cadeira já foi vendida. ")
for i=0 in range(0, 10):
    for j=0 in range(0, 11):
        cont ++
print("O número de cadeiras vendidas é "+cont)