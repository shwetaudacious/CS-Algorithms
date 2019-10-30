 public class QuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] pArray) {
         
        if (pArray == null || pArray.length == 0) {
            return;
        }
        this.array = pArray;
        length = pArray.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int low, int high) {
         
        int i = low;
        int j = high;
        int pivot = array[low+high/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        QuickSort sorter = new QuickSort();
        int[] ip = {7,5,5,6,1,2,9,0};
        sorter.sort(ip);
        for(int i:ip){
            System.out.print(i);
        }
    }
}