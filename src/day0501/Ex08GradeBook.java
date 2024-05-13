package day0501;

import java.util.Scanner;

//1. 번호 입력 받기
//2. 이름 입력 받기
//3. 국어점수 입력 받기
//4. 영어점수 입력 받기
//5. 수학점수 입력받기
//6. 3 점수 합 구하기
//7. 3 점수 평균 구하기
//8. 이름, 나이 출력하기
//9. 국영수 점수 출력하기
//10. 점수 합, 평균 출력하기.

public class Ex08GradeBook {
    public static void main(String[] args) {
        final int SUBJECT_SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        String name;
        int num;
        int korean, english, math;

        System.out.print("Enter your number: ");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your korean score: ");
        korean = scanner.nextInt();
        System.out.print("Enter your english score: ");
        english = scanner.nextInt();
        System.out.print("Enter your math score: ");
        math = scanner.nextInt();

        int sum = korean + english + math;
        double average = (double)sum / SUBJECT_SIZE;

        System.out.printf("번호: %2d 이름: %s\n", num, name);
        System.out.printf("국어: %03d 영어: %03d 수학: %03d\n", korean, english, math);
        System.out.printf("총점: %03d 평균: %06.2f", sum, average);
    }
}
