int l = 40, c = 60
int i, j = 0, ent
for i=0 in range(0, l):
    for j=0 in range(0, c):
        print(set1[i][j]+" ")
        print(" "+set2[i][j])
        print(" \n ")
print("Digite o setor 1 ou setor 2")
ent = int(input())
if ent == 1:
if ent == 2:
else:
    print("Digite um setor válido, entre 1 e 2")