Scanner entrada=new Scanner (System.in)
int a,c
String nome,returnk,vetorNome[], vetorAcento[],b,d
for a=0 in range(0, 35):
    print("Insira o nome do passageiro:  ")
    b=entrada.nextLine()
for c=0 in range(0, 35):
    print("Insira o nome do passageiro:  ")
    d=entrada.nextLine()
print("Pesquise um nome: ")
nome=entrada.nextLine()
pesquisarNome(vetorNome,vetorAcento, nome)
returnk=pesquisarNome(vetorNome,vetorAcento, nome)
print("Resultado da pesquisa: "+returnk)
def pesquisarNome(String vetorNome[], String vetorAcento[],String nome):
    String acento,k=" " 
    int a
    for a=0 in range(0, 35):
        else:
    return (k)