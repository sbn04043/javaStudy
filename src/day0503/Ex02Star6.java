package day0503;

import java.util.Scanner;

public class Ex02Star6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찍을 별의 줄을 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = num; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j < i * 2; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("===========================");

        int height = num;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            int spaceWidth = i - 1;
            int starWidth = num * 2 - 2 * i + 1;

            for (int j = 1; j <= spaceWidth; j++)
                stars += " ";

            for (int j = 1; j <= starWidth; j++)
                stars += "*";

            System.out.println(stars);
        }
        System.out.println("===========================");

        for (int i = num; i > 0; i--) {
            String stars = "";
            int spaceWidth = height - i;
            int starWidth = i * 2 - 1;

            for (int j = 0; j < spaceWidth; j--)
                stars += " ";

            for (int j = 0; j < starWidth; j++)
                stars += "*";

            System.out.println(stars);

        }

    }
}
