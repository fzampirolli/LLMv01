int contVendas, opcaoMenu
String[][] setor_A, setor_B
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
while true:
    MostrarMenu()
    opcaoMenu=EscolhaMenu()
    if opcaoMenu==1:
        VenderIngresso(setor_A, setor_B)
        } else if (opcaoMenu==2){
        contVendas = RelatorioVendas(setor_A, setor_B)
        print("Total de ingressos vendidos: " + contVendas)
        } else if (opcaoMenu==3){
        break
static void MostrarMenu(){
print("")
print("Menu")
print("A) Vender Ingresso")
print("B) Exibir o total de ingressos vendidos")
print("C) Encerrar o programa")
print("")
static int EscolhaMenu(){
int escolha
print("Qual item do menu voce quer?")
print("Digite 1 para A, 2 para B e 3 para C")
escolha = int(input())
while escolha>3 | escolha <1:
    print("Opcao invalida, tente novamente")
    print("Digite 1 para A, 2 para B e 3 para C")
    escolha = int(input())
return escolha
static void VenderIngresso(String[][] setor_A, String[][] setor_B){
String setor
int fila, cadeira
print("")
print("Venda de ingresso:")
print("Qual o setor desejado?")
print("informe A ou B: ")
setor = teclado.next()
print("Qual a fila desejada? ")
print("informe um valor de 0 a 40: ")
fila = int(input())
print("Qual a cadeira desejada? ")
print("informe um valor de 0 a 60: ")
cadeira = int(input())
if "A".equals(setor:
    if "v".equals(setor_A[fila][cadeira]:
        print("compra efetuada com sucesso")
        } else {
        print("Cadeira ja vendida, tente novamente")
    } else if("B".equals(setor)){
    if "v".equals(setor_B[fila][cadeira]:
        print("compra efetuada com sucesso")
        } else {
        print("Cadeira ja vendida, tente novamente")
static int RelatorioVendas(String[][] setor_A, String[][] setor_B){
int cont = 0
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
        if "p".equals(setor_A[i][j]:
            cont=cont +1
        if "p".equals(setor_B[i][j]:
            cont=cont +1
return cont