int menu, j, ind = 0
print("Você deseja: \n 1. Inserir dados \n ou 2. Pesquisar por nome?")
menu = int(input())
if menu==1:
    while ind < 45:
        print("Insira um nome:")
        print("Insira um destino:")
        ind ++
else:
    if menu==2:
        j = pesquisarNome(a)
        print("Nome:" + vetorNome[j])
    else:
        print("Número digitado não corresponde às opções")
def pesquisarNome(String vetorDestino[]):
    String x
    int a = 0, ind
    print("Digite o destino do passageiro:")
    x = entrada.nextLine()
    for 0 in range(0, 45):
        return (a)
        else:
            print("Destino não existe")