public class BubbleSort {
    private int i;
    private int j;
    private int n;
    private int[] A;
    private int aux;

    public BubbleSort(int[] A, int n){
        this.A = A;
        this.n = n;
    }

    public void Ordena(){
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                if (A[j] > A[j+1]){
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                }
            }
        }
    }
}