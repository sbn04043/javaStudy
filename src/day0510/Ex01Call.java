package day0510;

import util.PrintUtil;

public class Ex01Call {
    public static void main(String[] args) {
        PrintUtil.printLineBreak();
        System.out.println("Call By Value");
        int a = 10;
        System.out.println("메인 a: " + a);
        callValue(a);
        System.out.println("메인 callValue 함수를 쓴 a: " + a);

        PrintUtil.printLineBreak();
        int[] arr = new int[10];
        arr[0] = 5;
        System.out.println("메인 arr[0]: " + arr[0]);
        callRef(arr);
        System.out.println("callRef 후 메인 arr[0]: " + arr[0]);
        alloc(arr);
        System.out.println("alloc 후 메인 arr[0]: " + arr[0]);

        PrintUtil.printLineBreak();
    }

    public static void callValue(int value) {
        value++;
        System.out.println("callValue 내부 value: " + value);
    }

    public static void callRef(int[] arr) {
        arr[0] = 20;
        System.out.println("callRef 내부 arr[0]: " + arr[0]);
    }

    public static void alloc(int[] arr) {
        arr = new int[5];
        arr[0] = 30;
        System.out.println("alloc 내부 arr[0]: " + arr[0]);
    }
}
