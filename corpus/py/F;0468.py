int A[]
int fileiras, cadeiras
int fs, cs
print("Quantas fileiras estão vendidas? ")
fileiras = int(input())
fs = 20 - fileiras
print("Quantas cadeiras estão vendidas? ")
cadeiras = int(input())
cs = 220 - cadeiras
print(" Estão ocupadas "+ fileiras +" Fileiras, e estão ocupadas "+ cadeiras +" Cadeiras")
print(" Estao sobrando "+fs + " Fileiras e "+cs +" cadeiras")