String destino
int i = 0
while i<1:
    print("Digite o próximo nome de passageiro: ")
    print("Digite o destino desse passageiro: ")
    i ++
print("Digite o destino: ")
destino = scan.nextLine()
print(pesquisarNome(vetorDestino, vetorNome, destino))
def pesquisarNome(String D[], String N[], String d):
    int i = 0
    int x = 0
    String devolver = ("")
    while i<45:
        if D[i].equals(d:
            x ++
            return N[i]
        i=i +1
    if x==0:
        devolver = ("Destino não encontrado!")
    return devolver