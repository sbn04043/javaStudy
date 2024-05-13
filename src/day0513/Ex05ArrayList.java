package day0513;

//ArrayList
//자바가 기본적으로 제공하는 동적할당 배열

//ArrayList는 우리가 반드시
//어떤 것의 모음인지를 적어야 한다.
//다음과 같이 선언한다.
//ArrayList<타입> 이름 = new ArrayList<>();

//주의할 점: 타입에는 클래스만 들어간다.
//기본형 데이터 타입은 못 들어간다.
//자바가 제공하는 기본형 데이터타입을 클래스화시킨
//포장 클래스(Wrapper Class)를 넣을 수 있다.

//int -> Integer
//double -> Double
//char -> String

import java.util.ArrayList;

public class Ex05ArrayList {
    public static void main(String[] args) {
        //int(Integer) ArrayList 선언
        ArrayList<Integer> intList = new ArrayList<>();

        //list의 크기: size()
        System.out.println("1. intList.size(): " + intList.size());

        //비어있는지 체크: isEmpty()
        System.out.println("2. intList.isEmpty(): " + intList.isEmpty());

        //새로운 요소 추가: add(element)
        Integer i = 4;
        intList.add(i);

        //현재 어레이의 특정 인덱스 저장된 값 불러오기: get(index)
        System.out.println("4. list.get(0): " + intList.get(0));

        //특정 인덱스에 새로운 값을 넣을 때: add(index, element)
        intList.add(0, 7);
        System.out.println("5. intList.add(0, 7) 후 get(0): " + intList.get(0));

        //가장 먼저 등장하는 값의 인덱스값 추출: indexOf(element)
        System.out.println("6. intList.indexOf(7): " + intList.indexOf(7));
        System.out.println("   intList.indexOf(10): " + intList.indexOf(10));

        //가장 늦게 등장하는 값의 인덱스값 추출: lastIndexOf(element)
        intList.add(7);
        System.out.println("7. add(7) 이후 intList.lastIndexOf(7): " + intList.lastIndexOf(7));

        //특정값이 존재하는지: contains(element)
        System.out.println("8. intList.contains(4): " + intList.contains(4));
        System.out.println("   intList.contains(10): " + intList.contains(10));

        //특정 인덱스의 값을 교체: set(index, element)
        intList.set(0, 10);
        System.out.println("9. intList.set(0, 10) 한 후 get(0): " + intList.get(0));

        //특정 인덱스의 값 삭제: remove(index)
        intList.remove(0);
        System.out.println("10. intList.remove(0) 한 후 contains(10): " + intList.contains(10));

        //특정 값 찾아 삭제: remove(element)
        //이 때, element는 Interger 클래스의 객체여야 한다.
        Integer i2 = 4;
        intList.remove(i2);
        System.out.println("remove(4) 후 intList.indexOf(4): " + intList.indexOf(4));

        //우리가 만든 클래스를 모아둔 어레이리스트의 경우
        //반드시 우리 클래스 안에 equals()가 오버라이드 돼야 정상적으로
        //indexOf(), lastIndexOf(), contains(), remove(element)가
        //잘 작동된다.

        //오버라이드(override)
        //자식 클래스가 부모 클래스로부터 상속받은 메소드를
        //자신에게 맞게 재정의하는 것을 뜻한다.
        //직접적으로 상속을 하지 않더라도
        //자바의 모든 클래스들은
        //Object라는 클래스를 상속 받는데
        //해당 Object 클래스의 equals() 메소드는
        //어레이리스트를 사용하기 위해
        //반드시 재정의해야하는 메소드다.

        //intList.equals

    }
}
