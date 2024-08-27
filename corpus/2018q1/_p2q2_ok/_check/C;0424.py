int n = 25
preencheVetores (n)
def preencheVetores(int n):
    Scanner entrada = new Scanner (System.in)
    for i=0 in range(0, n):
        print("Insira o nome do passageiro " + (i +1) + ": ")
        print("Insira o destino do passageiro " + (i +1) + ": ")
    String nome
    print ("Digite o nome a ser consultado: ")
    nome = entrada.nextLine()
    for i=0 in range(0, n):
        if vetorNome[i].equals(nome:
            print ("O nome é: " + vetorNome[i])
            print ("O destino é: " + vetorDestino[i])
            } else {
            print ("Passageiro não existe")