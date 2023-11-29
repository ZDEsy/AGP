package SortTypes;

public class SelectSort {
    public static void selectSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int index = i; index < array.length - 1; index++) {
                if (array[minIndex] > array[index + 1]) {
                    minIndex = index + 1;
                }
            }
            int term = array[minIndex];
            array[minIndex] = array[i];
            array[i] = term;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 4, 3};
        selectSort(a);
        for (int num : a) {
            System.out.println(num + " ");
        }
    }
}
