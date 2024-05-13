package day0508;

//동적 할당(Dynamic Allocation)
//현재까지 배운 배열의 최대 단점: 크기 고정
//이를 정적 할당이라 한다.
//자유로운 배열을 만들 경우
//해당 배열을 동적할당이 되는
//동적 할당 배열이라 한다.
//하지만, 진정한 동적 할당이 되기 위해서는
//우리가 직접 주소값을 컨트롤하여 이어붙이거나 없애야 하지만
//자바에서는 주소값을 직접 컨트롤할 순 없으므로
//유사 동적 할당을 한다.

import util.ArrayUtil;
import util.PrintUtil;

public class Ex05DynamicAlloc {
    public static void main(String[] args) {

        System.out.println("1. int[]");
        PrintUtil.printLineBreak();
        System.out.println("A. size()");
        int[] array = new int[4];
        System.out.println("ArrayUtil.size(array): " + ArrayUtil.size(array));

        PrintUtil.printLineBreak();
        System.out.println("B. isEmpty()");
        System.out.println("ArrayUtil.isEmpty(array): " + ArrayUtil.isEmpty(array));

        PrintUtil.printLineBreak();
        array[1] = 10;
        System.out.println("C. get()");
        System.out.println("ArrayUtil.get(array, 1): " + ArrayUtil.get(array, 1));

        PrintUtil.printLineBreak();
        array[0] = 5;
        array[2] = 20;
        array[3] = 20;
        System.out.println("D. indexOf()");
        System.out.println("ArrayUtil.indexOf(array, 20): " + ArrayUtil.indexOf(array, 20));
        System.out.println("ArrayUtil.indexOf(array, 15): " + ArrayUtil.indexOf(array, 15));

        PrintUtil.printLineBreak();
        System.out.println(("E. lastIndexOf()"));
        System.out.println("ArrayUtil.lastIndexOf(array, 20): " + ArrayUtil.lastIndexOf(array, 20));
        System.out.println("ArrayUtil.lastIndexOf(array, 15): " + ArrayUtil.lastIndexOf(array, 15));

        PrintUtil.printLineBreak();
        System.out.println(("F. contains()"));
        System.out.println("ArrayUtil.contains(array, 20): " + ArrayUtil.contains(array, 20));
        System.out.println("ArrayUtil.contains(array, 15): " + ArrayUtil.contains(array, 15));

        PrintUtil.printLineBreak();
        System.out.println(("G. add()"));
        System.out.println("추가 전 array 요소");
        ArrayUtil.print(array);
        array = ArrayUtil.add(array, 30);
        System.out.println("add(array, 30) 추가 후 array 요소");
        ArrayUtil.print(array);

        PrintUtil.printLineBreak();
        System.out.println("H. add()");
        System.out.println("추가 전 array 요소");
        ArrayUtil.print(array);
        array = ArrayUtil.add(array, 30, 2);
        System.out.println("add(array, 30, 2) 추가 후 array 요소");
        ArrayUtil.print(array);

        PrintUtil.printLineBreak();
        System.out.println("I. set()");
        System.out.println("변경 전 array 요소");
        ArrayUtil.print(array);
        System.out.println("변경하고 나온 return값: " + ArrayUtil.set(array, 7, 2));
        System.out.println("변경 후 array 요소");
        ArrayUtil.print(array);

        PrintUtil.printLineBreak();
        System.out.println("J. remove()");
        System.out.println("제거 전 array 요소");
        ArrayUtil.print(array);
        array = ArrayUtil.remove(array, 2);
        System.out.println("2번째 요소 제거 후 array 요소");
        ArrayUtil.print(array);

        PrintUtil.printLineBreak();
        System.out.println("K. removeElement()");
        System.out.println("제거 전 array 요소");
        ArrayUtil.print(array);
        array = ArrayUtil.removeElement(array, 20);
        System.out.println("20 제거 후 array 요소");
        ArrayUtil.print(array);

        PrintUtil.printLineBreak();
    }


}
