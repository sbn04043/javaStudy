package day0501;

//1. 사용자로부터 숫자를 입력받아서
//양의 정수이면 "양의 정수입니다"가 출력되는
//코드를 작성하시오

//2. 사용자로부터 나이를 입력받아서
//미성년자일 경우 "미성년자입니다"가 출력되는
//코드를 작성하시오.

//3. 사용자로부터 국어 영어 수학 점수를 입력받아서
//평균이 60점 이상이고 모든 과목이 50점 초과일 때
//"합격입니다."가 출력되는 코드를 작성하시오.

//4. 사용자로부터 아이디와 비밀번호를 입력받아서
//아이디가 "admin", 비밀번호가 "!Q@W#e4r"일 경우
//"로그인 성공"이 출력되는 코드를 작성하시오

//5. 사용자가 숫자를 입력했을 때
//0~100 사이의 숫자가 입력됐을 경우
//"올바른 시험 점수입니다"가 출력되는 코드를 작성하시오

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        final int SUBJECT_SIZE = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.printf("1. 숫자를 입력하세요: ");
        int num = scanner.nextInt();
        if (num > 0) System.out.println("양의 정수입니다.");
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.printf("1. 나이를 입력하세요: ");
        int age = scanner.nextInt();
        if (age < 20) System.out.println("미성년자입니다.");
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.printf("3. 국어 점수를 입력하세요: ");
        int korean = scanner.nextInt();
        System.out.printf("영어 점수를 입력하세요: ");
        int english = scanner.nextInt();
        System.out.printf("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();
        int sum = korean + english + math;
        int average = sum / SUBJECT_SIZE;
        if (average >= 60 && korean > 50 && math > 50 && english > 50)
            System.out.println("합격입니다.");
        System.out.println("=========================================");

        System.out.println("=========================================");
        scanner.nextLine();
        System.out.printf("4. ID를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.printf("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        if (id.equals("admin") && password.equals("!Q@W3e4r"))
            System.out.println("로그인 성공");
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.print("5. 점수를 입력하세요: ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) System.out.println("올바른 점수입니다.");
        System.out.println("=========================================");
    }

}
