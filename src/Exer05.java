import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int podParticipar =0;
        double[] altura = new double [20];
        double soma=0,media;
        for (int i =0;i < altura.length;i++){
            System.out.println("Digite a altura do atleta "+(i+1));
            altura[i]= scan.nextDouble();
            soma += altura[i];
        }
        media = soma/altura.length;
        for (int i =0;i < altura.length;i++){
            if(altura[i] >= media){
                podParticipar++;
            }
        }
        System.out.println("A media :"+media);
        System.out.println("O total de atletas que podem participar é "+podParticipar);
    }
}
