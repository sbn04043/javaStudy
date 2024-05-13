package day0507;

import java.util.Scanner;

public class Ex03GradeBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //학생 정보 배열
        int LENGTH = 5;
        int[] idArray = new int[LENGTH];
        String[] nameArray = new String[LENGTH];
        int[] koreanArray = new int[LENGTH];
        int[] englishArray = new int[LENGTH];
        int[] mathArray = new int[LENGTH];

        //인덱스 저장 변수
        int idx = 0;
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                //입력 코드 구현
                if (idx < LENGTH) {
                    //학생 입력 가능
                    System.out.printf("%d번째 학생 정보 입력\n", idx + 1);
                    System.out.print("번호: ");
                    idArray[idx] = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("이름: ");
                    nameArray[idx] = scanner.nextLine();

                    System.out.print("국어 성적: ");
                    koreanArray[idx] = scanner.nextInt();

                    System.out.print("영어 성적: ");
                    englishArray[idx] = scanner.nextInt();

                    System.out.print("수학 성적: ");
                    mathArray[idx] = scanner.nextInt();

                    idx++;
                } else {
                    System.out.println("더 이상 학생을 입력할 수 없습니다.");
                }
            } else if (choice == 2) {
                //출력 코드 구현
                if (idx == 0) {
                    System.out.println("입력된 정보가 없습니다.");
                } else {
                    for (int i = 0; i < idx; i++) {
                        System.out.printf("%d. %s\n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %3d 영어: %3d 수학: %3d\n", koreanArray[i], englishArray[i], mathArray[i]);
                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        double average = sum / 3.0;
                        System.out.printf("총합: %3d 평균: %6.2f\n", sum, average);
                    }
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("정확한 숫자를 입력해주세요. ");
            }

        }
    }
}
