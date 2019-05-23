import java.util.Random;
import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int totPessoas=0;
    double numeroRand;
    String mulheresAcimaDaMediaDeHomen="";
    String homenAbaixoDaMediaDemulheres="";
    String[] alunos = new String[60];
    double[] altura = new double[alunos.length];
    double[] comparacaoIdades = new double[2];
    int [] sexo = new int[alunos.length];
    double[] somas = new double[3];
    double[] medias = new double[3];
    int[] totHM = new int[3];
    comparacaoIdades[0] = Integer.MAX_VALUE;// Guarda a menor idade;
    comparacaoIdades[1] = Integer.MIN_VALUE;// Guarda a maior idade;
        somas[0]=0;//soma geral
        somas[1]=0;//soma homens
        somas[2]=0;//somas mulheres
        medias[0]=0;//media geral
        medias[1]=0;//media homens
        medias[2]=0;//media mulheres

    for(int i=0;i<alunos.length;i++){
        System.out.println("Digite o nomer do aluno ");
       alunos[i] = rand.nextInt()+" "+i;
        System.out.println("Digite a altura do aluno "+alunos[i]);
        altura[i] =  rand.nextDouble()*(2.5);
        System.out.println(altura[i]);
        System.out.println("Digite o sexo 1- Masculino e 2-Feminino");
       sexo[i] = rand.nextInt(2)+1;
       // scan.nextLine();
        somas[0]+=altura[i];
        if(sexo[i]==1){
            somas[1]+=altura[i];
            totHM[1]++;
        }else if (sexo[i]==2){
            somas[2]+=altura[i];
            totHM[2]++;
        }
        if(altura[i] > comparacaoIdades[1]){
            comparacaoIdades[1] = altura[i];
        }
        if(altura[i] < comparacaoIdades[0]){
            comparacaoIdades[0] = altura[i];
        }

    }
        medias[0]=somas[0]/alunos.length;
        medias[1]=somas[1]/totHM[1];
        medias[2]=somas[1]/totHM[2];
      for(int i =0;i<alunos.length;i++){
          if(altura[i]>medias[0]){
              totPessoas++;
          }

          if(sexo[i] == 2 && altura[i]>medias[1]){
              mulheresAcimaDaMediaDeHomen += ""+alunos[i]+" \n";
          }
          if(sexo[i] == 1 && altura[i]<medias[2]){
              homenAbaixoDaMediaDemulheres+=""+alunos[i]+" \n";
          }

      }

      System.out.println("A maior "+ comparacaoIdades[1]+", menor  "+ comparacaoIdades[0]+"e a médias das alturas da turma;"+medias[0]);
        System.out.println();
        System.out.println("As mulheres com altura acima da média da altura dos homens;");
        System.out.println(mulheresAcimaDaMediaDeHomen);
        System.out.println("- Os homens com altura abaixo da média da altura das mulheres;");
        System.out.println(homenAbaixoDaMediaDemulheres);
        System.out.println("- As pessoas com altura abaixo da média da turma."+totPessoas);
    }
}
