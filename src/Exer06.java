import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero,lengthCon1=0,lengthCon2=0;
        System.out.println("Digite a quantidade de numeros a ser cadastrados");
        numero = scan.nextInt();
        int[] n = new int[numero];
        for(int i =0 ; i < n.length;i++){
            System.out.println("Digite o numero "+(i+1));
            n[i] = scan.nextInt();
            if(n[i] > 0 && n[i] % 2 ==0){
                lengthCon1++;
            }
            if(n[i]<0 || n[i] % 2 ==1){
                lengthCon2++;
            }
        }

        int[] con1 = new int[lengthCon1];
        int[] con2 = new int[lengthCon2];
        int b=0,c=0;
        for(int i=0;i <n.length;i++){

            if(n[i] > 0 && n[i] % 2 ==0){
                con1[b]=n[i];
                b+=1;
            }
            if(n[i]<0 || n[i] % 2 ==1){
                con2[c]=n[i];
                c+=1;
            }
        }
        System.out.println("Numeros Digitados");
        for(int i =0 ; i < n.length;i++) {

            System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.println("Conjunto 1");
        for(int i =0 ; i < con1.length;i++) {

            System.out.print(con1[i]+" ");
        }
        System.out.println();
        System.out.println("Conjunto 2");
        for(int i =0 ; i < con2.length;i++) {
    System.out.print(con2[i]+" ");
        }

    }
}
