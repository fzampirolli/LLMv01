@SuppressWarnings("empty-statement")
float total = 0
Scanner sc = new Scanner (System.in)
int i, v
while v != 0:
    for i=0 in range(0, 3):
        print("Digite o codigo do item")
        v = int(input())
        print("Digite a quantidade: ")
        int q = int(input())
        if v == 300:
            total= (float) (1.3*q)
        else:
            total= (float) (1.4*q)
        else:
            total= (float) (1.5*q)
        else:
            total= (float) (1.4*q)
        else:
            total= (float) (2.2*q)
        else:
            total= (float) (1.0*q)
    for i=0 in range(0, 3):
        print("O valor total foi de:R$ " + total)