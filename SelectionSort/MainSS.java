public class MainSS{
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,6,6,6,6,6,10,9,8,7,8};
        int n = A.length - 1;
        int i;
        SelectionSort teste = new SelectionSort(A, n);
        teste.Ordena();
        for(i=0;i<=n;i++){
            System.out.print(A[i] + ", ");
        }
    }
}