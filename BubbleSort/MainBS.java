public class MainBS {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        int n = A.length - 1;
        int i;
        BubbleSort teste = new BubbleSort(A, n);
        teste.Ordena();
        for (i=0;i<=n;i++){
            System.out.print(A[i] + ", ");
        }
    }
}