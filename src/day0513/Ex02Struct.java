package day0513;

//구조체
//여러가지 데이터타입을 합쳐서 한가지의 데이터타입으로 묶는
//특수한 자료형
//C, C++에서만 사용 가능하고 자바에서는 불가능
//하지만 자바에서는 유사한 것을 만들 수 있다.

import types.Student;

public class Ex02Struct {
    public static void main(String[] args) {
        //Student 변수 선언
        Student kim = new Student();

        //Student kim 안에 값 저장
        //변수이름.종류 = 값; 으로 저장
        kim.id = 1;
        kim.name = "김철수";
        kim.korean = 80;
        kim.english = 81;
        kim.math = 83;

        //저장된 값을 불러오기
        System.out.printf("번호: %2d. 이름: %s\n", kim.id, kim.name);
        System.out.printf("국어: %3d 영어: %3d 수학: %3d\n", kim.korean, kim.english, kim.math);

        Student lee = new Student();
        lee.id = 2;
        lee.name = "이영희";
        lee.korean = 90;
        lee.english = 91;
        lee.math = 93;
    }
}
