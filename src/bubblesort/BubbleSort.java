package bubblesort;

public class BubbleSort {

    private Output output = new Output();

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = new int[]{4,2,5,1,3};
        bubbleSort.sort(arrayToSort);
    }

//    start bubble sort
//        loop through all numbers in the range 0 to the length of the array
//            loop through all numbers in the range 1 to the length of the array
//                check if the last number in the array is greater than the current number
//                    swap the two numbers
//                end if
//            end loop
//        end loop
//    end bubble sort

    private void sort(int[] arrayToSort) {

        output.printUnsortedArray(arrayToSort);
        // loop through all numbers in the range 0 to the length of the array
        for (int i = 1; i < arrayToSort.length - 1; i++) {
            // loop through all numbers in the range 1 to the length of the array
            for (int j = 0; j < arrayToSort.length - i; j++) {
                int current = j;
                int next = j + 1;
                boolean swap = false;
                // check if the last number in the array is greater than the current number
                if (arrayToSort[current] > arrayToSort[next]) {
                    // swap the two numbers
                    int temp = arrayToSort[current];
                    arrayToSort[current] = arrayToSort[next];
                    arrayToSort[next] = temp;
                    swap = true;
                }
                output.printPass(i, current, next, arrayToSort, swap);
                output.printIndicator(current, swap);
            }
            output.printUpdatedArray(arrayToSort, i);
        }
        output.printSortedArray(arrayToSort);
    }
}
