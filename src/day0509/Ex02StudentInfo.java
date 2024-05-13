package day0509;

import util.ArrayUtil;
import util.PrintUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex02StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[0];
        String[] names = new String[0];
        int[] koreanScores = new int[0];
        int[] englishScores = new int[0];
        int[] mathScores = new int[0];
        int[] sumScores = new int[0];
        double[] averageScores = new double[0];

        int choice = -1;
        int index = 0;

        while (choice != 3) {

            choice = ScannerUtil.nextInt(scanner, "1. 정보 입력 2. 정보 출력 3. 프로그램 종료");
            if (choice == 1) {
                numbers = ArrayUtil.add(numbers, ScannerUtil.nextInt(scanner, "번호를 입력하세요."));
                names = ArrayUtil.add(names, ScannerUtil.nextLine(scanner, "이름을 입력하세요."));
                koreanScores = ArrayUtil.add(koreanScores, ScannerUtil.nextInt(scanner, "국어 점수를 입력하세요"));
                englishScores = ArrayUtil.add(englishScores, ScannerUtil.nextInt(scanner, "영어 점수를 입력하세요"));
                mathScores = ArrayUtil.add(mathScores, ScannerUtil.nextInt(scanner, "수학 점수를 입력하세요"));

                sumScores = ArrayUtil.add(sumScores, koreanScores[index] + englishScores[index] + mathScores[index]);
                averageScores = ArrayUtil.add(averageScores, sumScores[index] / 3.0);
                index++;
            } else if (choice == 2) {
                if (index == 0) ScannerUtil.printMessage("입력을 하지 않았습니다.");
                else {
                    for (int i = 0; i < index; i++) {
                        PrintUtil.printLineBreak();
                        System.out.printf("번호: %2d. 이름: %s\n", numbers[i], names[i]);
                        System.out.printf("국어: %3d 영어: %3d 수학: %3d\n", mathScores[i], koreanScores[i], englishScores[i]);
                    }
                    PrintUtil.printLineBreak();
                }
            }

        }
    }
}
