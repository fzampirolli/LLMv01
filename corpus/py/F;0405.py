private static Object teclado
String n = null
String resultado
int i = 0
while i<15:
    PreencherNome(vetNome)
    PreencherAcento(vetAcento)
    resultado = pesquisarAcento(vetNome, vetAcento, n)
    print("O nome do passageiro é:" + vetNome[i])
    print("O acento desse passageiro é:" + resultado)
    i ++
def PreencherNome(String vnome[]):
    int i = 0
    print("Digite o nome do passageiro:")
def PreencherAcento(String vacento[]):
    int i =0
    print("Digite o acento:")
private static String pesquisarAcento(String[] vetorNome, String[] vetorAcento, String nome) {
int i =0
if i<=0:
return nome