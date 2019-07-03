package quicksort;

public class Output {

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
}
