
public class Ex3 {

    public static void main(String[] args) {

        char mat[][] = new char[150][4];
        int nlinhas = 0, ncolunas = 0;
        geramat(mat, nlinhas, ncolunas);

    }
    static void geramat(char mat[][], int nlinhas, int ncolunas)
    {
        char conceitos[] = {'a', 'b', 'c', 'd', 'f'};
        int i, j, valor;
        for (i = 0; i < nlinhas; i++) {
            for (j = 0; j < 10; j++) {
                valor = (int)(Math.random() * 5);
                mat[i][j] = conceitos[valor];
            }
        }
    }

    static void geramedia(char mat[][])
    {
        double v[] = new double[150];
        for (int i = 0; i < 10; i++) {

        }
    }

    static void imprimeconceitofinal (int v[])
    {
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0.8) {
                System.out.println("CONCEITO FINAL F");
            }
            else if (v[i] < 1.5) {
                System.out.println("CONCEITO FINAL D");
            }
            else if (v[i] < 2.5) {
                System.out.println("CONCEITO FINAL C");
            }
            else if (v[i] <3.6) {
                System.out.println("CONCEITO FINAL B");
            }
            else
            {
                System.out.println("CONCEITO FINAL A");
            }
        }
    }

}
