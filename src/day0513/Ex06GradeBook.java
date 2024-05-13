package day0513;

import types.Student;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList를 사용하여
//학생관리 프로그램 작성
//수정 삭제 가능
//메소드 분리는 가능할 경우 하시오
public class Ex06GradeBook {
    public static ArrayList<Student> list = new ArrayList<>();
    public static int nextId = 1;

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu() {
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int choice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

            if (choice == 1) {
                insert();
            } else if (choice == 2) {
                print();
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }

    public static void insert() {
        Student s = new Student();
        s.id = nextId++;

        String message = "이름을 입력하세요";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "국어 성적을 입력하세요";
        s.korean = ScannerUtil.nextInt(SCANNER, message, 0, 100);
        message = "영어 성적을 입력하세요";
        s.english = ScannerUtil.nextInt(SCANNER, message, 0, 100);
        message = "수학 성적을 입력하세요";
        s.math = ScannerUtil.nextInt(SCANNER, message, 0, 100);

        list.add(s);
    }

    public static void print() {
        for (Student s : list) {
            System.out.printf("%2d. %s\n", s.id, s.name);
        }

        String message = "수정하려는 학생의 번호를 입력하세요.(뒤로가기 0)";
        int choice = ScannerUtil.nextInt(SCANNER, message);

        if (!validate(choice)) {
            System.out.println("번호를 정확히 입력해주세요");
            print();
        }

        if (choice != 0)
            printOne(choice);
    }

    public static void printOne(int id) {
        Student s = selectOne(id);

        String message = "1. 수정 2. 제거 3. 뒤로가기";
        int choice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
        if (choice == 1) {
            update(id);
        } else if (choice == 2) {
            delete(id);
        } else if (choice == 3) {
            print();
        }

    }

    public static void update(int id) {
        Student s = selectOne(id);

        String message = "이름을 입력하세요";
        s.name = ScannerUtil.nextLine(SCANNER, message);
        message = "국어 점수를 입력하세요";
        s.korean = ScannerUtil.nextInt(SCANNER, message);
        message = "영어 점수를 입력하세요";
        s.english = ScannerUtil.nextInt(SCANNER, message);
        message = "수학 점수를 입력하세요";
        s.math = ScannerUtil.nextInt(SCANNER, message);

        printOne(id);
    }

    public static void delete(int id) {
        Student s = selectOne(id);
        list.remove(s);
    }

    public static boolean validate(int id) {
        if (id == 0) return true;

        Student s = new Student();
        s.id = id;

        return list.contains(s);
    }

    public static Student selectOne(int id) {
        Student s = new Student();
        s.id = id;

        int index = list.indexOf(s);
        return list.get(index);
    }
}
