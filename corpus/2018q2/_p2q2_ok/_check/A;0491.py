Scanner entrada = new Scanner (System.in)
Random rand = new Random ()
int setor = 2
int fileira = 10
int cadeira = 11
int S=0
p(M, setor, fileira, cadeira)
int programa = 3
print("Bem vindo ao estádio!")
while programa !=0:
    print("\nDigite 1 para comprar ingressos \n2 para "
    + "exibir a quantidade de ingressos vendidos e \n0 para sair.")
    print(" ")
    programa = int(input())
    if programa == 1:
        Compra(M)
        } else if (programa == 2) {
        print("Já vendemos um total de "
        +Vendidos(M, setor, fileira, cadeira, S)+ " ingressos.")
print("Agradecemos a visita!")
def p(String M[][][], int setor, int fileira, int cadeira):
    for i=0 in range(0, setor):
        for j=0 in range(0, fileira):
            for k=0 in range(0, cadeira):
def Compra(String M[][][]):
    Scanner entrada = new Scanner (System.in)
    print("Digite o setor (1 ou 2): ")
    int a = int(input())
    print("Digite a fileira (1 a 10): ")
    int b = int(input())
    print("Digite a cadeira (1 a 11): ")
    int c = int(input())
    if M[a-1][b-1][c-1].equals("v":
        print("\nObrigado pela compra!!!")
        } else {
        print("\nEsta cadeira ja foi vendida. Por "
        + "favor, escolha outro lugar.")
def Vendidos(String M[][][], int setor, int fileira, int cadeira, int S):
    for i=0 in range(0, setor):
        for j=0 in range(0, fileira):
            for k=0 in range(0, cadeira):
                if M[i][j][k].equals("p":
                    S=S +1
    return(S)