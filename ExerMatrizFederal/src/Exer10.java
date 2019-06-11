import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cidades;
        System.out.println("Digite a quantidade de cidades ");
        cidades = scan.nextInt();
        int[][] custos = new int [cidades][cidades];
        int [] rota = new int [cidades];
        int soma =0;
        for (int i = 0; i < custos.length; i++) {
            for (int j = 0; j < custos[i].length; j++) {
                System.out.println("Digite o custo da linha : " +(i+1)+" e coluna : "+(j+1));
                custos[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < rota.length; i++) {
            System.out.println("Digite a rota do caminhão na sequencia "+i);
            rota[i] = scan.nextInt();
        }
        for (int i = 0; i < rota.length-1; i++) {
            soma += custos[rota[i]][rota[i+1]];

        }
        System.out.println("O custo e de "+soma+" unidades.");
    }
}
