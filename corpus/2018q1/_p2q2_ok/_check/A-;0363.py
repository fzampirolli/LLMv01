String nome
String resultado
for i=0 in range(0, 15):
nome=JOptionPane.showInputDialog("Digite o nome do passageiro a ser buscado")
resultado=pesquisaracento(vetoracento,vetornome, nome)
if resultado== null:
    JOptionPane.showMessageDialog(null, " não encontramos o passageiro ")
else:
    JOptionPane.showMessageDialog(null,"Dados do passageiro "+ nome +"\n"+ " acento " + resultado)
def pesquisaracento(String va[],String vn[],String n):
    for i=0 in range(0, 15):
        i=16
        else:
            s=null
    return s