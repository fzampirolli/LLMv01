static Scanner input = new Scanner (System.in)
int lin = 40, cha = 60
for 0 in range(0, lin):
    for 0 in range(0, cha):
char a = Menu()
while a != 'C' && a != 'c':
    if a == 'A' || a == 'a':
        Sell(lin,cha,s1,s2)
    if a == 'B' || a == 'b':
        Sold(lin,cha,s1,s2)
    a = Menu()
print("\nPrograma Finalizado!")
def Menu():
    print("\n================================\n"
    + "Menu:"
    + "\nVender ingressos [A]"
    + "\nExibir total de ingressos vendidos [B]"
    + "\nEncerrar [C]"
    + "\n::: ")
    char op = input.next().charAt(0)
    while op != 'A' && op != 'a' && op != 'B' && op != 'b' && op != 'C' && op != 'c':
        print("\nOpção inválida!\n::: ")
        op = input.next().charAt(0)
    return op
def Sell(int lin, int cha, char s1[][], char s2[][]):
    print("\nSetor::: ")
    int s = int(input())
    while s != 1 && s != 2:
        print("\nOpção inválida!\n:::")
        s = int(input())
    print("\nFileira::: ")
    int f = int(input())
    while f > lin || f < 1:
        print("\nOpção inválida!\n:::")
        f = int(input())
    print("\nCadeira::: ")
    int c = int(input())
    while c > cha || c < 1:
        print("\nOpção inválida!\n:::")
        c = int(input())
    if s == 1:
        print("\nCadeira já foi vendida!\n")
        else:
            print("\nIngresso comprado!\nSetor " + s + " Fileira " + f + " Cadeira " + c)
    if s == 2:
        print("\nCadeira já foi vendida!\n")
        else:
            print("\nIngresso comprado!\nSetor " + s + " Fileira " + f + " Cadeira " + c)
def Sold(int lin, int cha, char s1[][], char s2[][]):
    int count1 = 0, count2 = 0
    for 0 in range(0, lin):
        for 0 in range(0, cha):
            count1 ++
            count2 ++
    int total = count1 + count2
    if total == 4800:
        print("\nIngressos esgotados")
    else:
        print("\nForam vendidos " + total + " ingressos até o momento.")