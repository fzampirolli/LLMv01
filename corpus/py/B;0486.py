Scanner teclado = new Scanner (System.in)
inicializacao (matriz1, matriz2, 40, 60)
print ("Escolha uma das opçoes abaixo: ")
print ("\nA) Vender Ingresso \nB)Exibir o total de ingressos vendidos \n C) Encerrar o Programa")
String r = teclado.next()
while !r.equals ("C":
    if r.equals ("A":
        Venda (matriz1, matriz2, 40, 60)
    if r.equals ("B":
        TotalIngressos (matriz1, matriz2, 40, 60)
    print ("Escolha uma das opçoes abaixo: ")
    print ("\nA) Vender Ingresso \nB)Exibir o total de ingressos vendidos \n C) Encerrar o Programa")
    r = teclado.next()
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
        print (" "+ matriz1[i][j])
    print (" ")
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
        print (" "+ matriz2[i][j])
    print (" ")
def inicializacao(String M1[][], String M2[][], int n, int m ):
    Scanner teclado = new Scanner (System.in)
    print ("SETOR 1")
    for i=0 in range(0, n):
        for j=0 in range(0, m):
            print (" "+ M1[i][j])
        print (" ")
    print ("SETOR 2")
    for i=0 in range(0, n):
        for j=0 in range(0, m):
            print (" "+ M2[i][j])
        print (" ")
def Venda(String M1[][], String M2 [][],int n, int m):
    Scanner teclado = new Scanner (System.in)
    print("Digite o setor: ")
    int s = teclado.nextInt ()
    print("Digite a fileira: ")
    int i = teclado.nextInt ()
    print("Digite a poltrona: ")
    int j = teclado.nextInt ()
    if s==1:
        int vendido = 0
        if M1[i][j].equals ("v":
            print("Poltrona livre ")
            vendido ++
        else:
            print("Poltrona ocupada! ")
    if s==2:
        int vendido = 0
        if M2[i][j].equals ("v":
            print("Poltrona livre ")
            vendido ++
        else:
            print("Poltrona ocupada!")
def TotalIngressos(String M1[][], String M2 [][],int n, int m):
    for i=0 in range(0, n):
        for j=0 in range(0, m):
            if !M1[i][j].equals("v":
                int contvenda1=0
                contvenda1 ++
                print("O total de ingressos vendidos do setor 1 foi "+contvenda1)
    for i=0 in range(0, n):
        for j=0 in range(0, m):
            if !M2[i][j].equals("v":
                int contvenda2=0
                contvenda2 ++
                print("O total de ingressos vendidos do setor 1 foi "+contvenda2)