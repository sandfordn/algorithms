package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(new int[]{4,2,5,1,3});
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

        System.out.println("Sorting array: " + printArray(arrayToSort) + '\n');
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
                printPass(i, current, next, arrayToSort, swap);
                printIndicator(current, swap);
            }
            printUpdatedArray(arrayToSort, i);
            System.out.println("\n");
        }
        printSortedArray("Sorted array: " + printArray(arrayToSort));
    }

    private void printSortedArray(String s) {
        System.out.println(s);
    }

    private void printUpdatedArray(int[] arrayToSort, int i) {
        System.out.println("Array at end of pass " + i + ": " + printArray(arrayToSort));
    }

    private void printPass(int i, int current, int next, int[] arrayToSort, boolean swap) {
        System.out.println("Pass " + i + ", move " + (current + 1) + ": " + printArray(arrayToSort) + " " + printSwap(swap, arrayToSort[next], arrayToSort[current]));
    }

    private String printSwap(boolean swap, int lhs, int rhs) {
        if (swap) {
            return lhs + " swapped with " + rhs;
        }
        return "no swap";
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
        String print = "                 ";
        for (int i = 0; i < index; i++) {
            print += "   ";
        }
        if (swap) print += "^--^";
        else print += "x--x";
        System.out.println(print);
    }
}
