package day0503;

import java.util.Scanner;

public class Ex02Star5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찍을 별의 줄을 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("===========================");

        for (int i = 1; i <= num; i++) {
            String stars = "";
            int spaceWidth = num - i;
            int starWidth = 2 * i - 1;

            for (int j = 1; j <= spaceWidth; j++)
                stars += " ";

            for (int j = 1; j <= starWidth; j++)
                stars += "*";

            System.out.println(stars);
        }
    }
}
