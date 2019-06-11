import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String [3];
        double[][] notas = new double [3][5];
        double[] media = new double [nomes.length];
        double soma;

        for(int i =0 ; i < nomes.length;i++){
            System.out.println("Digite o nome do aluno : "+(i+1));
            soma=0;
            nomes[i]= scan.nextLine();
            for(int j =0 ; j < notas[i].length;j++){
                System.out.println("Digite a nota do aluno "+nomes[i]+" da materia "+(j+1));
                notas[i][j] = scan.nextDouble();
                soma += notas[i][j];
            }
            scan.nextLine();
            media[i] = soma/5;
        }
        for (int i =0 ; i< nomes.length;i++){
            if (media[i] >= 7){
                System.out.println("Aluno "+nomes[i]+" foi Aprovado"+" com a media de "+media[i]);
            }else if(media[i] <7 && media[i] >=4){
                System.out.println("Aluno "+nomes[i]+" foi para o Exame Especial"+" com a media de "+media[i]);
            }else{
                System.out.println("Aluno "+nomes[i]+" foi Reprovado"+" com a media de "+media[i]);
            }
        }
    }
}
