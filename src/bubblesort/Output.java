package bubblesort;

public class Output {

    public void printUnsortedArray(int[] arrayToSort) {
        System.out.println("Sorting array: " + printArray(arrayToSort) + '\n');
    }

    public void printSortedArray(int[] arrayToSort) {
        System.out.println("Sorted array: " + printArray(arrayToSort));
    }

    public void printUpdatedArray(int[] arrayToSort, int i) {
        System.out.println("Array at end of pass " + i + ": " + printArray(arrayToSort) + "\n\n");
    }

    public void printPass(int i, int current, int next, int[] arrayToSort, boolean swap) {
        System.out.println("Pass " + i + ", move " + (current + 1) + ": " + printArray(arrayToSort) + " " + printSwap(swap, arrayToSort[next], arrayToSort[current]));
        printIndicator(current, swap);
    }

    public String printSwap(boolean swap, int lhs, int rhs) {
        if (swap) {
            return lhs + " swapped with " + rhs;
        }
        return "no swap";
    }

    public String printArray(int[] arrayToPrint) {
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

    public void printIndicator(int index, boolean swap) {
        String print = "                 ";
        for (int i = 0; i < index; i++) {
            print += "   ";
        }
        if (swap) print += "^--^";
        else print += "x--x";
        System.out.println(print);
    }
}
