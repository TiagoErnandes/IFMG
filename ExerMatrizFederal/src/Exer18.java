import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] figura = new int[5][5];
        int rodadas=0;
        int one_sequence_start_from = 0;
        int pending_sectors = 0;
        for(int i = 0; i < figura.length; i++)
        {
            for(int j = 0; j < figura[i].length; j++)
            {
                if(pending_sectors > 0)
                {
                    for(int g = 0; g < pending_sectors; g++)
                    {
                        figura[i][j] = 1;
                        j++;
                    }
                    pending_sectors = 0;
                    if(i < figura.length - 1)
                        i++;
                }
                else if(j == one_sequence_start_from)
                {
                    for(int c = 0; c < 3; c++)
                    {
                        if(j >= figura[i].length)
                        {
                            pending_sectors = 3 - c;
                            i--;
                            break;
                        }
                        figura[i][j] = 1;
                        j++;

                    }
                    one_sequence_start_from += 1;
                }
            }
        }
        boolean rodadaValida = true;
        while (rodadaValida) {
            System.out.println("Digite o numero de rodadas ");
            rodadas = scan.nextInt();
            if(rodadas % 2 ==0){
                System.out.println("Valor invalido digite um numero impar ");
            }else{
                rodadaValida=false;
            }
        }
        int d,x=0;
        int dario =0 , xerxes =0;

        while (rodadas>0){
            System.out.println("Digite a mão de Dario ");
            d = scan.nextInt();

            System.out.println("Digite a mão de Xerxes");
            x = scan.nextInt();
            if(figura[d][x] == 1){
                dario++;
            }else if (figura[x][d] == 1){
                xerxes++;
            }
        rodadas--;
        }
        if(dario>xerxes){
            System.out.println("dario");
        }else{
            System.out.println("xerxes");
        }
    }
}
