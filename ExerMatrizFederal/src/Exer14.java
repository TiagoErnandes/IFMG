import java.util.Arrays;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        int[][] lugares = new int[12][4];
        Scanner scan = new Scanner(System.in);
        String resposta;

        for (int i = 0; i < lugares.length; i++) {
            for (int j = 0; j < lugares[i].length; j++) {
                lugares[i][j] = 0;
            }
        }


        boolean fim = true;
        while (fim) {
            int cont = 0;
            int controle = 1;

            System.out.println("========================================\n" +
                    "                MARIAS UNIDAS\n" +
                    "========================================\n" +
                    "a. Vender passagem\n" +
                    "b. Mostrar mapa de ocupação do ônibus\n" +
                    "c. Encerrar\n" +
                    "========================================");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("a")) {
                boolean lugarDiponivel = false;
                for (int i = 0; i < lugares.length; i++) {
                    for (int j = 0; j < lugares[i].length; j++) {
                        if (lugares[i][j] == 0) {
                            lugarDiponivel = true;
                        }
                    }
                }
                if(!lugarDiponivel){
                    System.out.println("Todos os lugares estão Ocupados");
                }
                controle=0;
                int poltrona = 0;
                if (lugarDiponivel) {
                    System.out.println("Digite a poltrona que deseja ocupar ");
                    System.out.println("Qual o numero da poltrona ");
                    poltrona = scan.nextInt();

                    for (int i = 0; i < lugares.length; i++) {
                        for (int j = 0; j < lugares[i].length; j++) {

                            if (controle == (poltrona-1) ) {

                                if(lugares[i][j]==0){
                                    lugares[i][j] = 1;
                                    System.out.println("Venda Efetivada");
                                    controle++;
                                    break;
                                }else{
                                    controle++;
                                    System.out.println("poltrona Ocupada");
                                    System.out.println();
                                }


                            }
                            controle++;
                        }
                    }


                } else {
                    System.out.println("Todos as poltronas estão ocupadas ");
                }
            }else if(resposta.equalsIgnoreCase("b")){
                System.out.println("Janela -     |Corredor       Corredor | janela");
                for (int i = 0; i < lugares.length; i++) {

                    for (int j = 0; j < lugares[i].length; j++) {
                        if (cont < 1) {
                            System.out.print("|  " + (controle) + "  ");
                            System.out.print("   ");
                        }
                        System.out.print(lugares[i][j]+"  |  ");
                        cont++;
                        controle++;
                        if (cont > 1) {
                            System.out.print(" " + (controle - 1) + " |");
                            System.out.print("  ");
                            cont = 0;
                        } else {
                            //  System.out.print(" "+(controle-1)+" ");
                            //  cont=0;
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }else if (resposta.equalsIgnoreCase("c")){
                fim = false;
                break;
            }
        }
        System.out.println("Fim");
    }
}
