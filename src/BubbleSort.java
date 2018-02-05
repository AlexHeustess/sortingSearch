public class BubbleSort {
    public static void main(int[] array) {

        System.out.print("BubbleSort\t");
        Methods.print(sort(array));
        System.out.print("BubbleSort.2\t");
        Methods.print(sortTwo(array));
    }

    public static int[] sort(int[] array) { //recursion
        int temp, count = 0;

            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count ++; //for counting #of times switches are made. Not fully implemented
                }
        }
        Methods.returnCount(count);
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]) sort(array);
        }
        return array;
    }

    public static int[] sortTwo(int[] array) { //nested loop
        int temp, count = 0;

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; i < array.length - 1 - i; i++) {
                if(array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    //count++; //for counting #of times switches are made
                }
            }
            //returnCount(count);//currently, not working
        }
        return array;
    }
}
