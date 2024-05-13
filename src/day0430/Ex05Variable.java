package day0430;
//변수(Variable)
//변수란, 우리가 값을 여러번 덮어씌울 수 있는 공간을 변수라 한다.
//변수를 사용하기 위해서는 선언과 초기화가 필요하다.
//변수의 선언방법: 데이터타입 변수이름;
//변수의 초기화 방법: 변수이름 = 값;

public class Ex05Variable {
    public static void main(String[] args) {
        //int 타입의 변수 myNumber을 선언
        int myNumber;
        //myNumber는 현재 선언만 된 상태이므로
        //초기화를 하기 전까지는 사용할 수 없다.

        //myNumber 현재값 출력: 초기화하지 않아서 error
        //System.out.println(myNumber);

        //myNumber 초기화 (초기화, 할당, 저장 모두 같은 의미)
        myNumber = 5;
        //myNumber값 출력
        System.out.println(myNumber);

        //myNumber에 10 할당
        myNumber = 10;
        System.out.println(myNumber);
    }
}
