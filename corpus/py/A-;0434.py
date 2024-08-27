for 0 in range(0, 45):
    print("informe o nome da " + i + "ª passageiro: ")
    print("Qual seu destino?")
print("\nQual destino deseja saber quem vai?")
String destino= ler.nextLine()
String nome = pesquisarNome(vetorDestino, vetorNome, destino)
print(nome + "vai para esse destino!")
def pesquisarNome(String vetorDestino[], String vetorNome[], String destino):
    String nome = ""
    int i = 0
    while nome == "":
        i ++
    return nome