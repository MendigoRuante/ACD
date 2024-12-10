public class Main{
    public static void main( String args[] ){
        int[] A = {0,1,2,3,5,8,13,21};
        int[] B = A.clone();
        int n = A.length - 1;
        int k = A[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println(A[i]);
        }
        CountingSort ordenador = new CountingSort(A,k,B);
        for(i=0;i<n;i++){
            System.out.println(B[i]+",");
        }
    }
}
