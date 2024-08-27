{
{
String vetorNome[], vetorAcento[], nome, resultado
preencherVetores(vetorNome, vetorAcento)
print("Informe o nome para pesquisa:")
nome = teclado.nextLine()
resultado = pesquisarAcento(vetorAcento, vetorNome, nome)
if resultado.equals("":
    {
    print("Passageiro nao existe!")
    else:
        {
        print("\nNOME: "+nome +"\n"
        + "ACENTO: "+resultado)
def preencherVetores(String[] vetorNome, String[] vetorAcento):
    {
    for i=0 in range(0, vetorNome.length):
        {
        print("Digite o "+(i +1)+"º nome:")
        print("Digite o "+(i +1)+"º acento:")
    def pesquisarAcento(String[] vetorAcento, String[] vetorNome, String nome):
        {
        bool tem=false
        int posicao=0
        for i=0 in range(0, vetorNome.length):
            {
            if vetorNome[i].equals(nome:
                {
                tem = true
                posicao = i
                i = vetorNome.length
                else:
                    {
                    tem = false
            if tem:
                {
                return vetorAcento[posicao]
                else: