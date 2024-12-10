public class Main {
    public static void main(String[] args) {
        int[] A = {0,9,9,9,9,9,8,8,8,6,6,6,5,5,4,3,2,2,1};
        int[] Ordenado = A.clone();
        int n = A.length - 1;
        int k = 100;
        int i;
        CountingSort teste = new CountingSort(n,k,A,Ordenado);
        teste.ORDENAPORCONTAGEM();
        for (i=0;i<=n;i++){
            System.out.print(Ordenado[i] + ", ");
        }
    }
}
