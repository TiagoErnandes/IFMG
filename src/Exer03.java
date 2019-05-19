import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Digite a quantidade de numeros");
        n=scan.nextInt()+2;
        int[] vetor = new int[n];
        vetor[0] =1;
        for (int i=1;i <= vetor.length-2;i++){
              vetor[i+1] = vetor[i]+vetor[i-1];
            System.out.println(vetor[i+1]);
        }

    }
}
