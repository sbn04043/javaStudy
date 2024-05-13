package day0502;
//값 검증하기
//사용자가 입력한 값이 언제나 우리의 의도대로
//올바른 값만 들어오지 않기 떄문에
//입력된 값에 대한 검증을 필요로 한다.

import java.util.Scanner;

public class Ex04Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        int score = scanner.nextInt();
        System.out.println("=====================================");
        System.out.println("검증을 안 할 경우");

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
        System.out.println("=====================================");

        //값 검증을 하는 첫번째 방법
        //조건식을 정확히 잡기
        //조건이 연속적이지 않을 때 효율적
        System.out.println("첫번째 방법으로 검증을 할 경우");
        if (score >= 90 && score <= 100)
            System.out.println("A");
        else if (score >= 80 && score < 90)
            System.out.println("B");
        else if (score >= 70 && score < 80)
            System.out.println("C");
        else if (score >= 60 && score < 70)
            System.out.println("D");
        else if (score >= 0 && score < 60)
            System.out.println("F");
        else
            System.out.println("올바른 점수가 아닙니다.");
        System.out.println("=====================================");

        //두번째 방법
        //입력된 값이 올바른지 체크하고
        //올바를 때만 코드를 진행시키는 방법
        //범위가 연속적일 경우 효율적
        System.out.print("입력값 검증하기: ");
        if (score <= 100 && score >= 0) {
            System.out.println("올바른 값입니다.");
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
        } else {
            System.out.println("올바른 값이 아닙니다.");
        }
        System.out.println("=====================================");

    }


}
