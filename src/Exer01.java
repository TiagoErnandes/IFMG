import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = new String [5];
        int[] idade = new int[alunos.length];
        int totMenor16=0,totMaior16=0,
                alunosAcimaMedia=0,alunoNovo=Integer.MAX_VALUE,alunoVelho=Integer.MIN_VALUE,soma=0;
        double mediaIdades;

        for (int i=0;i<idade.length;i++){
            System.out.println("Digite o nome do aluno "+(i+1));
            alunos[i] = scan.nextLine();
            System.out.println("Digite a idade do aluno "+alunos[i]);
            idade[i]= scan.nextInt();
            scan.nextLine();
            soma += idade[i];
            if(idade[i]<= 16){
                totMenor16++;
            }else{
                totMaior16++;
            }
        }
        mediaIdades = soma/idade.length;
        int alunono=150;
        int alunoVe=0;
        for(int i =0;i<idade.length;i++){
            if (idade[i] > mediaIdades){
                alunosAcimaMedia++;
            }

            if(idade[i]< alunono){
             alunoNovo= i;
             alunono =idade[i];
            }

            if(idade[i] > alunoVe){
                alunoVelho = i;
                alunoVe = idade[i];
            }
        }
        System.out.println("O Total de alunos menor ou igual a 16 anos é :"+totMenor16);
        System.out.println("O Total de alunos maior que 16 anos é :"+totMaior16);
        System.out.println("A media de alunos é :"+mediaIdades);
        System.out.println("O total de alunos com a idade acima media é "+alunosAcimaMedia);
        System.out.println("O aluno : "+alunos[alunoNovo]+" e o aluno mais novo com a idade: "+idade[alunoNovo]);
        System.out.println("O aluno : "+alunos[alunoVelho]+" e o aluno mais velho com a idade: "+idade[alunoVelho]);

    }
}
