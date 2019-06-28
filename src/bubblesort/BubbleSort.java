package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(new int[]{4,2,5,1,3});
    }

//    start bubble sort
//        (print out unsorted array)
//        loop through all numbers in the range 0 to the length of the array
//            loop through all numbers in the range 1 to the length of the array
//                check if the last number in the current array position is greater than the current value.
//                    store the smaller number in a temporary variable
//                    put the larger number in the position of the smaller number
//                    put the temporary value where the larger number was
//                end if
//                (print out array)
//            end loop
//            (print out array)
//        end loop
//        (print out sorted array)
//    end bubble sort

    private void sort(int[] arrayToSort) {

        System.out.println("Sorting array: " + printArray(arrayToSort));
        for (int i = 1; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - i; j++) {
                int current = j;
                int next = j + 1;
                boolean swap = false;
                if (arrayToSort[current] > arrayToSort[next]) {
                    int temp = arrayToSort[current];
                    arrayToSort[current] = arrayToSort[next];
                    arrayToSort[next] = temp;
                    swap = true;
                }
                System.out.println("Pass " + i + '.' + (current + 1) + ": " + printArray(arrayToSort));
                printIndicator(current, swap);
            }
            System.out.println("Array at end of pass " + i + ": " + printArray(arrayToSort));
            System.out.println("\n");
        }
        System.out.println("Sorted array: " + printArray(arrayToSort));
    }

    private String printArray(int[] arrayToPrint) {
        StringBuilder array = new StringBuilder();
        array.append('[');
        for (int i = 0; i < arrayToPrint.length - 1; i++) {
            array.append(arrayToPrint[i]);
            array.append(", ");
        }
        array.append(arrayToPrint[arrayToPrint.length - 1]);
        array.append(']');
        return array.toString();
    }

    private void printIndicator(int index, boolean swap) {
        String print = "           ";
        for (int i = 0; i < index; i++) {
            print += "   ";
        }
        print += "^";
        if (swap) {
            print += "--^";
        }
        System.out.println(print);
    }
}
