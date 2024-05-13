package day0502;

import java.util.Scanner;

//사용자로부터 키 몸무게를 입력받아
//저체중 정상체중 과체중 비만을 출력하는 프로그램을 작성하시오
//BMI 공식: 몸무게 / 키 / 키
//BMI에 따른 비만도
//18.5 미만: 저체중
//18.5~23: 정상체중
//23~25: 과체중
//25 이상: 비만

//단, 기네스북에 따르면 제일 큰 사람은 2.72m
//무거웠던 사람은 565kg다.
//사용자가 잘못된 값을 입력할 경우
//프로그램이 종료되도록 코드 작성
public class Ex05Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("키를 입력하세요(m): ");
//        double height = scanner.nextDouble();
//        if (height > 2.72) {
//            System.out.println("잘못된 값이 입력돼 프로그램을 종료합니다.");
//            return;
//        }
//        System.out.print("몸무게를 입력하세요(kg): ");
//        double weight = scanner.nextDouble();
//        if (weight > 565) {
//            System.out.println("잘못된 값이 입력돼 프로그램을 종료합니다.");
//            return;
//        }
//
//        double bmi = weight / height / height;
//
//        if (bmi < 18.5) System.out.println("저체중");
//        else if (bmi >= 18.5 && bmi < 23) System.out.println("정상체중");
//        else if (bmi >= 23 && bmi < 25) System.out.println("과체중");
//        else System.out.println("비만");

        System.out.print("키를 입력하세요: ");
        double height = scanner.nextDouble();
        if (height < 2.72 && height > 0) {
            System.out.print("몸무게를 입력하세요: ");
            double weight = scanner.nextDouble();
            if (weight < 565 && weight > 0) {
                double bmi = weight / height / height;

                if (bmi < 18.5) System.out.println("저체중");
                else if (bmi < 23) System.out.println("정상체중");
                else if (bmi < 25) System.out.println("과체중");
                else System.out.println("비만");
            } else {
                System.out.println("프로그램을 종료합니다.");
            }
        } else {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
