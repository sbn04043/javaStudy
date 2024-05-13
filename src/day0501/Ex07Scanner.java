package day0501;
//import는
// 패키지.패키지.클래스이름
// 의 형식으로 이뤄진다.

//스캐너 클래스 수입

import java.util.Scanner;

//Scanner
//자바에서 각종 입력(키보드, 파일, 데이터 스트림)
//을 처리할 때 쓰이는 클래스
//우리가 키보드 입력을 받기 위해서는
//스캐너를 우리 클래스로 '수입'해야한다.
//기본형 데이터타입들과 그 데이터타입들을 클래스화 시킨
//"포장 클래스" 외의 모든 클래스는 사용할 때 반드시 "수입"을 해야한다.
public class Ex07Scanner {
    public static void main(String[] args) {
        //Scanner 클래스 변수의 선언과 초기화
        //System.in은 키보드 입력을 받을 것임을 지정하는 것
        Scanner scanner = new Scanner(System.in);

        //1. 정수 입력 받기
        //우리가 키보드로부터 정수를 입력받을 때는
        //Scanner 클래스 변수에서 nextInt()를 실행시키면 된다.
        System.out.print("정수를 입력해주세요: ");
        int num = scanner.nextInt();

        //실수를 입력받을 때는 nextDouble() 사용
        System.out.print("실수를 입력해주세요: ");
        double d = scanner.nextDouble();

        //문자열을 입력받을 때는 nextLine() 사용
        //단 ,nextInt(), nextDouble() 등 숫자를 입력한 후에는
        //반드시 nextLine()을 두번 적어야 정상적으로 작동한다.
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("사용자가 입력한 정수: " + num);
        System.out.println("사용자가 입력한 실수: " + d);
        System.out.println("사용자가 입력한 문자열: " + name);

    }
}
