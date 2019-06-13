import java.util.Random;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int totSoma=0,numDiasAcimaDaMedia=0;
        double totMedia;
        int semanas;
        int menorDiaProdutivo =Integer.MAX_VALUE;

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
            menorDiaProdutivo =Integer.MAX_VALUE;
            for (int j =0 ;j < producao[i].length;j++) {

                if(producao[i][j] < menorDiaProdutivo) {
                    menorDiaProdutivo = producao[i][j];
                    minimaProducao[i] =j;
                }
                if(producao[i][j]>totMedia) {
                    numDiasAcimaDaMedia++;
                }
            }
        }
        System.out.println("RELATARIO DE PRODUÇÃO RELATIVO ? "+semanas+" SEMANAS");
        System.out.println("-----------------------------------------------------");
        System.out.println("Produçõo media = "+totMedia);
        System.out.println("Numero de dias com produção acima da media  = "+numDiasAcimaDaMedia);

        System.out.println("INDICAÇÃO DOS DIAS DE BAIXA PRODUÇÃO: ");
        for(int i =0;i < producao.length;i++) {
            System.out.println("Semana "+(i+1)+" ................................ DIA: "+(minimaProducao[i]+1));
        }

    }
    }

