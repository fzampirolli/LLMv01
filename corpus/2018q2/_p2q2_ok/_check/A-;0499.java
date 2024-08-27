
import java.util.*;
public class Prova2 {

    public static void main(String[] args) {
       Scanner sca = new Scanner (System.in);
      char ingresso [][]= new char [8][60];
       int a;
       int i=0;
       int j=0;

       for (i=0;i<8;i++){
          for (j=0;j<60;j++){
          ingresso[i][j]='v';
      }}

       do { System.out.println("Aperte: " );
       System.out.println("1.Para comprar um ingresso 2.Ver quantos ingressos foram vendidos e 3.Encerrar o programa");
        a = sca.nextInt();
       int t=0;
       int z=0;
       int cont=0;
       if (a==1){
       do {
       System.out.println("Por favor selecione o seu setor (1 ou 2)");
       int setor = sca.nextInt();
       System.out.println("Agora selecione a fileira (1 a 4)");
       int fileira = sca.nextInt();
       System.out.println("Por fim selecione a cadeira (0 a 59)");
       int cadeira = sca.nextInt();

       if (ingresso[(setor*fileira)-1][cadeira]=='v'){
       System.out.println("Cadeira adicionada com sucesso para finalizar tecle 1 para sair e tecle qualquer para adicionar +1");

       ingresso[(setor*fileira)-1][cadeira]='c';

       cont++;
       } else {System.out.println("Por favor selecione um valor válido");
       System.out.println("Digite 1 para finalizar ou tecle qualquer para comprar +1");}

        t=sca.nextInt();
       }while (t != 1);

       }
       else if (a==2){

       System.out.println("A quantidade de cadeiras já compradas é " + cont );}

       a=sca.nextInt();
      } while (a<3);

}}
