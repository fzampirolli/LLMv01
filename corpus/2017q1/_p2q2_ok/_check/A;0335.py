String x=" "
double a, b, y, soma=0
vetor1 = ["Item","Código","Preço"]
vetor2 = ["100", "Pão de Queijo", "1.10"]
vetor3 = ["101","Bauru","1.30"]
vetor4 = ["102","Cachorro quente","1.50"]
vetor5 = ["103","Cheeseburger","1.30"]
vetor6 = ["104","Suco","2.00"]
vetor7 = ["105","Refrigerante","1.00"]
ImprimeVetor(vetor1)
ImprimeVetor(vetor2)
ImprimeVetor(vetor3)
ImprimeVetor(vetor4)
ImprimeVetor(vetor5)
ImprimeVetor(vetor6)
ImprimeVetor(vetor7)
while !"0".equals(x:
    print("Digite o código do produto (100 a 105):")
    x= sc.nextLine()
    if !"0".equals(x:
        print("Digite a quantidade:")
        y= int(input())
        if "100".equals(x:
            soma= soma + (1.1*y)
            }else{
            if "101".equals(x:
                soma= soma + (1.3*y)
                }else{
                if "102".equals(x:
                    soma= soma + (1.5*y)
                    }else{
                    if "103".equals(x:
                        soma=soma +(1.3*y)
                        }else{
                        if "104".equals(x:
                            soma=soma=(2*y)
                            }else{
                            soma=soma +y
print("Total da compra: "+soma)
def ImprimeVetor(String Vet1[]):
    for c=0 in range(0, 3):
        print(Vet1[c]+" ")
    print("")