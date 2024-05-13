package day0508;
//로또 번호 제작기
//사용자로부터 게임 수를 입력 받아서
//한번에 여러 게임을 할 수 있는 로또 프로그램 제작

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//몇게임 하시겠습니까?
//> 5
//1번째 게임
//1. 수동 2. 자동
//> 1
//숫자를 입력하세요...
//2번째 게임
//1. 수동 2. 자동
//> 2
//3번째 게임
//...
//사용자의 1번쨰 게임 -> x개 맞음
public class Ex02Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("몇 게임 하시겠습니까?");
        System.out.print("> ");
        int gameCount = scanner.nextInt();
        int[][] userNumbers = new int[gameCount][6];
        int[][] computerNumbers = new int[gameCount][6];

        for (int i = 0; i < gameCount; i++) {
            System.out.printf("%d번째 게임\n", i + 1);
            System.out.println("1. 수동 2. 자동");
            System.out.print("> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                for (int j = 0; j < 6; j++) {
                    computerNumbers[i][j] = random.nextInt(45) + 1;
                    for (int k = 0; k < j; k++) {
                        if (computerNumbers[i][j] == computerNumbers[i][k]) {
                            j--;
                            break;
                        }
                    }
                }

                for (int j = 0; j < 6; j++) {
                    System.out.printf("%d번째 수동 번호를 입력해주세요: ", j + 1);
                    userNumbers[i][j] = scanner.nextInt();

                    if (userNumbers[i][j] > 45 || userNumbers[i][j] < 1) {
                        j--;
                        continue;
                    }
                    for (int k = 0; k < j; k++) {
                        if (userNumbers[i][j] == userNumbers[i][k]) {
                            j--;
                            break;
                        }
                    }
                }

            } else if (choice == 2) {
                for (int j = 0; j < 6; j++) {
                    computerNumbers[i][j] = random.nextInt(45) + 1;
                    userNumbers[i][j] = random.nextInt(45) + 1;
                    for (int k = 0; k < j; k++) {
                        if (computerNumbers[i][j] == computerNumbers[i][k]
                                || userNumbers[i][j] == userNumbers[i][k]) {
                            j--;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("숫자를 제대로 입력해주세요");
                i--;
                continue;
            }
            Arrays.sort(userNumbers[i]);
            Arrays.sort(computerNumbers[i]);
        }

        for (int i = 0; i < gameCount; i++) {
            int count = 0;

            System.out.print("컴퓨터 숫자: ");
            for (int j = 0; j < 6; j++) {
                System.out.printf("%2d ", computerNumbers[i][j]);
            }
            System.out.println();

            System.out.print("이용자 숫자: ");
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d ", userNumbers[i][j]);
            }
            System.out.println();

            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (userNumbers[i][j] == computerNumbers[i][k]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.printf("%d번째 게임 맞춘 수: ", i + 1);
            System.out.println(count);
        }
    }
}
