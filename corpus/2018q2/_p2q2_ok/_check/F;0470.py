int A=1, B=2, C=3
int opcao
int Lin, Col
print("MENU"+"\nA)Vender ingressos (Digite 1 para escolher essa opção)"+"\nB)Exibir o total de ingressos vendidos(Digite 2 para escolher essa opção)"+"\nC)Encerrar o programa(Digite 3 para escolher essa opção)")
print("Escolha uma opção: ")
opcao=int(input())
for Lin=0 in range(0, 10):
    for Col=0 in range(0, 11):
if opcao==1:
    print("Você selecionou - Vender ingressos")
if opcao==2:
    print("Você selecionou - Exibir o total de ingressos vendidos")
if opcao==3:
    print("Você selecionou - Encerrar o programa")