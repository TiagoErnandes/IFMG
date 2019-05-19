import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor1 = new double[10];
        double[] vetor2 = new double[10];
        double [] vetor3 = new double[vetor1.length];
        for(int i=0 ; i<vetor1.length;i++){
            System.out.println("Digite o valor do vetor 1 na posição: "+(i+1));
            vetor1[i] = scan.nextDouble();
            System.out.println("Digite o valor do vetor 2 na posição: "+(i+1));
            vetor2[i] = scan.nextDouble();
        }
        for(int i=0 ; i<vetor1.length;i++){
            if(vetor1[i] == vetor2[i]){
                vetor3[i] = 1;
            }else{
                vetor3[i] =0;
            }
        }
        System.out.println("Vetor1    Vetor2     Vetor3");
        for(int i=0;i<vetor1.length;i++){
            System.out.print(vetor1[i]+"  |  "+vetor2[i]+"   |  "+vetor3[i]+" \n");
        }
    }
}
