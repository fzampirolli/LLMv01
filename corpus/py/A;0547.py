int n
int somaBranco=0,somaPreto=0
int r
n =int(input())
print("")
for i=0 in range(0, n):
    for j=0 in range(0, n):
    print("")
for i=0 in range(0, n):
    if i%2==0:
        for j=0 in range(0, n):
    else:
        for j=1 in range(1, n):
for i=0 in range(0, n):
    if i%2==0:
        for j=1 in range(1, n):
    else:
        for j=0 in range(0, n):
if somaBranco>somaPreto:
    r=0
else:
    r=1
else:
    r=2
print(somaBranco +"  ")
print(somaPreto +"  ")
print(r)