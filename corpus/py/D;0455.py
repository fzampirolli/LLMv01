Scanner entrada = new Scanner (System.in)
int cont=0
int fileira, cadeira
String opcao
for i=0 in range(0, 40):
    for j=0 in range(0, 60):
        print(ingressos[i][j] +" ")
    print()
print("Digite uma opção:")
opcao = entrada.next()
if null == opcao:
    print("Sistema encerrado")
else:
    case "A":
    print("Digite o número da fila e o número da cadeira:")
    fileira = int(input())
    cadeira = int(input())
    for i=0 in range(0, 40):
        for j=0 in range(0, 60):
            print(ingressos[fileira][cadeira])
            else:
                print("cadeira já foi vendida")
    case "B":
    for i=0 in range(0, 40):
        for j=0 in range(0, 60):
            cont ++
    break
    default:
    print("Sistema encerrado")
    break