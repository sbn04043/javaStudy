package day0510;

//전역 변수와 상수를 사용한
//학생 성적 관리 프로그램

import util.ArrayUtil;
import util.PrintUtil;
import util.ScannerUtil;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Ex03GradeBook01 {
    //각종 정보를 담을 배열
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];

    //다음 입력될 학생의 번호를 저장한 전역 변수
    //고유 번호
    public static int nextId = 1;

    //전역 상수
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 100;
    public static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        ShowMenu();
    }

    public static void ShowMenu() {
        String message = "1.입력 2. 출력 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                insertStudent();
            } else if (userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("1~3까지 입력해주세요");
            }
        }
    }

    //학생 입력 메소드
    public static void insertStudent() {
        String message;

        idArray = ArrayUtil.add(idArray, nextId++);
        message = "이름 입력";
        nameArray = ArrayUtil.add(nameArray, ScannerUtil.nextLine(SCANNER, message));
        message = "국어 점수 입력";
        koreanArray = ArrayUtil.add(koreanArray, ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE));
        message = "영어 점수 입력";
        englishArray = ArrayUtil.add(englishArray, ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE));
        message = "수학 점수 입력";
        mathArray = ArrayUtil.add(mathArray, ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE));
    }

    //학생 출력 메소드
    public static void printList() {
        if (ArrayUtil.size(idArray) == 0) {
            System.out.println("데이터가 없습니다.");
        } else {
            for (int i = 0; i < idArray.length; i++) {
                int id = ArrayUtil.get(idArray, i);
                String name = ArrayUtil.get(nameArray, i);

                System.out.printf("%d. %s\n", id, name);
            }

            String message = "학생 정보를 보려면 해당 번호 입력 0. 뒤로가기";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            while (!validate(userChoice)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    //더보기 할 학생 번호가 유효한지 체크
    //유효하면 true, 아니면 false 리턴
    public static boolean validate(int value) {
        if (value == 0) return true;
        return ArrayUtil.contains(idArray, value);
    }

    public static void printOne(int id) {
        int index = ArrayUtil.indexOf(idArray, id);

        String name = ArrayUtil.get(nameArray, index);
        int koreanScore = ArrayUtil.get(koreanArray, index);
        int englishScore = ArrayUtil.get(englishArray, index);
        int mathScore = ArrayUtil.get(mathArray, index);
        int sum = koreanScore + englishScore + mathScore;
        double average = (double) sum / SUBJECT_SIZE;

        PrintUtil.printLineBreak();
        System.out.printf("%d. %s\n", id, name);
        System.out.printf("국어: %3d 영어: %3d 수학: %3d\n", koreanScore, englishScore, mathScore);
        System.out.printf("총합: %3d 평균: %6.2f\n", sum, average);

        PrintUtil.printLineBreak();
        String message = "1. 수정 2. 삭제 3. 뒤로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

        if (userChoice == 1) {
            update(id);
            printOne(id);
        } else if (userChoice == 2) {
            delete(id);
        } else if (userChoice == 3) {
            printList();
        }
    }

    public static void update(int id) {
        int index = ArrayUtil.indexOf(idArray, id);

        String message;
        message = "학생의 이름을 다시 입력해주세요";
        String name = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(nameArray, index, name);

        message = "학생의 국어 점수를 다시 입력해주세요";
        int koreanScore = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);
        ArrayUtil.set(koreanArray, index, koreanScore);

        message = "학생의 영어 점수를 다시 입력해주세요";
        int englishScore = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);
        ArrayUtil.set(englishArray, index, englishScore);

        message = "학생의 수학 점수를 다시 입력해주세요";
        int mathScore = ScannerUtil.nextInt(SCANNER, message, MIN_SCORE, MAX_SCORE);
        ArrayUtil.set(mathArray, index, mathScore);
    }

    public static void delete(int id) {
        int index = ArrayUtil.indexOf(idArray, id);

        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        //대소문자 상관 없이 비교하는 equalsIgnoreCase
        if (answer.equalsIgnoreCase("Y")) {
            //사용자가 동의했으므로 삭제
            idArray = ArrayUtil.remove(idArray, index);
            nameArray = ArrayUtil.remove(nameArray, index);
            koreanArray = ArrayUtil.remove(koreanArray, index);
            englishArray = ArrayUtil.remove(englishArray, index);
            mathArray = ArrayUtil.remove(mathArray, index);
            printList();
        } else {
            //상세보기 다시 실행
            printOne(id);
        }
    }

    //클래스 마지막 줄
}
