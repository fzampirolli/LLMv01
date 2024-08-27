static final int T=15
String Nome, pesquisa
LerVetorNome(VetorNome, T)
LerVetorAcento(VetorAcento, VetorNome, T)
print("Digite o nome do passageiro cujo acento será pesquisado: ")
Nome=ent.nextLine()
pesquisa=pesquisarAcento(VetorAcento, VetorNome, Nome, T)
if "".equals(pesquisa:
    print("Passageiro não existe")
    }else{
    print("Resultado: "+pesquisa)
def pesquisarAcento(String A[],String B[],String Nome, int T):
    int i=0
    String acento=""
    for i=0 in range(0, T):
        if B[i].equals(Nome:
    return acento
def LerVetorNome(String B[], int T):
    int i
    for i=0 in range(0, T):
        print("Digite o nome do passageiro: ")
def LerVetorAcento(String A[],String B[],int T):
    int i
    for i=0 in range(0, T):
        print("Digite o acento do(a) passageiro(a) "+B[i]+":")