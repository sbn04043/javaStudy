package day0513;

//학생 5명을 관리하는 프로그램 작성(정적할당 배열 사용)
//단, 학생 정보를 수정/삭제할 필요 없이
//5명까지만 입력 가능하고 출력은 입력된 학생들로만 출력되는 프로그램

import types.Student;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex04GradeBook {
    static int idIndex = 0;
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[5];

        while (true) {
            String message = "1.입력 2.출력 3.종료";
            int choice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

            if (choice == 1) {
                if (idIndex > 4) {
                    System.out.println("더이상 학생을 입력할 수 없습니다.");
                    continue;
                }
                students[idIndex].id = idIndex + 1;
                message = "학생의 이름을 입력하세요";
                students[idIndex].name = ScannerUtil.nextLine(SCANNER, message);
                message = "학생의 국어점수를 입력하세요";
                students[idIndex].korean = ScannerUtil.nextInt(SCANNER, message, 0, 100);
                message = "학생의 영어점수를 입력하세요";
                students[idIndex].english = ScannerUtil.nextInt(SCANNER, message, 0, 100);
                message = "학생의 수학점수를 입력하세요";
                students[idIndex++].math = ScannerUtil.nextInt(SCANNER, message, 0, 100);

            } else if (choice == 2) {
                if (idIndex == 0) {
                    System.out.println("입력된 학생이 없습니다.");
                    continue;
                }
                for (int i = 0; i < idIndex; i++) {
                    students[i].printInfo();
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
