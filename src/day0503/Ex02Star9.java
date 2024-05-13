package day0503;

import java.util.Scanner;

public class Ex02Star9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찍을 별의 줄을 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");

            for (int j = num; j > i; j--)
                System.out.print("*");

            for (int j = num - 1; j > i; j--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("===========================");

        for (int i = 1; i <= num; i++) {
            String stars = "";
            int spaceWidth = num - i;
            int starWidth = 2 * i - 1;

            for (int j = 0; j < spaceWidth; j++)
                stars += " ";
            for (int j = 0; j < starWidth; j++)
                stars += "*";

            System.out.println(stars);
        }

        for (int i = num - 1; i > 0; i--) {
            String stars = "";
            int spaceWidth = num - i;
            int starWidth = 2 * i - 1;

            for (int j = 0; j < spaceWidth; j++)
                stars += " ";

            for (int j = 0; j < starWidth; j++)
                stars += "*";

            System.out.println(stars);
        }

        System.out.println("===========================");

        int height = num * 2 - 1;

        for (int i = 1; i <= height; i++) {
            String stars = "";
            int spaceWidth = 0;
            int starWidth = 0;

            if (i <= num) {
                spaceWidth = num - i;
                starWidth = 2 * i;
            } else {
                spaceWidth = i - num;
                starWidth = 2 * (i - num);
            }

            for (int j = 1; j <= spaceWidth; j++)
                stars += " ";

            for (int j = 1; j < starWidth; j++)
                stars += "*";

            System.out.println(stars);
        }
    }
}
