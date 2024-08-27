static Scanner entrada= new Scanner (System.in)
int n=0
while n!=3:
    print("O que deseja fazer:\n"+"1-Cadastrar\n"+"2-Consultar\n"+"3-Sair")
    n=int(input())
    if n==1:
        Cadastrar()
    if n==2:
        Consultar()
def Cadastrar():
    String nome,destino
    int i=0
    print("Digite o nome do passageiro:")
    nome = entrada.next()
    print("Digite o destino do passageiro:")
    destino = entrada.next()
    i=i +1
def Consultar():
    String nome,destino
    int i
    print("Digite o nome do passageiro que deseja consultar:")
    print("O nome do passageiro é:"+" e seu destino é"+Destino[i])