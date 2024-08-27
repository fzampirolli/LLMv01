
public class JavaApplication5 {

    public static void main(String[] args) {
    String A[][] = new String [6][3];

    A[0][0] = "100";
    A[0][1] = "Pão de Queijo";
    A[0][2] = "1,10";
    A[1][0] = "101";
    A[1][1] = "Bauru";
    A[1][2] = "1,30";
    A[2][0] = "102";
    A[2][1] = "Cachorro Quente";
    A[2][2] = "1,50";
    A[3][0] = "103";
    A[3][1] = "Cheeseburger";
    A[3][2] = "1,30";
    A[4][0] = "104";
    A[4][1] = "Suco";
    A[4][2] = "2,00";
    A[5][0] = "105";
    A[5][1] = "Refrigerante";
    A[5][2] = "1,00";

    System.out.print ("\nCardápio: ");
	for (int i=0; i<6; i++){
	System.out.print ("\n");
	for (int j=0; j<3; j++)
	System.out.print (A[i][j]+" ");}

    }

}
