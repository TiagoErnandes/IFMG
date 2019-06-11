import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valido = false;
        int tamanhoMatriz;
        System.out.println("Digite o tamanho da matriz quadrada");
        tamanhoMatriz = scan.nextInt();
        int [][] matriz = new int [tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                valido = true;
                while(valido){
                System.out.println("Digite na linha "+(i+1)+" e coluna "+(j+1)+" o numero para prencher a matriz 0 ou 1 ");
                int valor = scan.nextInt();

                if(valor <0 || valor > 1){
                    System.out.println("!!Valor invalido Digite novamente!!");
                    System.out.println();
                    valido = true;
                }else{
                    valido = false;
                }
                matriz[i][j] =valor;
            }
            }
        }
        boolean matrizPermutacao =true;
        for (int i = 0; i < matriz.length ; i++) {
            int cont =0;
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == 1){
                    cont++;
                    if (cont++ > 1){
                    matrizPermutacao = false;
                    break;}
                }
            }

        }
        if(matrizPermutacao){
            System.out.println("MATRIZ PERMUTAÇÃO");
        }else{
            System.out.println("NÃO É MATRIZ PERMUTAÇÃO");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" |");
            }
            System.out.println();
        }
    }
}
