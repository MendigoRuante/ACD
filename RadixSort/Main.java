import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(100); 
        }
        System.out.println("Vetor original:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        int max = Arrays.stream(A).max().getAsInt();
        int digit = (int) Math.log10(max) + 1;
        RadixSort ordenador = new RadixSort(A, n, digit);
        System.out.println("\n\nVetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
