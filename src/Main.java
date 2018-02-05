import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        fillArray(array);
        System.out.println("Basic\t" + Arrays.toString(array));
        BubbleSort.main(array); //possibly change to void methods to see process for all of below
        SelectionSort.main(array);
        InsertionSort.main(array);
    }

    public static int[] fillArray(int[] array) {
        Random r = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        return array;
    }
}
