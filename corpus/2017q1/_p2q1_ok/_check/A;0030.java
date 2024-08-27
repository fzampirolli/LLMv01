
public class Pdoispi {

    public static void main(String[] args) {

    }

    public static void ImprimeVetor(int Vet1[]) {
        System.out.println("");
        int size, loopcounter = 0;
        size = Vet1.length;
        while (loopcounter < size) {
            System.out.print(Vet1[loopcounter]);
            System.out.print(",");
            loopcounter++;
        }
    }

    public static int[] MaioresElementos(int Vet1[], int Vet2[]) {
        int size, loopcounter;
        int Vet3[] = new int[6];
        size = 6;
        for (loopcounter = 0; loopcounter < size; loopcounter++) {
            if (Vet1[loopcounter] > Vet2[loopcounter]) {
                Vet3[loopcounter] = Vet1[loopcounter];
            } else {
                Vet3[loopcounter] = Vet2[loopcounter];
            }

        }
        return Vet3;

    }
}
