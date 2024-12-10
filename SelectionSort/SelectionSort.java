public class SelectionSort{
    private int[] A;
    private int n;
    private int i;
    private int menor;
    private int j;
    private int aux;


    public SelectionSort(int[] A, int n){
        this.A = A;
        this.n = n;
    }

    public void Ordena(){
        for(i=0;i<n;i++){
            menor = i;
            for(j=i+1;j<=n;j++){
                if(A[j]<A[menor]){
                    menor = j;
                }
            }
            aux = A[i];
            A[i] = A[menor];
            A[menor] = aux;
        }
    }

}