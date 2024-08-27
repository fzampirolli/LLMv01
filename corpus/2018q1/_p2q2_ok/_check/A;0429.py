int opcao = 10
int QNTD_PASSAGEIROS = 0
while opcao != 0:
    print(" =============  MENU  ============= ")
    print(" 1 - Cadastro de Passageiro  ")
    print(" 2 - Pesquisa de Passageiro  ")
    print(" 0 - Sair  ")
    opcao =  int(input())
    if  opcao == 1 :
        print("Por favor Insira o nome do passageiro")
        print("Por favor Insira o Acento do passageiro")
        QNTD_PASSAGEIROS ++
        print(" =============  Cadastrado com Sucesso!  ============= ")
        } else if (opcao == 2){
        print("Por favor insira o acento do passageiro buscado:")
        String ACENTO_BUSCADO = leitor_texto.nextLine()
        String retorno = pesquisarNome(vetorNome,vetorAcento,ACENTO_BUSCADO)
        print(retorno)
        print(" ============= Busca concluída com Sucesso!  ============= ")
        } else if( opcao == 0) {
        print(" ============= PROGRAMA FECHADO COM SUCESSO  ============= ")
        } else {
        print(" =============  Por favor selecione uma opcao válida  ============= ")
def pesquisarNome(String Nomes[], String Acentos[], String acento):
    String resultadoBusca = "Acento não existe"
    for 0 in range(0, 35):
        if Acentos[i].equals(acento:
    return resultadoBusca