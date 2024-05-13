package day0503;

import java.util.Scanner;

public class Ex02Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찍을 별의 줄을 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("===============================");

        int height = num;
        for (int i = 1; i <= height; i++) {
            String str = "";
            for (int j = i; j <= num; j++)
                str += "*";
            System.out.println(str);
        }
    }
}
