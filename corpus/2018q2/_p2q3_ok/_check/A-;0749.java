
public class P2Q3 {

     static void GerarMat(char Mat[][], int nlinhas, int ncolunas){
    char conceitos[]={'A', 'B', 'C', 'D', 'F'};    
    int i, j, valor;
    for(i=0; i<nlinhas;i++){
    for(j=0; j<ncolunas;j++){
    valor=(int)(Math.random()*5);
    Mat[i][j]=conceitos[valor];
    }}

    }

    static void GerarMedia(char Mat[][], int nlinhas, int ncolunas){
    int i, j, cont=0; 
    double valor[]=null, peso[] = null;
    peso[0]= 0.37;
    peso[1]=0.1;
    peso[2]=0.15;
    peso[3]=0.38;

    for(i=0; i<nlinhas;i++){
    for(j=0; j<ncolunas;j++){
     if( Mat[i][j]=='A'){

         valor[i]+=4*peso[j];
    }
    if( Mat[i][j]=='B'){

         valor[i]+=3*peso[i];
    }
     if( Mat[i][j]=='C'){

         valor[i]+=2*peso[j];
    }
      if( Mat[i][j]=='D'){

         valor[i]+=peso[j];
    }

    }

  }        

    }

    static void ImprimeConceitoFinal(double media[], int nalunos){
        int i;
        for(i=0;i<nalunos;i++){
        if(media[i]<0.8){
            System.out.println("O aluno"+i+"obteve o conceito F");
    }
        if(0.8<=media[i]&& media[i]<1.5){
    System.out.println("O aluno"+i+"obteve o conceito D");
    }
          if(1.5<=media[i]&& media[i]<2.5){
    System.out.println("O aluno"+i+"obteve o conceito C");
    }
          if(2.5<=media[i]&& media[i]<3.6){
              System.out.println("O aluno"+i+"obteve o conceito B");
          }

    }
          if(media[i]>3.6){
    System.out.println("O aluno"+i+"obteve o conceito A");
    }
    }

    public static void main(String[] args) {

    }

}
