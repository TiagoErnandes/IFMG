import java.util.Arrays;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);
            int[][] mat1 = new int [2][2];
            int[][] mat2 = new int [2][2];
            int [] maiorNumeroLinha = new int [mat1.length];
            Arrays.fill(maiorNumeroLinha,0);//Prenche com o zero todas as posi��o;

            for(int i =0 ; i < mat1.length;i++) {
                for(int j =0 ; j < mat1[i].length;j++) {
                    System.out.println("Digite o numero na linha "+(i+1)+" e conluna "+(j+1)+": ");
                    mat1[i][j] = scan.nextInt();
                    if(maiorNumeroLinha[i] < mat1[i][j]) {
                        maiorNumeroLinha[i] = mat1[i][j];
                    }
                }
            }
            for(int i =0 ; i < mat1.length;i++) {
                for(int j =0 ; j < mat1[i].length;j++) {
                    mat2[i][j] = maiorNumeroLinha[i]*mat1[i][j];

                }
            }
            for(int i =0 ; i < mat1.length;i++) {
                for(int j =0 ; j < mat1[i].length;j++) {
                    System.out.print(mat2[i][j]+" |");

                }
                System.out.println();
            }


        }
    }

