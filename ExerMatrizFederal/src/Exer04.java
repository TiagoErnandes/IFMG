import java.util.Random;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int totSoma=0,numDiasAcimaDaMedia=0;
        double totMedia;
        int semanas;
        System.out.println("Digite a quantidade de semanas de produ��o ");
        semanas = scan.nextInt();
        int [][]producao = new int [semanas][7];
        int [] minimaProducao = new int[semanas];
        for(int i =0 ; i < producao.length;i++) {
            for (int j =0 ;j < producao[i].length;j++) {
                producao[i][j] = rand.nextInt(100)+1;
                totSoma+=producao[i][j];
            }
        }
        System.out.println(producao.length);
        totMedia = totSoma/(producao.length*7);
        for(int i =0 ; i < producao.length;i++) {
            for (int j =0 ;j < producao[i].length;j++) {

                if(producao[i][j]>totMedia) {
                    numDiasAcimaDaMedia++;
                }else {
                    minimaProducao[i]++;
                }
            }
        }
        System.out.println("RELAT�RIO DE PRODU��O RELATIVO � "+semanas+" SEMANAS");
        System.out.println("-----------------------------------------------------");
        System.out.println("Produ��o m�dia = "+totMedia);
        System.out.println("N�mero de dias com produ��o acima da m�dia  = "+numDiasAcimaDaMedia);

        System.out.println("INDICA��O DOS DIAS DE BAIXA PRODU��O: ");
        for(int i =0;i < producao.length;i++) {
            System.out.println("Semana "+(i+1)+" ................................ DIA: "+minimaProducao[i]);
        }

    }
    }

