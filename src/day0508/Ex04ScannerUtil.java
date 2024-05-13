package day0508;

import util.ScannerUtil;

import java.util.Scanner;

//우리가 입력할 때 도움을 줄
//ScannerUtil을 체험해보는 클래스
public class Ex04ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ScannerUtil안 쓸 경우
        //사용자로부터 3개의 숫자 입력 받기
        /*
        System.out.println("숫자를 입력해주세요: ");
        System.out.print("> ");
        int num = scanner.nextInt();
        System.out.println("숫자를 입력해주세요: ");
        System.out.print("> ");
        num = scanner.nextInt();
        System.out.println("숫자를 입력해주세요: ");
        System.out.print("> ");
        num = scanner.nextInt();

        //ScannerUtil을 쓸 경우
        //외부 패키지의 클래스를 호출하려면 import 해줘야 한다.
        ScannerUtil.printMessage("ScannerUtil을 체험해보자.");
        num = ScannerUtil.nextInt(scanner, "숫자를 입력해주세요");
        num = ScannerUtil.nextInt(scanner, "숫자를 입력해주세요");
        num = ScannerUtil.nextInt(scanner, "숫자를 입력해주세요");
        */
        int number = ScannerUtil.nextInt(scanner, "0~10의 숫자를 입력해주세요", 0, 10);
    }
}
