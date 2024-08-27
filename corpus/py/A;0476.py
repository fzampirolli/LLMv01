Scanner entrada = new Scanner (System.in)
int x=0, ingressos1=0
for 0 in range(0, 10):
    for 0 in range(0, 11):
while x!= 3:
    print ("Escolha uma das seguintes opções: \n1) Vender ingresso \n2) Exibir o total de ingressos vendidos \n3) Encerrar o programa")
    print ("\nSua escolha:")
    x= int(input())
    if x==1:
        print("\nEscolha o setor (1 ou 2) que deseja comprar o ingresso: ")
        int setor = int(input())
        print ("Escolha o numero da fila: ")
        int fila = int(input())
        print("Escolha o numero da cadeira: ")
        int cadeira = int(input())
        if setor == 1:
            ingressos1=ingressos1 +1
            } else{
            print ("\nAVISO: Essa cadeira já foi vendida!")
        if setor == 2:
            ingressos1=ingressos1 +1
            } else{
            print ("Essa cadeira já foi vendida!")
    if x==2:
        print ("\nO total de ingressos vendidos são: "+ ingressos1)
    print ("\n\n")