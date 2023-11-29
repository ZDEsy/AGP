package SortTypes;

public class InsertSort {
    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; i++) {
            int actI = i;
            for (int index = i-1; actI - index <= 1 && index != -1; index--) {
                if(array[index] > array[actI]) {
                    int term = array[index];
                    array[index] = array[actI];
                    array[actI] = term;
                    actI = index;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 4, 3};
        insertSort(a);
        for (int num : a) {
            System.out.println(num + " ");
        }
    }
}
