import java.util.Random;
import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[][] estoque=new int [5][3];
        int[] somaArmazen  = new int[estoque.length-1];
        int [] custoDeEstocagem = new int[estoque.length-1];
        int maiorArmazemCustoDeEstocagem =0 ;
        int maiorCustoDeEstocagem =0 ;
        int menorEstoque = Integer.MAX_VALUE;
        int menorArmazemEstoque =0;
        int maiorEstoqueProduto2=0;
        int armazemMaiorEstoque2=0;
        for (int i =0;i < estoque.length;i++){
            for(int j=0 ; j < estoque[i].length;j++){
                if (i > estoque.length-2){
                    System.out.println("Digite qual o peso do produto do tipo : "+(j+1));
                    estoque[i][j] = scan.nextInt();
                }else {
                    System.out.println("Digite quantos produtos do tipo " + (j + 1) + " possuir no armazem " + (i + 1));
                    estoque[i][j] = scan.nextInt();
                    somaArmazen[i] += estoque[i][j];
                    if(j == 2 && estoque[i][j] > maiorEstoqueProduto2){
                        maiorEstoqueProduto2 = estoque[i][j];
                        armazemMaiorEstoque2 = i;

                    }
                }
            }
        }

        for (int i =0;i < somaArmazen.length;i++){

                if (somaArmazen[i] < menorEstoque){
                    menorEstoque = somaArmazen[i];
                    menorArmazemEstoque =i;


                }

            }
        for(int i =0;i < custoDeEstocagem.length-1;i++){
            custoDeEstocagem[i] = somaArmazen[i] * estoque[4][i];
        }
        for(int i =0 ; i < custoDeEstocagem.length;i++){
            if(maiorCustoDeEstocagem > custoDeEstocagem[i]){
                maiorCustoDeEstocagem = custoDeEstocagem[i];
                maiorArmazemCustoDeEstocagem =i;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("Quantidade de itens armazenados em cada armazém;");
        for(int i =0 ; i < somaArmazen.length;i++){
        System.out.println("Armamazem "+(i+1)+" possui um total de "+somaArmazen[i]+" no produtos no estoque");
        }
        System.out.println();
        System.out.println("O armazém que possui o maior estoque do produto 2 é :"+(armazemMaiorEstoque2+1));
        System.out.println("O armazém possui menor estoque é ;"+(menorArmazemEstoque+1));
        System.out.println("O armazém que possui maior custo de estocagem é "+(maiorArmazemCustoDeEstocagem+1));
    }
}
