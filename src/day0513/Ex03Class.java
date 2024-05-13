package day0513;

//클래스
//2세대 언어까지는 프로그램을 기능의 집합으로 보았다.
//그렇기 때문에 라이브러리 같은 파일들을 만들어
//기능을 따로 관리하고
//struct를 만들어서 데이터를 따로 관리했다.
//하지만 객체지향적 관점이 시작되면서
//왜 따로 관리해야 되는가에 대해 고민하고
//클래스가 나오기 됐다.

//객체 지향 관점에서는 프로그램을 더 작은 프로그램들의 집합으로 봤고
//하나하나의 작은 프로그램들을 우리가 필요로 할 때
//변수로 만들어 사용하게 된다.

//클래스는 다음과 같은 항목으로 이뤄진다.
//클래스 변수가 관리 할 더 작은 데이터 종류(필드)
//해당 클래스 변수가 실행 가능한 메소드들

//static
//static 키워드는 해당 클래스의 필드 혹은 메소드를
//클래스 변수 선언과 초기화 없이 직접 사용을 가능하게 만드는 키워드
//하지만, 해당 방법은 클래스 변수 선언을 하지 않게 하므로
//객체지향에 반하는 행위다.
//따라서 앞으로는, 우리가 static 키워드를 사용하는 것을
//최소화한다.
//특히, static 메소드는 메인 메소드, ScannerUtil 외에는 사용하지 않는다.

import types.Student;

public class Ex03Class {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "김철수";
        s1.korean = 80;
        s1.english = 81;
        s1.math = 81;

        s1.printInfo();

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "이영희";
        s2.korean = 90;
        s2.english = 90;
        s2.math = 91;

        s2.printInfo();
    }

}
