package day0508;

import java.util.Random;
import java.util.Scanner;

public class Ex02Lotto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //컴퓨터 숫자 저장 배열
        int[] computerNumbers = new int[6];
        //중복되지 않는 숫자 6개 저장
        for (int i = 0; i < 6; i++) {
            computerNumbers[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (computerNumbers[i] == computerNumbers[j]) {
                    i--;
                    break;
                }
            }
        }

        //정렬
        for (int i = 1; i < 6; i++) {
            if (computerNumbers[i - 1] > computerNumbers[i]) {
                int temp = computerNumbers[i - 1];
                computerNumbers[i - 1] = computerNumbers[i];
                computerNumbers[i] = temp;
                i = 0;
            }
        }

        //사용자로부터 몇판 할지 입력받기
        System.out.println("몇 게임 하시겠습니까? ");
        System.out.print("> ");
        int gameSize = scanner.nextInt();
        int[][] userNumbers = new int[gameSize][6];


        for (int i = 0; i < gameSize; i++) {
            System.out.printf("%d번째 게임\n", i + 1);
            System.out.println("1. 자동 2. 수동");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            int temp;
            boolean isValid = true;

            for (int j = 0; j < 6; ) {
                isValid = true;

                if (userChoice == 2) {
                    System.out.printf("%d번째 숫자를 입력해주세요: ", j + 1);
                    temp = scanner.nextInt();
                } else if (userChoice == 1) {
                    temp = random.nextInt(45) + 1;

                } else {
                    System.out.println("제대로 입력하세요.");
                    j--;
                    continue;
                }

                if (temp > 45 || temp < 1) {
                    isValid = false;
                }
                for (int k = 0; k < j; k++) {
                    if (temp == userNumbers[i][k]) {
                        isValid = false;
                    }
                }

                if (isValid) {
                    userNumbers[i][j] = temp;
                    j++;
                } else if (userChoice == 2) {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        }

        for (int i = 0; i < gameSize; i++) {
            for (int j = 1; j < 6; j++) {
                if (userNumbers[i][j] < userNumbers[i][j - 1]) {
                    int temp = userNumbers[i][j];
                    userNumbers[i][j] = userNumbers[i][j - 1];
                    userNumbers[i][j - 1] = temp;
                    j = 0;
                }
            }
        }

        System.out.print("컴퓨터 숫자: [");
        for (int i : computerNumbers)
            System.out.printf("%2d ", i);
        System.out.printf("]\n");

        //사용자 숫자와 결과 출력
        for (int i = 0; i < gameSize; i++) {
            //맞은 갯수를 저장할 int 변수
            int count = 0;

            System.out.print("사용자 숫자: [");
            for (int j = 0; j < 6; j++)
                System.out.printf("%2d ", userNumbers[i][j]);
            System.out.println("]");

            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (computerNumbers[j] == userNumbers[i][k]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println("맞은 갯수: " + count);
        }


    }
}
