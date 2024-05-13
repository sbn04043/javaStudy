package day0502;

import java.util.Scanner;

//사용자로부터 점수를 입력 받아서
//90점 이상: A
//80점 이상: B
//70점 이상: C
//60점 이상: D
//60점 미만: F
//가 출력되는 프로그램 작성
public class Ex03LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
