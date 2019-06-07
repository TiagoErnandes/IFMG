import java.util.Random;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int linhaA=3,colunaB=4;
        int[][] a = new int[linhaA][colunaB];
        int[][] resultante = new int[linhaA][colunaB];
        int linha, coluna;
        System.out.println("Digite a linha da matriz");
        linha = scan.nextInt();
        System.out.println("Digite a coluna da matriz");
        coluna = scan.nextInt();
        int[][] b = new int[linha][coluna];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(11)+1;
                b[i][j] = rand.nextInt(11)+1;
            }
        }
        if (linhaA ==linha && colunaB == coluna) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    resultante[i][j] = a[i][j]*b[i][j];
                }

            }
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    System.out.print(resultante[i][j]+" ");
                }
                System.out.println();
            }

        }else {
            System.out.println("N�o e possivel multiplicar");

        }

    }
    }

