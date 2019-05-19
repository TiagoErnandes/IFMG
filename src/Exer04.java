public class Exer04 {
    public static void main(String[] args) {
        int n;
        int[] vetor = new int[10];
        for (int i=0;i < vetor.length;i++){
            vetor[i] =(int) Math.pow(i,2);
        }
        for (int i=0;i < vetor.length;i++){
            System.out.print(vetor[i]+" |");
        }
    }
}
