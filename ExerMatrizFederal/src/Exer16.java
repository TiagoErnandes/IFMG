import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sair = false,msgCodEcontrado=true;
        int menu;
        int indice =0 ;
        int retiraplanta;
        int qtdplanta;

        int [][] codigo = new int[50][3];
        String[] nomesPlantas = new String [50];

        while(!sair){
            System.out.println("\n" +
                    "==========================================\n" +
                    "FLORICULTURA MARIASFLOR\n" +
                    "==========================================\n" +
                    "1. CADASTRAR NOVA PLANTA\n" +
                    "2. RETIRAR PLANTA\n" +
                    "3. INSERIR PLANTA\n" +
                    "4. IMPRIMIR RELATÓRIO\n" +
                    "5. SAIR\n" +
                    "===========================================");
            menu = scan.nextInt();

           switch (menu){
               case 1:

                       System.out.println("Digite o nome da planta ");
                       nomesPlantas[indice] = scan.next();

                        System.out.println("Digite o código da planta "+nomesPlantas[indice]);
                        codigo[indice][0] = scan.nextInt();
                           System.out.println("Digite o estoque ideal:");
                           codigo[indice][1] = scan.nextInt();
                           System.out.println("Digite a quantidade atual da planta "+nomesPlantas[indice]);
                           codigo[indice][2] = scan.nextInt();
                           indice = indice+1;
                           break;
               case 2:
                   System.out.println("Digite o código da planta para retirar");
                   retiraplanta = scan.nextInt();
                   for (int i = 0; i < indice; i++) {
                       if(codigo[i][0]==retiraplanta){
                           msgCodEcontrado=false;
                           System.out.println("Digite a quantidade da planta : "+nomesPlantas[i]+" para ser retirado");
                           qtdplanta = scan.nextInt();
                           if (qtdplanta > codigo[i][2] ){
                               System.out.println("Não a plantas suficientes para essa quantidade, a quantidade atual é : "+codigo[i][2]);
                           }else {
                               codigo[i][2] = codigo[i][2]-qtdplanta;
                           }
                           System.out.println("O estoque é : "+codigo[i][2]);
                       }else{

                       }

                       }
                    if(msgCodEcontrado){
                       System.out.println("Código não encontrado");
                   }else{

                    }

                     break;
               case 3: System.out.println("Digite o código da planta para inserir");
                   retiraplanta = scan.nextInt();
                   for (int i = 0; i < indice; i++) {
                       if(codigo[i][0]==retiraplanta){
                           msgCodEcontrado=false;
                           System.out.println("Digite a quantidade da planta : "+nomesPlantas[i]+" para ser inserir");
                           qtdplanta = scan.nextInt();
                           codigo[i][2] = codigo[i][2]+qtdplanta;
                           System.out.println("O estoque é : "+codigo[i][2]);
                       }
                   }
                   if(!msgCodEcontrado){
                       System.out.println("Código não encontrado");
                   }
                   break;
               case 4:
                   System.out.println("     Nome  | Código  |   Estoque Ideal | Estoque Atual");
                   for (int i = 0; i < indice; i++) {
                       System.out.print (nomesPlantas[i]+"      ");
                       for (int j = 0; j < codigo[indice].length; j++) {
                           System.out.print(" "+codigo[i][j]+"           ");
                       }
                       System.out.println();
                   }
                   break;



               case 5:
                   sair=true;
                   break;
               default:
                   System.out.println("Numero invalido ");
                   System.out.println("Digite novamente");
           }


        }

    }
}
