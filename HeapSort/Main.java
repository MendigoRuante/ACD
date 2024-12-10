public class Main {
    public static void main(String[] args) {
        int[] A = {21, 1, 13, 3, 4, 8, 5, 2, 9};
        int n = A.length;
        System.out.println("Vetor original:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        HeapSort ordenador = new HeapSort(A, n);
        System.out.println("\n\nVetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
