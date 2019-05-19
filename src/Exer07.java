import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] notasAbsolutas = new int[5];
        double[] notasRelativas = new double[notasAbsolutas.length];
        int soma=0;
        boolean validor = false;


        for (int i=0;i < notasAbsolutas.length;i++){
            do {
                System.out.println("Digite a nota " + (i + 1));
                notasAbsolutas[i] = scan.nextInt();
                if(notasAbsolutas[i] < 0 || notasAbsolutas[i] > 10){
                    validor=true;
                    System.out.println("Valor da nota invalido\nNotas validas de 0 a 10");
                }else{
                    validor=false;
                }
            }while(validor);
            soma += notasAbsolutas[i];

        }
        for (int i=0;i < notasAbsolutas.length;i++){
            notasRelativas[i] =(double) notasAbsolutas[i]/soma;
        }
        System.out.println("Frequencia Absolutdas  -   Frequencia Relativas");
        for (int i=0;i < notasAbsolutas.length;i++){
            System.out.printf(notasAbsolutas[i]+"                   -           %.2f",notasRelativas[i]);
            System.out.println();
        }

    }
}
