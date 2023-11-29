package SortTypes;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int index = 0; index < i - 1; index++) {
                if(array[index] > array[index + 1]){
                    int term = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = term;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 4, 3};
        bubbleSort(a);
        for (int num : a) {
            System.out.println(num + " ");
        }
    }
}
