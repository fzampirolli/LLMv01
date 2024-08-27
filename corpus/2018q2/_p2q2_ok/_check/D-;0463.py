int i, j, fila, cadeira, vendidos=0
char v, p
String b = "N"
String Setor1, Setor
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
print("Para iniciar, digite alguma das opções:")
print("A) VENDER INGRESSO B) EXIBIR TOTAL DE INGRESSOS VENDIDOS C) ENCERRAR O PROGRAMA")
while !"C".equals(b:
    for i=0 in range(0, 40):
        for j=0 in range(0, 60):
            print("Escolha: Setor1 ou Setor2 ")
            Setor1 = sc.nextLine()
            print("Digite o número da fila que deseja comprar, sendo que temos apenas 40 fileiras:")
            fila = int(input())
            print("Digite o número da cadeira, sendo que temos apenas 40 lugares por fileira:")
            cadeira = int(input())
            if i>=40||j>60:
                print("Número inválido")