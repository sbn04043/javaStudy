package day0509;

public class ex {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        changeNum(arr, 1, 100);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void changeNum(int[] arr, int index, int val) {
        arr[index] = val;
    }
}
