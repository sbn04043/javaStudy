package day0510;
//전역 변수(Global Variable)
//전역 변수란, 변수의 선언 위치가 클래스의 최상단에 이루어져서
//모든 메소드가 공통적으로 접근 가능한 변수를 전역 변수라 한다.
//전역 변수는 각 변수의 기본값으로 초기화 된다.

//전역 변수의 장단점: 모든 메소드가 사용 가능하다.
//따라서 전역 변수의 사용을 비추천한다.
//정확하게 값을 트래킹하기 어렵게 때문이다.

//전역 상수는?
//상수는 값이 정해지면 변경이 안 되므로
//다른 메소드에서도 변경이 안 된다.
//따라서, 여러 메소드가 공통으로 사용할 상수일 경우,
//전역 상수를 사용한다.
//전역 상수는 초기화를 꼭 해야 한다.

public class Ex02Global {
    public static int number;
    public static final int NUMBER = 10;

    public static void main(String[] args) {
        number = 20;
        System.out.println("number = " + number);
        increase();
        System.out.println("increase() 후 number = " + number);

    }

    public static void increase() {
        number++;
    }
}
