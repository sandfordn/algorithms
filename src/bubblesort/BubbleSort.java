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

    // start bubble sort
    private void sort(int[] arrayToSort) {

        output.printUnsortedArray(arrayToSort);
        // loop through all numbers in the range 0 to the length of the array:

            // loop through all numbers in the range 1 to the length of the array:

                // define current position:

                // define next position:

                boolean swap = false;
                // check if the last number in the array is greater than the current number:

                    // swap the two numbers:

                    swap = true;
                // end if:

                // output.printPass(i, current, next, arrayToSort, swap);
            // end for loop:

            //output.printUpdatedArray(arrayToSort, i);
        // end for loop:

        output.printSortedArray(arrayToSort);
    }
    // end bubble sort
}
