public class SelectionSort {
    public static void main(int[] array) {
        System.out.print("SelectionSort\t");
        Methods.print(sort(array));
    }

    public static int[] sort(int[] array) {
        int temp, count = 0, lowestIndex = 0;

        for(int i = 1; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[lowestIndex] > array[j]) {
                    lowestIndex = j;

                }
            }
            //count++; //not currently working
            temp = array[0];
            array[0] = array[lowestIndex];
            array[lowestIndex] = temp;
        }
        //Methods.returnCount(count);
        return array;
    }

}
