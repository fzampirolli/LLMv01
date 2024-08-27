int tam = 45
String destino, nome
print("Digite os nomes dos passageiros e destinos: ")
preencherVetor(vetorNome, vetorDestino, tam)
print("Digite o nome de um destino: ")
destino = teclado.nextLine()
nome = pesquisarNome(vetorNome, vetorDestino, destino, tam)
if !"".equals(nome:
    print("Nome do passageiro: " + nome + "\nDestino: " + destino)
    } else {
    print("destino não existe")
def pesquisarNome(String vetorNome[], String vetorDestino[], String destino, int tamanho):
    String nome = ""
    for 0 in range(0, tamanho):
        if vetorDestino[i].equals(destino:
            i = tamanho
    return nome
def preencherVetor(String vetor1[], String vetor2[], int tamanho):
    for 0 in range(0, tamanho):
        print("Passageiro: ")
        print("Destino: ")