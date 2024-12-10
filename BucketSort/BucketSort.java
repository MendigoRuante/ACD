import java.util.ArrayList;
import java.util.Collections;
public class BucketSort{
    int[] A;
    public BucketSort(int[] A){
        this.A = A;
        SortByBucket(A, A.length);
    }
    private void SortByBucket(int[] A, int n){
        ArrayList<Integer>[] B = new ArrayList[n];
        for(int i = 0; i < n; i++){
            B[i] = new ArrayList<>();
        }
        int max = A[0];
        for(int i = 1; i < n; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        for (int i = 0; i < n; i++) {
            int balde = (A[i] * (n - 1)) / (max + 1);
            B[balde].add(A[i]);
        }
        for(int i = 0; i < n-1; i++){
            Collections.sort(B[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int valor : B[i]) {
                A[index++] = valor;
            }
        }
    }
}
