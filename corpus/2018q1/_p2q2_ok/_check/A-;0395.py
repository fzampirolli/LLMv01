Scanner t=new Scanner (System.in)
int n=45
String destino,nome
for i=0 in range(0, n):
    print("Qual o nome do passageiro ?: ")
    print("Qual o destino do passageiro ?: ")
print("Insira um destino: ")
destino=t.next()
nome=pesquisarNome(vetorDestino,vetorNome,destino)
if "".equals(nome:
    print("Destino nao existe")
else:
def pesquisarNome(String d[], String n[], String lugar):
    int a=0,i=0
    String nome=""
    do{
    if d[i].equals(lugar:
        a=1
    i ++
    }while(i<d.length && a==0)
    return nome