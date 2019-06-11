import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        boolean simetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da linha "+(i+1)+" é coluna "+(j+1));
                matriz[i][j] = scan.nextDouble();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }

            }
        }
        if(simetrica){
            System.out.println("Matriz Simetrica");
        }else{
            System.out.println("Matriz não Simetrica");
        }
    }
}
