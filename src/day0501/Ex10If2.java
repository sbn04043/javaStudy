package day0501;

import java.util.Scanner;

//사용자로부터 숫자를 입력받아서
//0보다 크면 자연수입니다. 가 출력되는 프로그램 작성
public class Ex10If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        if (num > 0) System.out.println("자연수입니다.");
    }

}
