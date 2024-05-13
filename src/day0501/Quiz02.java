package day0501;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        //배운 것을 토대로 직접 해보자.
        //결과물
        //이름: ### 나이: 0##세
        //국어: 0##점 영어: 0##점 수학:0##점
        //총점: 0##점 평균: 0##.##점
        // + Scanner를 사용해 입력받아 출력해보자.

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String scoreStr;
        String[] scores;
        int korean, english, math;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your each 3 scores divided by ' ': ");

        scanner.nextLine();
        scoreStr = scanner.nextLine();
        scores = scoreStr.split(" ");
        korean = Integer.parseInt(scores[0]);
        english = Integer.parseInt(scores[1]);
        math = Integer.parseInt(scores[2]);
//        System.out.print("Enter your korean score: ");
//        korean = scanner.nextInt();
//        System.out.print("Enter your english score: ");
//        english = scanner.nextInt();
//        System.out.print("Enter your math score: ");
//        math = scanner.nextInt();

        int sum = korean + english + math;
        double average = sum / 3.0;

        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

    }
}
