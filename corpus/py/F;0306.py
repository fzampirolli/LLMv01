Scanner leia=new Scanner (System.in)
Scanner ler = new Scanner (System.in)
int Cod = 1
for i=0 in range(0, 5):
    {
    print("Digite o Codigo nº "+ i +": ")
    for c=0 in range(0, 5):
        {
        print("Digite nome do Item de codigo  "+Codigo[c]+": ")
        for i=0 in range(0, 5):
            {
            print("Digite o Preco do produto de codigo  "+Codigo[i]+": ")
            for j=0 in range(0, 5):
                print("Item "+Item[j]+"Preço unitário : "+PrecoUni[j]+"Codigo "+Codigo[j])
                print("\n")
            while Cod!=0:
                {
                float soma