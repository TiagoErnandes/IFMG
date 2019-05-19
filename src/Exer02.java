import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int i =0;i < vetor.length;i++){
            System.out.println("Digite o numero na posição "+(i+1));
            vetor[i] = scan.nextInt();
        }
        for(int i =0;i < vetor.length;i++){
            System.out.print(vetor[i]+" | ");
        }
        System.out.println();
        for(int i =vetor.length-1;i >= 0;i--){
            System.out.print(vetor[i]+" | ");
        }
    }
}
