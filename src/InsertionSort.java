import java.util.ArrayList;

public class InsertionSort {
    public static void main(int[] array) {
        System.out.print("InsertionSort\t");
        //Methods.printList(sort(array));
    }

    /*public static ArrayList<Integer> sort(int[] array) {
        ArrayList<Integer> integers= new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++){
            if(integers.size() == 0 || array[i] >= integers.get(integers.size())) {
                integers.add(array[i]);
            } if(integers.size() >= 1 && array[i] < integers.get(integers.size())) {

            }
        }

        return integers;
    }*/

    public static int[] sortArray(int[] array) {

        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length; j++){}
        }

        return array;
    }
}
