String destino
print("A seguir digite o destino indicado")
for i=0 in range(0, vetorDestino.length):
    print("Digite o "+(i +1)+"° destino:")
print("A seguir digite o nome indicado")
for i=0 in range(0, vetorNome.length):
    print("Digite o "+(i +1)+"° Nome:")
print("Digite o destino a ser pesquisado")
destino=src.nextLine()
String nome=pesquisarNome(vetorDestino, vetorNome, destino)
if nome=="":
    print("Destino não existe")
    }else   {
    print("O nome do passageiro: "+nome)
    print("O destino do passageiro: "+destino)
def pesquisarNome(String[] vDestino, String[] vNome, String destino):
    for i=0 in range(0, vDestino.length):
        if vDestino[i].matches(destino:
            return vNome[i]
    return ""