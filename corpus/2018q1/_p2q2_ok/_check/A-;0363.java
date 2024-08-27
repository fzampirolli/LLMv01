
import javax.swing.JOptionPane;
public class P2Questao2 {

    public static void main(String[] args) {
       String vetoracento[] = new  String[15];
       String vetornome[] = new String[15];
       String nome;
       String resultado;
        for (int i=0; i<15; i++){
            vetornome[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° passageiro");
            vetoracento[i] = JOptionPane.showInputDialog("Digite o acento do "+(i+1)+"° passageiro");
        }
       nome=JOptionPane.showInputDialog("Digite o nome do passageiro a ser buscado");
       resultado=pesquisaracento(vetoracento,vetornome, nome);
       if (resultado== null){
            JOptionPane.showMessageDialog(null, " não encontramos o passageiro ");
       } 
       else{
       JOptionPane.showMessageDialog(null,"Dados do passageiro "+ nome+"\n"+ " acento " + resultado);
    }
    }
    public static String pesquisaracento(String va[],String vn[],String n){
       String s=va[0];
        for (int i=0; i<15; i++) {
          if (n ==vn[i]){
              s=va[i];
              i=16; 
          }
          else{
               s=null;
          }
        } 
 return s;
    }

}
