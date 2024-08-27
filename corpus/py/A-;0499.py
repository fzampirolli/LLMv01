Scanner sca = new Scanner (System.in)
int a
int i=0
int j=0
for i=0 in range(0, 8):
    for j=0 in range(0, 60):
do { print("Aperte: " )
print("1.Para comprar um ingresso 2.Ver quantos ingressos foram vendidos e 3.Encerrar o programa")
a = int(input())
int t=0
int z=0
int cont=0
if a==1:
    do {
    print("Por favor selecione o seu setor (1 ou 2)")
    int setor = int(input())
    print("Agora selecione a fileira (1 a 4)")
    int fileira = int(input())
    print("Por fim selecione a cadeira (0 a 59)")
    int cadeira = int(input())
    print("Cadeira adicionada com sucesso para finalizar tecle 1 para sair e tecle qualquer para adicionar +1")
    cont ++
    } else {print("Por favor selecione um valor válido")
    print("Digite 1 para finalizar ou tecle qualquer para comprar +1")}
    t=int(input())
    }while (t != 1)
else:
a=int(input())
} while (a<3)
}}