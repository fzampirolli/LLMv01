double compra=0.00
codigo = [300,301,302,303,304,305]
opcao = [Pao_de_queijo, Bauru, Cachorro_quente, Cheeseburguer, suco, refrigerante]
preco = [1.30 ,1.40, 1.50, 2.20, 1.00]
ImprimirCardapio (codigo, opcao, preco)
def ImprimirCardapio(int codigo[], string opcao [], double preco):
    for i=0 in range(0, 6):
        print (codigo[i] + " ")
        print (opcao[i] + " ")
        print (preco[i] + " ")