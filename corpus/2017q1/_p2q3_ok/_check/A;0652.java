
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {

        int A[][], B[][];
        A = red();
        printArr(A);
        B = ded(A);
        printArr(B);
    }
    public static int[][] red(){

        int i=0, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("L = ");
        int L = scan.nextInt();
        System.out.print("C = ");
        int C = scan.nextInt();
        int[][] mat = new int[L][C];
        for(i=0;i<mat.length; i++){
            for(k=0;k<mat[i].length; k++){
            mat[i][k] = scan.nextInt();
            }
        }
        return mat;
    }

    public static int[][] ded(int[][] A){

        int i, k, plch = A[0][0], 
            limL = A.length/2,
            limC=A[0].length/2,
            retArr[][] = new int[A.length][A[0].length];

        for(i=0; i<retArr.length;i++){
            for(k=0; k<retArr[i].length;k++){
                retArr[i][k] = 0;
            }
        }

        for(i=0; i<limL;i++){
            for(k=0; k<limC;k++){
                if(plch <A[i][k]){
                    plch = A[i][k];
                }
            }
        }

        for(i=0; i<limL;i++){
            for(k=0; k<limC;k++){
                retArr[i][k] = plch;
            }
        }
        return retArr;

    }

    public static void printArr(int arr[][]){

        int i=0, k=0;
        for(i=0;i<arr.length;i++){
            for(k=0;k<arr[i].length;k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
    }

}
