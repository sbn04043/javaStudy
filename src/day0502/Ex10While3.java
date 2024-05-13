package day0502;

import java.util.Scanner;

//사용자로부터 키와 몸무게를 입력받아
//비만도를 출력하는 프로그램
//사용자가 잘못된 값을 입력하면
//올바른 값 입력 할 때까지 입력받기
public class Ex10While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력 받을 때, 사용자로부터 어떤 값을 입력해야하는지를
        //알려주는 String 변수
        String message;

        //사용자가 입력한 값을 임시로 보관할
        //double 변수 temp
        double temp;

        //키 입력 받기
        message = "키를 m단위로 입력해주세요.";
        System.out.println(message);
        System.out.print("> ");
        temp = scanner.nextDouble();

        //잘못된 입력인지 체크
        while (temp <= 0 || temp > 2.72) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double height = temp;

        message = "몸무게를 kg단위로 입력해주세요";
        System.out.println(message);
        System.out.print("< ");
        temp = scanner.nextDouble();

        while (temp <= 0 || temp > 565) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double weight = temp;
        double bmi = height / weight / weight;

        if (bmi < 18.5) System.out.println("저체중입니다.");
        else if (bmi < 23) System.out.println("정상체중입니다.");
        else if (bmi < 25) System.out.println("과제충입니다.");
        else System.out.println("비만입니다.");

//        System.out.print("키를 입력하세요: ");
//        double height = scanner.nextInt();
//        while (height > 2.72 || height <= 0) {
//            System.out.print("올바른 키를 입력하세요: ");
//            height = scanner.nextInt();
//        }
//
//        System.out.print("몸무게를 입력하세요: ");
//        double weight = scanner.nextInt();
//        while (weight > 565 || weight <= 0) {
//            System.out.print("올바른 몸무게를 입력하세요: ");
//            weight = scanner.nextInt();
//        }
//
//        double bmi = height / weight / weight;
//        if (bmi < 18.5) System.out.println("저체중입니다.");
//        else if (bmi < 23) System.out.println("정상체중입니다.");
//        else if (bmi < 25) System.out.println("과제충입니다.");
//        else System.out.println("비만입니다.");


    }
}
