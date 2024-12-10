public class  MainSllS{
    public static void main(String[] args) {
        int[] A = {1000000,4,1,7,4,2,9};
        int n = A.length - 1;
        int i;
        ShellSort teste = new ShellSort(A, n);
        teste.Ordena();
        for(i=0;i<=n;i++){
            System.out.print(A[i] + ", ");
        }
    }
}