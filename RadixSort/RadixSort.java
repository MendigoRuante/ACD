public class RadixSort{
    int[] A;
    int[] B;
    int[] C;
    public RadixSort(int[] A, int n, int d){
        this.A = A;
        SortByDigit(A,d);
    }
    private void SortByDigit(int[] A,  int d){
        int[] B = new int[A.length];
        for (int i = 1; i < d; i++){
            SortByCounting(A,B,i);
        }
    }
    private void SortByCounting(int[]A, int [] B, int d){
        int[] C = new int[10];
        for(int i = 0; i < C.length; i++){
            C[i] = 0;
        }
        for(int j = 0; j < A.length; j++){
            int digit = (A[j] / (int)Math.pow(10,d)) % 10;
            C[digit] = C[digit] + 1;
        }
        for(int i = 1; i < 10; i++){
            C[i] = C[i] + C[i-1];
        }
        for(int j = (A.length - 1); j >= 0; j--){
            int digit = (A[j] / (int)Math.pow(10,d)) % 10;
            B[C[digit] - 1] = A[j];
            C[digit] = C[digit] - 1;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
    }
}
