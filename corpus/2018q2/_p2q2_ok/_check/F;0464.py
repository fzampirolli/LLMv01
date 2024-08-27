int quant = 0
Scanner entrada = new Scanner (System.in)
int menu, setor, i, j
for 0 in range(0, 40):
    for 0 in range(0, 60):
while menu !=3:
    print ("---- MENU ----")
    print ("1) Vender Ingresso")
    print ("2) Exibir total de ingressos preenchidos")
    print ("3) Encerrar o programa")
    menu = int(input())
if menu == 1:
    print ("Selecione o setor desejado para comprar: ")
    setor = int(input())
    if setor == 1:
        LerMatrizSetor1(setor)
    if setor == 2:
        LerMatrizSetor2(setor)
if menu == 2:
    print ("Total de ingressos vendidos até o momento: "+ quant)
if menu == 3:
    return
def LerMatrizSetor1(int menu):
    Scanner entrada = new Scanner (System.in)
    print ("Selecione a fila desejada para comprar: ")
    int fila = int(input())
    print ("Selecione a cadeira desejada para comprar: ")
    int cadeira = int(input())
    bool achou = false
    for 0 in range(0, 40):
        for 0 in range(0, 60):
            quant = quant + 1
            achou = true
        if achou == false:
            print ("A cadeira já foi vendida")
def LerMatrizSetor2(int menu):
    Scanner entrada = new Scanner (System.in)
    print ("Selecione a fila desejada para comprar: ")
    int fila = int(input())
    print ("Selecione a cadeira desejada para comprar: ")
    int cadeira = int(input())
    bool achou = false
    for 0 in range(0, 40):
        for 0 in range(0, 60):
            quant = quant + 1
            achou = true
        if achou == false:
            print ("A cadeira já foi vendida")