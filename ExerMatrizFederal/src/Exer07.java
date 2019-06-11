import java.util.Arrays;
import java.util.Random;

public class Exer07 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] matriz = new double[4][7];
        double menorValor = Integer.MAX_VALUE;
        int linha=0 ,coluna=0;
        for(int i =0 ; i < matriz.length;i++){
            for(int j =0 ; j < matriz[i].length;j++){
                matriz[i][j] = rand.nextInt(101);
            }
        }
        for(int i =0 ; i < matriz.length;i++){
            for(int j =0 ; j < matriz[i].length;j++){
                if(matriz[i][j] < menorValor ){
                    menorValor = matriz[i][j];
                    linha =i;
                    coluna =j;
                }
                System.out.print(matriz[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("O menor valor da matriz é : "+menorValor);
        System.out.println("A posição da linha é "+(linha+1)+" coluna "+(coluna+1));

    }
}
