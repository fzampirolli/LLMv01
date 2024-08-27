import java.util.Scanner;
public class ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String [] menu ={"CÃ³digo","item", "PreÃ§o unitÃ¡rio"};
       String [] item  ={"pÃ£o de queijo","bauru","hot dog","Cheeseburger","suco","refrigerante"};
       int [] Codigo ={100,101,102,103,104,105};
       double [] preço = {1.10,1.30,1.50,1.30,2.00,1.00};

      for(int i =0;i<3;i++){
          System.out.print(menu[i]+" ");
      }System.out.println(" ");

      for(int i =0;i<6;i++){
         System.out.println(Codigo [i]+"\t"+item [i]+"\t"+ preço [i]);
      }System.out.println(" ");

      do{
      System.out.print("ENTRE COM O C0DIGO DO PRODUTO");
      int n = scan.nextInt();

      int soma =0;

      if(n==100){
          double p = 1.00;
      }
      if (n==101){
        double p = 1.30;  
      }
      if (n==102){
          double p = 1.50; 
      }
      if (n==103){
          double p = 1.30; 
      }
      if (n==104){
          double p = 2.00; 
      }
      if (n==105){
          double p = 1.00; 
      }
      } while(n!=0);

  }

    }
