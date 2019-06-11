import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String apelido;

        System.out.println("Digite o nome completo :");
        nome = scan.nextLine();
        System.out.println("Digite o apelido ");
        apelido = scan.nextLine();
        int nome3 = nome.indexOf(" ");
       // nome.charAt(2);

        char teste =' ';
        int cont=0;
        for (int i = 0; i < nome.length(); i++) {
            if( nome.charAt(i) == teste){
                cont++;
            }
        }
        System.out.println("O total de caracter é "+(nome.length()-cont));
        String junta = nome.concat(apelido);
        System.out.println("Nome e apelido "+junta);
        if (nome.equalsIgnoreCase(apelido)){
            System.out.println("O nome e repetido ");
        }else{
            System.out.println("O nome não e repetido ");
        }
    }
}
