import java.util.Random;
import java.util.Scanner;

public class Exer02 {

        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            Random rand = new Random();
            float [][] matriz= new float [3][5];
            float [] soma= new float [3];
            int maiorValorSomado =0;

            for(int i =0 ; i <matriz.length;i++) {
                for(int j =0 ; j< matriz[i].length;j++) {

                    matriz[i][j] = rand.nextFloat()*10;
                    soma[i] += matriz[i][j];
                    System.out.print("numero sorteado na linha :"+(i+1)+" na coluna "+(j+1)+" : ");
                    System.out.printf("%.2f",matriz[i][j]);
                    System.out.println();
                }
                System.out.println();
            }
            float verificador =0;
            for (int i =0 ; i <soma.length;i++) {
                if(soma[i] >verificador ) {
                    verificador = soma[i];
                    maiorValorSomado = i;
                }
            }
            System.out.print("A linha "+(maiorValorSomado+1)+" possui a maior soma de valores no totel de : ");
            System.out.printf("%.2f",soma[maiorValorSomado]);
        }
    }

