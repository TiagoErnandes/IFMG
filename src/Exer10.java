import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s;
        int[] a = new int[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Digite o numero "+i);
            a[i] = scan.nextInt();
        }
        s =(double) Math.pow((a[0]-a[9]), 2) +  Math.pow((a[1] - a[8]),2) + Math.pow((a[2] - a[7]),2) + Math.pow((a[3] - a[6]),2) + Math.pow((a[4] - a[5]),2);
        System.out.println(s);
    }

}
