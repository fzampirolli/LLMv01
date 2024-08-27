int Valid = 0
while Valid == 0:
    print("Digite o Código do Produto: ") 
    int prod = int(input())
    if prod == 0:
        Valid = 1
    else:
        print("Digite a quantidade do produto: ")
        int quant = int(input())
        print()