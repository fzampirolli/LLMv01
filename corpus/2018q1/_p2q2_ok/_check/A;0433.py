private static final int TOTAL_POSICOES = 15
private static final String TEXTO_ENTRADA_NOME = "Digite o nome do %d passageiro:"
private static final String TEXTO_ENTRADA_ACENTO = "Digite o acento do %d passageiro:"
private static final String TEXTO_RESULTADO_BUSCA = "Passageiro encontrado.\n\tNome:%s\n\tAcento:%s\n\n"
String nomeBusca = ""
printf("Digite os dados dos %d passageiros.\n\n",TOTAL_POSICOES)
lerVetorPassageiros(vetorNomes, vetorAcentos)
print("Digite o nome do usuário: ")
nomeBusca = sc.nextLine()
String acentoEncontrado = pesquisaAcento(vetorAcentos, vetorNomes, nomeBusca)
if !acentoEncontrado.isEmpty(:
    printf(TEXTO_RESULTADO_BUSCA,nomeBusca,acentoEncontrado)
    }else{
    print("Passageiro não existe.")
def lerVetorPassageiros(String[] vetorNome,String[] vetorAcento):
    for 0 in range(0, TOTAL_POSICOES):
        printf(TEXTO_ENTRADA_NOME,i +1)
        printf(TEXTO_ENTRADA_ACENTO,i +1)
def pesquisaAcento(String[] vetorAcento,String[] vetorNome,String nome):
    for 0 in range(0, TOTAL_POSICOES):
        if nome.equals(vetorNome[i]:
    return ""