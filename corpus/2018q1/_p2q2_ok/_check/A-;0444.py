{
{
String nome,resultado
Scanner entrada = new Scanner (System.in)
for i=0 in range(0, 3):
    {
    print("Digite o que se pede sem espaços entre as palavras:")
    print("Digite o nome da posição "+i +": ")
    print("Digite o destino da posição "+i +": ")
    print("Digite o nome da pessoa: ")
    nome = entrada.next()
    resultado = pesquisarDestino(vN,vD,nome)
    if "-".equals(resultado:
        {
        print("Passageiro não existe")
        else:
            {
            print("Passageiro:"+nome +" Destino: "+resultado)
def pesquisarDestino(String n[], String d[], String name):
    {
    String destino = "-"
    for i=0 in range(0, 3):
        {
        if name.equals(n[i]:
            {
        return destino