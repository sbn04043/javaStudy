package day0507;
//ver 1.1
//사용자로부터 1~45 번호 6개를 입력받아
//컴퓨터의 당첨 숫자와 비교하여
//맞춘 갯수를 출력하는 프로그램 작성
//사용자가 잘못된 숫자를 입력하면 올바른 숫자가 입력될 떄까지
//입력 받으세요

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02Lotto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        boolean isCorrect = false;
//        int[] computerNums = new int[6];
//
//        for (int i = 0; i < computerNums.length; i++) {
//            computerNums[i] = random.nextInt(45) + 1;
//            for (int j = 0; j < i; j++) {
//                if (computerNums[i] == computerNums[j]) {
//                    i--;
//                }
//            }
//        }
//
//        Arrays.sort(computerNums);
//        printArray(computerNums);
//
//        while (!isCorrect) {
//            boolean isValid = true;
//            int[] userNums = new int[6];
//            int correctNum = 0;
//
//            System.out.println("숫자 6개를 입력해주세요.");
//            System.out.print("> ");
//            for (int i = 0; i < userNums.length; i++) {
//                userNums[i] = scanner.nextInt();
//            }
//            Arrays.sort(userNums);
//
//            for (int i = 0; i < userNums.length - 1; i++) {
//                if (userNums[i] == userNums[i + 1]) {
//                    isValid = false;
//                    break;
//                }
//            }
//            for (int userNum : userNums) {
//                if (userNum < 1 || userNum > 45) {
//                    isValid = false;
//                    break;
//                }
//            }
//
//            if (!isValid) {
//                System.out.println("입력 숫자가 유효하지 않습니다.");
//                continue;
//            }
//
//            System.out.println("===================================");
//            System.out.print("컴퓨터 로또 번호: ");
//            printArray(computerNums);
//            System.out.print("당신의 로또 번호: ");
//            printArray(userNums);
//            System.out.println("===================================");
//
//            for (int userNum : userNums)
//                for (int computerNum : computerNums)
//                    if (userNum == computerNum)
//                        correctNum++;
//
//            if (correctNum == userNums.length) {
//                System.out.println("번호를 다 맞췄습니다.");
//                isCorrect = true;
//            } else {
//                System.out.printf("번호를 %d개 맞췄습니다.\n", correctNum);
//                System.out.println("다시 시도해주세요");
//            }
//        }

        final int LENGTH = 6;
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 45;

        int[] computerNumbers = new int[LENGTH];
        int[] userNumbers = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            computerNumbers[i] = random.nextInt(MAX_VALUE) + MIN_VALUE;

            for (int j = 0; j < i; j++) {
                if (computerNumbers[i] == computerNumbers[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < LENGTH - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < LENGTH; ) {
            System.out.printf("%d번째 숫자를 입력해주세요: ", i + 1);
            userNumbers[i] = scanner.nextInt();
            boolean isValid = true;

            if (userNumbers[i] > 45 || userNumbers[i] < 1)
                isValid = false;
            for (int j = 0; j < i; j++) {
                if (userNumbers[i] == userNumbers[j]) {
                    isValid = false;
                }
            }

            if (isValid) i++;
            else System.out.println("유효하지 않은 숫자입니다.");
        }

        for (int i = 0; i < LENGTH - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }

        System.out.println("==================================");
        System.out.print("컴퓨터 숫자: ");
        printArray(computerNumbers);
        System.out.print("사용자 숫자: ");
        printArray(userNumbers);

        int count = 0;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (computerNumbers[i] == userNumbers[j]) {
                    count++;
                }
            }
        }
        System.out.printf("맞춘 갯수: %d\n", count);
        System.out.println("==================================");
    }

    public static void printArray(int[] nums) {
        for (int num : nums)
            System.out.printf("%2d ", num);
        System.out.println();
    }
}
