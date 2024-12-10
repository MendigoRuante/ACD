public class HeapSort {
    private int[] A;
    private int tamanhoDoHeap;
    public HeapSort(int[] A, int n) {
        this.A = A;
        this.tamanhoDoHeap = n;
        constroiMaxHeap(); 
        for (int i = tamanhoDoHeap - 1; i > 0; i--) {
            int aux = A[0];
            A[0] = A[i];
            A[i] = aux;
            tamanhoDoHeap--;
            maximizaHeap(0);
        }
    }
    private void constroiMaxHeap() {
        for (int i = (tamanhoDoHeap / 2) - 1; i >= 0; i--) {
            maximizaHeap(i);
        }
    }
    private void maximizaHeap(int i) {
        int maior = i;
        int l = esquerda(i);
        int r = direita(i);
        if (l < tamanhoDoHeap && A[l] > A[maior]) {
            maior = l;
        }
        if (r < tamanhoDoHeap && A[r] > A[maior]) {
            maior = r;
        }
        if (maior != i) {
            int temp = A[i];
            A[i] = A[maior];
            A[maior] = temp;
            maximizaHeap(maior);
        }
    }
    private int esquerda(int i) {
        return 2 * i + 1;
    }
    private int direita(int i) {
        return 2 * i + 2;
    }
}
