public class CountingSort{
    private int[] A;
    private int[] B;
    private int[] C;
    private int n;
    private int k;
    public CountingSort(int[] A,int k,int[] B){
        this.A = A;
        this.B = B;
        this.C = new int[k+1];
        this.k = k;
        SortByCounting();
    }
    public void SortByCounting(){
        int i;
        int j;
        //Execuçao
        for(i = 0; i <= k; i++){
            C[i] = 0;
        }
        for(j = 1; j < n; j++){
            C[A[j]] = C[A[j]]+1;
        }
        for(i=1; i<k; i++){
            C[i] = C[i]+C[i-1];
        }
        for(j=n;j>=1;j--){
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]]-1;
        } 
    }
}
