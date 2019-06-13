import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int[][] servico = new int[5][3];
      double[] salario = new double[5];
      double [][]valorBrutoSeparado = new double[5][3];
      int manicure,tipo;

      boolean relatorio = true;

      while(relatorio){
          System.out.println("========== Maria Saliente ==========");
          System.out.println("Digite o numero da manicure :1-2-3-4-5");
          System.out.println("Aperte 0- para finalizar o relatorio");
          manicure = scan.nextInt();
          if (manicure == 0){
              relatorio= false;
              break;
          }
          System.out.println("Digite o trabalho 1-unha dos pés 2-unhas das mãos” 3 serviço de\n" +
                  "podologia.");
          tipo=scan.nextInt();
          for (int i = 0; i < servico.length; i++) {
              for (int j = 0; j < servico[i].length; j++) {
                  if((manicure-1) == i && (tipo-1) ==j){
                      servico[i][j]++;
                  }
              }
          }


      }
      int valorSer=0;
        for (int i = 0; i < servico.length; i++) {
            for (int j = 0; j < servico[i].length; j++) {
                if(j ==0){
                    valorSer =15;
                }else if(j ==1){
                    valorSer =15;
                }else if (j ==2){
                    valorSer =30;
                }else{
                    System.out.println("Valha");
                }
                salario[i] +=(double) (servico[i][j] * valorSer)/2;
                valorBrutoSeparado[i][j] +=(double) (servico[i][j] * valorSer)/2;
                }

            }
        for (int i = 0; i < servico.length; i++) {
            System.out.println("Manicure : "+(i+1));
            System.out.println("unha dos pés    | unhas das mãos    | serviço de " +
                    "podologia.   Salario: R$ "+salario[i]+" ");
            for (int j = 0; j < servico[i].length; j++) {

                System.out.print(servico[i][j]+" total : "+valorBrutoSeparado[i][j]+"   |   ");
            }
            System.out.println();
        }
    }
}
