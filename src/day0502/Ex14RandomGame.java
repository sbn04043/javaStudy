package day0502;
//랜덤 게임
//컴퓨터가 1~100 사이의 랜덤한 숫자를 뽑으면
//사용자가 그 숫자를 맞추는 게임
//만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 DOWN 출력
//사용자가 입력한 숫자가 컴퓨터보다 작으면 UP 출력
//사용자가 컴퓨터의 숫자를 맞추면 축하메세지를 띄우고
//몇번만에 맞췄는지를 보여준다.

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//심화: 적게 입력해 맞추는게 더 좋은 점수이므로
//최고점수를 갱신되게 만들어서
//사용자가 최고 점수를 갱신하면 축하하고
//최고점수를 갱신하는 프로그램을 작성하시오
public class Ex14RandomGame {
    public static void main(String[] args) {
        final int MAX_COMPUTER_NUM = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxScore = 1000000000;

        while (true) {
            System.out.println("1. 플레이 2. 현재 최고 기록 보기 3. 종료");
            System.out.print("> ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int score = 0;
                int computerNum = random.nextInt(MAX_COMPUTER_NUM) + 1;
                int userNum = 0;
                while (userNum != computerNum) {
                    score++;

                    System.out.println(score + "번째 숫자를 입력해주세요");
                    System.out.print("> ");
                    userNum = scanner.nextInt();

                    if (userNum > computerNum) System.out.println("DOWN!!!");
                    else if (userNum < computerNum) System.out.println("UP!!!");
                }
                if (maxScore > score) {
                    maxScore = score;
                    System.out.println("최고 점수 갱신: " + maxScore + "째로 맞췄습니다.");
                } else {
                    System.out.println(score + "번째로 정답을 맞췄습니다.");
                    System.out.println("최고 기록은 " + maxScore + "입니다.");
                }
            } else if (choice == 2) {
                if (maxScore == 1000000000) {
                    System.out.println("아직 게임 플레이를 한 적이 없습니다.");
                } else {
                    System.out.println("최고 기록은 " + maxScore + "입니다.");
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
