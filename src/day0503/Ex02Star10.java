package day0503;

import java.util.Scanner;

public class Ex02Star10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찍을 별의 줄을 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = num; j > i; j--)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = num; j > i; j--)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("==========================");

        int height = 2 * num - 1;
        int width = 2 * num - 1;

        for (int i = 1; i <= height; i++) {
            String stars = "";
            if (i == 1 || i == height)
                for (int j = 1; j <= height; j++)
                    stars += "*";
            else {
                int spaceWidth = 0;
                int starWidth = 0;

                if (i < num) {
                    int upperI = i - 1;
                    starWidth = num - upperI;
                } else {
                    int lowerI = i - num + 1;
                    starWidth = lowerI;
                }
                spaceWidth = width - starWidth * 2;
                for (int j = 1; j <= starWidth; j++)
                    stars += "*";
                for (int j = 1; j <= spaceWidth; j++)
                    stars += " ";
                for (int j = 1; j <= starWidth; j++)
                    stars += "*";
            }

            System.out.println(stars);
        }
    }
}
