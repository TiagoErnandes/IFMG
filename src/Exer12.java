import java.util.Random;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int aux;
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        for (int i=0;i < vetor1.length;i++){
            System.out.println("Digite o valor "+(i+1));
            vetor1[i] = rand.nextInt(11);
            vetor2[i] = vetor1[i];
            vetor3[i] = vetor1[i];
        }
        for(int i=0;i<vetor2.length;i++){
            for(int j=0;j < (vetor2.length-1);j++){
                if(vetor2[j] > vetor2[j+1]){
                    aux = vetor2[j];
                    vetor2[j] = vetor2[j+1];
                    vetor2[j+1] = aux;
                }

            }
        }
        for(int i=0;i<vetor3.length;i++){
            for(int j=0;j < (vetor3.length-1);j++){
                if(vetor3[j] < vetor3[j+1]){
                    aux = vetor3[j];
                    vetor3[j] = vetor3[j+1];
                    vetor3[j+1] = aux;
                }

            }
        }
        System.out.println();
        System.out.println("Vetor Digitado");
        for(int i=0;i <vetor3.length; i++){
            System.out.print(vetor1[i]+ " ");
        }
        System.out.println();
        System.out.println("Vetor Crecente");
        for(int i=0; i < vetor3.length;i++){
            System.out.print(vetor2[i]+ " ");
        }
        System.out.println();
        System.out.println("Vetor Decrecente");
        for(int i=0;i < vetor3.length;i++){
            System.out.print(vetor3[i]+ " ");
        }

    }
}
