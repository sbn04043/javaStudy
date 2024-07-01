package algorithm.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 20, 40, 17, 573, 28, 58, 684, 28, 5};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            printArr(arr);
            arr[j + 1] = key;
        }
    }

    static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
