package day0507;
//학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입려받아
//예쁘게 출력하는 프로그램을 작성하시오.
//한번에 입력받지 않고
//메뉴를 만들어서
//입력메뉴를 통해 들어갔을 때
//한명의 정보만 입력을 하되, 5명의 정보를 모두 입력했을 경우
//더이상 입력이 안 되게 만들고
//출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오.

//심화: 만약 5명 모두 입력했을 경우, 새로운 입력 시,
//가장 먼저 입력된 정보를 없애고 현재 정보가 들어갈 수 있도록 코드를 작성하시오.

import java.util.Scanner;

public class Ex03GradeBook {
    public static void main(String[] args) {
        final int LENGTH = 5;
        Scanner scanner = new Scanner(System.in);
        int[] studentNumbers = new int[LENGTH];
        String[] studentNames = new String[LENGTH];
        int[] koreanScores = new int[LENGTH];
        int[] englishScores = new int[LENGTH];
        int[] mathScores = new int[LENGTH];
        int num = 0;
        int index = 1;



        while (num != 3) {
            System.out.println("1. 학생 정보 입력 2. 학생 정보 출력 3. 종료");
            System.out.print("> ");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.printf("%d번째 학생 정보 입력\n", index);
                    System.out.print("번호: ");
                    studentNumbers[index % LENGTH] = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("이름: ");
                    studentNames[index % LENGTH] = scanner.nextLine();
                    System.out.print("국어 성적: ");
                    koreanScores[index % LENGTH] = scanner.nextInt();
                    System.out.print("영어 성적: ");
                    englishScores[index % LENGTH] = scanner.nextInt();
                    System.out.print("수학 성적: ");
                    mathScores[index % LENGTH] = scanner.nextInt();
                    index++;
                    break;
                case 2:
                    int i = 1;
                    if (index > 6) i = index - LENGTH;
                    for (; i < index; i++) {
                        System.out.printf("%d번째 학생\n", i);
                        System.out.printf("%d. %s\n", studentNumbers[i % LENGTH], studentNames[i % LENGTH]);
                        System.out.printf("국어: %d 영어: %d 수학: %d\n", koreanScores[i % LENGTH], englishScores[i % LENGTH], mathScores[i % LENGTH]);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("숫자를 제대로 입력하세요");
                    break;
            }
        }
    }
}
