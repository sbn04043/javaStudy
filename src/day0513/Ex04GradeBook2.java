package day0513;

import types.Student;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex04GradeBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //학생 정보 입력 받을 Student 배열
        Student[] students = new Student[5];
        //다음 입력 index 저장한 nextIndex
        int nextIndex = 0;

        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int choice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (choice == 1) {
                if (nextIndex < 5) {
                    message = "학생의 번호를 입력해주세요";
                    int id = ScannerUtil.nextInt(scanner, message);
                    message = "학생의 이름을 입력해주세요";
                    String name = ScannerUtil.nextLine(scanner, message);
                    message = "학생의 국어 점수를 입력해주세요";
                    int koreanScore = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 영어 점수를 입력해주세요";
                    int englishScore = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 수학 점수를 입력해주세요";
                    int mathScore = ScannerUtil.nextInt(scanner, message, 0, 100);

                    students[nextIndex++] = new Student(id, name, koreanScore, englishScore, mathScore);
                } else {
                    System.out.println("더이상 입력하실 수 없습니다.");
                }
            } else if (choice == 2) {
                if (nextIndex == 0) {
                    System.out.println("입력한 학생이 없습니다.");
                } else {
                    for (int i = 0; i < nextIndex; i++) {
                        students[i].printInfo();
                    }
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }


    }
}
