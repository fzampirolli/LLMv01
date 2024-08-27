
public class Questao2 {

    public static void main(String[] args) {
        int Codigo[] = {100, 101, 102, 103, 104, 105};
        String Item[] = {Pão de queijo, Bauru, Cachorro quente, Cheeseburger, Suco, Refrigerante};
        double Preco[] = {1.10, 1.30, 1.50, 1.30, 2.00, 1.00};
        int i;

        for(i=0; i<6; i++){
            System.out.print(Codigo[i] + " " + Item[i] + " " + Preco[i]);
        }        
    }

}
