Scanner entrada = new Scanner (System.in)
final int fileiras=40
final int cadeiras = 60
for i=0 in range(0, fileiras):
    for j=0 in range(0, cadeiras):
int n=menu()
while n!=3:
    if n==1:
        print("Insira o setor: 1 ou 2")
        int setor=int(input())
        print("Insira o número da fila: ")
        int fila=int(input())
        print("Insira o número da cadeira: ")
        int cadeira = int(input())
        if setor==1:
            else:
                print("A cadeira já foi vendida.")
        if setor==2:
            else:
                print("A cadeira já foi vendida.")
    if n==2:
        int cont=0
        for i=0 in range(0, fileiras):
            for j=0 in range(0, cadeiras):
                cont ++
                cont ++
        print("Até agora foram vendidos "+cont +" ingressos. ")
    n=menu()
def menu():
    Scanner entrada = new Scanner (System.in)
    int n
    print("1 - Vender Ingresso")
    print("2 - Exibir total de ingressos vendidos")
    print("3 - Encerrar Programa")
    n=int(input())
    return n