package day0509;

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex02StudentInfo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int[] koreanArray = new int[0];
        int[] englishArray = new int[0];
        int[] mathArray = new int[0];

        final int MIN_INT = 0;
        final int MAX_INT = 100;

        while (true) {
            String MenuMessage = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, MenuMessage);

            if (userChoice == 1) {
                String message = "번호를 입력하세요. ";
                int id = ScannerUtil.nextInt(scanner, message);
                message = "이름을 입력하세요. ";
                String name = ScannerUtil.nextLine(scanner, message);
                message = "국어 점수를 입력하세요. ";
                int korean = ScannerUtil.nextInt(scanner, message, MIN_INT, MAX_INT);
                message = "영어 점수를 입력하세요. ";
                int english = ScannerUtil.nextInt(scanner, message, MIN_INT, MAX_INT);
                message = "수학 점수를 입력하세요. ";
                int math = ScannerUtil.nextInt(scanner, message, MIN_INT, MAX_INT);

                idArray = ArrayUtil.add(idArray, id);
                nameArray = ArrayUtil.add(nameArray, name);
                koreanArray = ArrayUtil.add(koreanArray, korean);
                englishArray = ArrayUtil.add(englishArray, english);
                mathArray = ArrayUtil.add(mathArray, math);
            } else if (userChoice == 2) {
                if (idArray.length == 0) System.out.println("데이터가 없습니다.");
                else {
                    for (int i = 0; i < idArray.length; i++) {
                        int id = idArray[i];
                        String name = nameArray[i];
                        int korean = koreanArray[i];
                        int english = englishArray[i];
                        int math = mathArray[i];
                        int sum = korean + math + english;
                        double average = sum / 3.0;
                        System.out.printf("%2d. %s\n", id, name);
                        System.out.printf("국어: %3d 영어: %3d 수학: %3d\n", korean, english, math);
                        System.out.printf("합: %3d 평균: %6.2f\n", sum, average);
                    }
                }
            } else if (userChoice == 3) {
                System.out.println("종료합니다.");
                break;
            }

        }
    }

}
