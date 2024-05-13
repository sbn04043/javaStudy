package day0513;

import types.Student;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06GradeBook2 {
    public static ArrayList<Student> list = new ArrayList<>();
    public static int nextId = 1;

    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 100;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message = "1.입력 2. 목록 보기 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }

    public static void insert() {
        Student s = new Student();

        s.id = nextId++;
        String message = "학생의 이름을 입력하세요";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "학생의 국어 점수를 입력하세요";
        s.korean = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);
        message = "학생의 영어 점수를 입력하세요";
        s.english = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);
        message = "학생의 수학 점수를 입력하세요";
        s.math = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);

        list.add(s);
    }

    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("입력된 학생이 없습니다");
            return;
        }

        for (Student s : list) {
            System.out.printf("%d. %s\n", s.id, s.name);
        }

        String message = "상세보기 할 학생 번호(뒤로 가려면 0)";
        int choice = ScannerUtil.nextInt(SCANNER, message);

        while (!validate(choice)) {
            System.out.println("잘못 입력 하셨습니다.");
            choice = ScannerUtil.nextInt(SCANNER, message);
        }

        if (choice != 0) {
            printOne(choice);
        }
    }

    public static boolean validate(int id) {
        if (id == 0) return true;

        Student s = new Student();
        s.id = id;

        return list.contains(s);
    }

    public static void printOne(int id) {
        Student s = selectOne(id);
        if (s == null) {
            System.out.println("잘못된 번호입니다");
            printList();
        } else {
            s.printInfo();

            String message = "1. 수정 2. 삭제 3. 뒤로가기";
            int choice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

            if (choice == 1) {
                update(id);

            } else if (choice == 2) {
                delete(id);
            } else if (choice == 3) {
                printList();
            }
        }
    }

    public static Student selectOne(int id) {
        Student s = new Student();
        s.id = id;

        int index = list.indexOf(s);
        if (index == -1) {
            return null;
        }
        return list.get(index);
    }

    public static void update(int id) {
        Student s = selectOne(id);
        int index = list.indexOf(id);

        String message = "학생의 이름을 입력하세요";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "국어점수를 입력하세요";
        s.korean = ScannerUtil.nextInt(SCANNER, message, 0, 100);
        message = "영어점수를 입력하세요";
        s.english = ScannerUtil.nextInt(SCANNER, message, 0, 100);
        message = "수학점수를 입력하세요";
        s.math = ScannerUtil.nextInt(SCANNER, message, 0, 100);

        printOne(id);
    }

    public static void delete(int id) {
        Student s = selectOne(id);
        String message = "정말로 삭제하시겠습니까 Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);

        if (answer.equalsIgnoreCase("Y")) {
            list.remove(s);
            printList();
        } else {
            printOne(id);
        }

    }
}
