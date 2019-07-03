package quicksort;

public class QuickSort {

    private Output output = new Output();

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arrayToSort = new int[]{4,6,2,5,1,3};
        int[] sortedArr = quickSort.sort(arrayToSort, 0, arrayToSort.length-1);
    }

    public int[] sort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sort(arr, begin, partitionIndex-1);
            sort(arr, partitionIndex+1, end);
        }
        System.out.println(output.printArray(arr));
        return arr;
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
