package day0502;
//if - else if 구조
//만약 한가지 조건식을 체크하고 나서
//해당 조건식이 false일 때 다른 조건식을
//체크할 경우에는 else if를 사용한다.
//if - else 구조와 마찬가지로
//실제로 실행되는 코드 블락은 조건식을 만족하는
//한개의 코드블락만 실행이 된다.

//if - else if 구조는 다음과 같다.
//if (조건식1) {
//  조건식 1이 true일 때 실행
//} else if (조건식2) {
//  조건식 2가 true일 때 실행
//} else if (조건식 3)
//....
//else {
//  위 조건이 모두 false일 때 실행되는 코드
//}

import java.util.Scanner;

public class Ex02ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이: ");
        int age = scanner.nextInt();

        if (age < 8) {
            System.out.println("유치원");
        } else if (age < 14) {
            System.out.println("초등학생");
        } else if (age < 17) {
            System.out.println("중학생");
        } else if (age < 20) {
            System.out.println("고등학생");
        } else if (age < 26) {
            System.out.println("대학생");
        } else {
            System.out.println("성인");
        }
    }
}
