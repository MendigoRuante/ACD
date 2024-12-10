public class ShellSort{
    private int[] A;
    private int n;
    private int h;
    private int i;
    private int j;
    private int x;

    public ShellSort(int[] A, int n){
        this.A = A;
        this.n = n;
    }

    public void Ordena(){
        h=1;
        do{
            h=h*3+1;
        }while(h<n);
        do{
           h=h/3;
           for(i=h+1;i<=n;i++){
                x = A[i];
                j = i;
                do {
                    A[j] = A[j-h];
                    j = j - h;
                    if (j<=h) break;
                } while (A[j-h]>x);
                A[j] = x;
           } 
        }while(h!=1);
    }
}