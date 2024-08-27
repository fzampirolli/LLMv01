
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[][] matriz = new int[n][n];

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++){
matriz[i][j] = sc.nextInt();
}
}
int somaBranca = 0;
int somaPreta = 0;
boolean cor = false;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++)
        if (i==0){
            if(j%2!=0){
                somaBranca += matriz[i][j];
                cor=true;
            }
            else { 
                somaPreta += matriz [i][j];
                cor=false;
            }
        }
}
if (somaBranca > somaPreta){
    System.out.println(somaBranca + " " +somaPreta+ " "+"0");
} else{ 
    if(somaPreta> somaBranca)
        System.out.println(somaBranca  + " " +somaPreta+ " "+"1");
    else 
        System.out.println(somaBranca + " "+somaPreta+ " "+"2");
}
}
}
