int menu
int sector
int lin
int col
int sell = 0
bool finish = false
for 0 in range(0, 9):
    for 0 in range(0, 10):
do {
print("Digite o número da opção desejada")
print("1 - Vender ingresso")
print("2 - Exibir total de ingressos vendidos")
print("3 - Encerrar o programa")
menu = int(input())
if menu == 1:
    print("Qual setor desejado? (1 ou 2): ")
    sector = int(input())
    print("Qual o número da fileira? (0 a 9): ")
    lin = int(input())
    print("Qual o número da cadeira? (0 a 10): ")
    col = int(input())
    if sector == 1:
        } else {
        print("cadeira já foi vendida")
        } else if (sector == 2) {
        } else {
        print("cadeira já foi vendida")
    print("Venda efetuada com sucesso!")
    sell ++
    } else if (menu == 2) {
    print("O total de ingressos vendidos até agora foi: " + sell)
    } else if (menu == 3) {
    finish = true
    } else {
    print("Essa opção não existe, escolha novamente!")
} while (finish == false)
print("O programa foi encerrado")