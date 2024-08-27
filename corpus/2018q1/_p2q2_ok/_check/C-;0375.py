static int n=25
static int next=0
String nome = ""
int opcao=0
print("--Entre com as informações. Digite 0 para sai. ")
print("--Digite 1 para Cadastrar")
print("--Digite 2 para Pesquisar ")
while opcao!=3:
    opcao=int(input())
    if opcao==1:
        Nome(Nome,Destino)
    else:
        pesquisarDestino(Nome, Destino,nome)
    print("--Digite 0 para sair ou apenas continue cadastrando. ")
    opcao=int(input())
    next=next +1
def Nome(String Nome [],String Destino[]):
    print("Informe o nome do passageiro: ")
    print("Informe o destino: ")
def pesquisarDestino(String Nome [],String Destino[], String nome):
    print("Informe o nome a ser localizado: ")
    nome = entry.nextLine()
    for =0 in range(0, n):
        print("Nome:"+Nome[i]+"")
        print("Destino:"+Destino[i]+"")
        else:
            print("Null")