static final int Tam=3
int i,j
String nome
String Acent
for i=0 in range(0, Tam):
    print("Informe o nome do passageiro: \n")
    print("Informe acento do passageiro: "+vetorNome[i]+".")
print("Digite o nome do passageiro que deseja buscar: \n")
nome=sc.nextLine()
for i=0 in range(0, Tam):
    print("Passageiro não existe. /n")
    else:
        PesquisarAcento(vetorAcento,vetorNome,nome)
def PesquisarAcento(String[] vetorAcento,String[] vetorNome,String nome):
    String Acent="Passageiro não existe "
    int i
    for i=0 in range(0, Tam):
        if vetorNome[i].equals(nome:
            print("O acento do passageiro é o: "+vetorAcento[i])
    return Acent