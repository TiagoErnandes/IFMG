import java.util.Random;
import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        int [][] matriz = new int [5][5];
        Random rand = new Random();
        int[] totAmigos = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(2);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               if(matriz[i][j] == 1 && i != j){
                   totAmigos[i]++;
               }
            }
        }
        System.out.println("Total de amigos");
        for (int i = 0; i < totAmigos.length; i++) {
            System.out.println("Pessoa "+(i+1)+" possui "+totAmigos[i]+" amigos");
        }
        System.out.println();
    }
}
