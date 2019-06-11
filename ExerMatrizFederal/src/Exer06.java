import java.util.Random;

public class Exer06 {
    public static void main(String[] args) {
        int[][] latas = new int[6][20];
        double[] media = new double[latas.length];
        Random rand = new Random();
        int soma=0;

        double solucao =0;
        double[] resultado =new double[latas.length];

        for(int i =0 ; i < latas.length;i++){
            soma =0;
            for(int j =0 ; j < latas[i].length;j++){
                latas[i][j] = rand.nextInt(11)+385;
                soma += latas[i][j];
            }
            media[i] =soma /20;
        }






        for(int i =0 ; i < latas.length;i++){
            solucao =0;
            for(int j =0 ; j <latas[i].length;j++){
                solucao += Math.pow((latas[i][j]-media[i]),2);
                resultado[i] =(double) solucao/(latas.length-1);
            }

            resultado[i] =(double) Math.sqrt(resultado[i]);
        }


        for(int i =0 ; i < latas.length;i++){
        System.out.println("A media de variação na lata é "+media[i]+" ml");
        System.out.println("O padrão de desvio é :"+resultado[i]);
        if (resultado[i] > 5 || resultado[i] < -5){
            System.out.println("O processo dever ser revisado");
        }else{
            System.out.println("O processo não deve ser revisado");
        }
       }
        }
    }

