package util;

//배열을 다룰 때 도움이 될 메소드들을 모아둔 클래스

public class ArrayUtil {
    //1-A. 현재 배열의 길이를 리턴하는 size()
    public static int size(int[] arr) {
        return arr.length;
    }

    public static int size(double[] arr) {
        return arr.length;
    }

    public static int size(String[] arr) {
        return arr.length;
    }

    //1-B. 현재 배열이 아무것도 없으면 true, 있으면 false가 리턴되는 isEmpty()
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    public static boolean isEmpty(String[] arr) {
        return size(arr) == 0;
    }

    //1-C. 현재 배열의 특정 인덱스 값을 리턴하는 get()
    public static int get(int[] arr, int index) {
        return arr[index];
    }

    public static String get(String[] arr, int index) {
        return arr[index];
    }

    //1-D. 현재 배열에서 특정 값의 최초 인덱스를 찾는 indexof()
    //없으면 -1 리턴
    public static int indexOf(int[] arr, int element) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == element)
                return i;
        }
        return -1;
    }

    public static int indexOf(String[] arr, String element) {
        for (int i = 0; i < size(arr); i++) {
            if (element.equals(get(arr, i)))
                return i;
        }
        return -1;
    }

    //1-E 현재 배열에서 특정 값의 최후 인덱스를 찾는 lastIndexOf()
    //없으면 -1 리턴
    public static int lastIndexOf(int[] arr, int element) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i) == element)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(String[] arr, String element) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (element.equals(get(arr, i)))
                return i;
        }
        return -1;
    }

    //1-F 현재 배열에서 특정한 값이 존재하면 true, 없으면 false가 나오는 contains()
    public static boolean contains(int[] arr, int element) {
        return indexOf(arr, element) != -1;
    }

    public static boolean contains(String[] arr, String element) {
        return indexOf(arr, element) != -1;
    }

    //1-G 현재 배열 맨 마지막에 새로운 요소를 추가하는 add()
    public static int[] add(int[] arr, int element) {
        //arr보다 1 더 큰 새로운 배열을 만든다.
        int[] temp = new int[size(arr) + 1];
        //원본 배열인 array의 값들을 temp에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //마지막 요소를 temp에 저장
        temp[size(arr)] = element;
        return temp;
    }

    public static double[] add(double[] arr, double element) {
        double[] temp = new double[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = element;
        return temp;
    }

    public static String[] add(String[] arr, String element) {
        String[] temp = new String[size(arr) + 1];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        temp[size(arr)] = element;

        return temp;
    }

    //1-H 특정 인덱스에 새로운 값을 추가하는 add()
    public static int[] add(int[] arr, int index, int element) {
        if (index < 0 || index >= size(arr)) return arr;

        int[] temp = new int[0];
        for (int i = 0; i < size(arr); i++) {
            if (i == index)
                temp = add(temp, element);
            temp = add(temp, arr[i]);
        }
        return temp;
    }

    public static String[] add(String[] arr, String element, int index) {
        if (index < 0 || index >= size(arr)) return arr;

        String[] temp = new String[0];
        for (int i = 0; i < size(arr); i++) {
            if (i == index)
                temp = add(temp, element);
            temp = add(temp, get(arr, i));
        }
        return temp;
    }

    //1-I 특정 인덱스의 값을 다른 값으로 교체하고
    //원래 있던 값을 리턴하는 set()
    public static int set(int[] arr, int index, int element) {
        if (index >= size(arr) || index < 0)
            return -1;

        int temp = get(arr, index);
        arr[index] = element;
        return temp;
    }

    public static String set(String[] arr, int index, String element) {
        if (index >= size(arr) || index < 0) return element;

        String temp = get(arr, index);
        arr[index] = element;
        return temp;
    }

    //1-J 특정 인덱스를 삭제하는 remove()
    public static int[] remove(int[] arr, int index) {
        if (index < 0 || index >= size(arr)) return arr;

        int[] temp = new int[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index)
                temp = add(temp, get(arr, i));
        }
        return temp;
    }

    public static String[] remove(String[] arr, int index) {
        if (index < 0 || index >= size(arr)) return arr;

        String[] temp = new String[0];
        for (int i = 0; i < size(arr); i++) {
            if (i != index) {
                add(temp, arr[i]);
            }
        }

        return temp;
    }

    //1-K 해당 배열의 특정 엘리먼트를 삭제하는 removeElement()
    public static int[] removeElement(int[] arr, int element) {
        return remove(arr, indexOf(arr, element));
    }

    public static String[] removeElement(String[] arr, String element) {
        return remove(arr, indexOf(arr, element));
    }


    //내가 만든 메소드
    public static void copy(int[] arr1, int[] arr2) {
        arr1 = arr2.clone();
    }

    public static int[] copy(int[] arr1, int[] arr2, int start, int end) {
        for (int i = start; i < end; i++) {
            arr1[i] = arr2[i];
        }
        return arr1;
    }

    public static int[] copy(int[] arr1, int[] arr2, int arr1Start, int arr2Start, int arr2End) {
        int j = arr1Start;
        for (int i = arr2Start; i < arr2End; i++) {
            arr1[j++] = arr2[i];
        }
        return arr1;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < size(arr); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < size(arr) - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                i = -1;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = get(arr, index1);
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
