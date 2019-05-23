import java.util.Random;

public class Exer11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        for(int i =0;i < num1.length;i++){
            num1[i] = rand.nextInt(11);
            num2[i] = rand.nextInt(11);
        }
        System.out.println("Lista 1");
        for(int i =0;i < num1.length;i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println();
        System.out.println("lista 2");
        for(int i =0;i < num1.length;i++){

            System.out.print(num2[i]+" ");
        }
        for(int i =0;i < num1.length;i++){
            if(i%2==0){
                num3[i]=num1[i];
            }else{
                num3[i]=num2[i];
            }
         }
        System.out.println();
        System.out.println("lista 3 Intercalados");
        for(int i =0;i < num1.length;i++){

            System.out.print(num3[i]+" ");
        }
    }
}
