int A [][]
int i, j, n, v, r = 0, c = 0
int somap = 0, somab = 0
Scanner entrada = new Scanner (System.in)
n = int(input())
for 0 in range(0, n):
    for 0 in range(0, n):
        v = int(input())
        if c == 0:
            somap = somap + v
            print("preta")
        else:
            if c%2 == 0:
                somap = somap + v
                print("preta")
            else:
                somab = somab + v
                print("branca")
        c = c + 1
if somap > somab:
    r = 0
if somab > somap:
    r = 1
if somab == somap:
    r = 2
print(somap + " " + somab + " " + r)