import java.util.ArrayList;
import java.util.Arrays;

public class Methods { //necessary for (Type)Sort methods
    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void returnCount(int count) {
        System.out.print("Count (" + count + ") ");
    }

    public static void printList(ArrayList<Integer> array) {
        System.out.print("[");
        for (int i = 0; i < array.size(); i++)
        {
            if(array.size() > i) {
                System.out.print(array.get(i));
                System.out.print(", ");
            }
            if(array.size() == i) {
                System.out.print(array.get(i));
            }

        }
    }
}
