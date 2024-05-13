package day0502;
//while 반복문
//조건식이 true가 나오면
//코드를 실행시키고 다시 조건식을 확인한다.

//while문의 구조
//while(조건식) {
//  조건식이 true면 실행시킬 코드
//}

import java.util.Scanner;

//반복문을 사용할 때
//코드가 반복적으로 실행해야 하는 경우
//특정 규칙에 따라 코드를 반복시켜야 하는 경우
public class Ex08While {
    public static void main(String[] args) {
        int i = 1;
        //1~10까지 출력하는 코드
        //System.out.println(i+"입니다.");// 10줄 쓰기
        //반복문은 간단하게 됨.
        while (i <= 10) {
            System.out.println(i++ + "입니다.");
        }
        //while문은 지정된 횟수 반복보다는
        //특정 조건을 만족할 때까지 반복시키는 목적으로 사용

        //사용자가 3 입력까지 계속 입력 받는 코드
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("숫자를 입력하세요: ");
        num = scanner.nextInt();
        while (num != 3) {
            System.out.println("3이 아닙니다.");
            System.out.print("숫자를 입력하세요: ");
            num = scanner.nextInt();
        }
        System.out.println("3을 입력했습니다.");


    }
}
