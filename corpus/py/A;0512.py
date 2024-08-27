Scanner teclado = new Scanner (System.in)
int n=int(input()), l,c,somap=0,somab=0,r
for l=0 in range(0, n):
    for c=0 in range(0, n):
        if l%2==0:
            if c%2==0:
            else:
        if l%2==1:
            if c%2==1:
            else:
if somap>somab:
    r=0
else:
    r=1
else:
    r=2
print(somap +" "+somab +" "+r)