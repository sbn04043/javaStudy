package util;

//스캐너 클래스를 사용할 때
//더 간편하게 사용할 수 있는
//메소드를 모아둔 클래스

import java.util.Scanner;

public class ScannerUtil {
    //출력에 사용할 메시지를 받아서
    //예쁘게 출력해 줄 메소드
    public static void printMessage(String msg) {
        System.out.println(msg);
        System.out.print("> ");
    }

    //사용자로부터 입력에 사용할 스캐너와
    //입력에 필요한 메세지를 받아서
    //정수입력을 처리하여 리턴해주는 메소드
    public static int nextInt(Scanner scanner, String msg) {
        printMessage(msg);
        return scanner.nextInt();
    }

    public static String nextLine(Scanner scanner, String msg) {
        printMessage(msg);
        String temp = scanner.nextLine();
        if (temp.isEmpty())
            temp = scanner.nextLine();
        return temp;
    }

    //사용자가 스캐너, 메시지, 최소값, 최대값을 보내면
    //해당 범위의 정수를 리턴해주는 메소드
    public static int nextInt(Scanner scanner, String msg, int min, int max) {
        int temp = nextInt(scanner, msg);
        while (temp > max || temp < min) {
            System.out.println("범위를 넘어간 값입니다.");
            temp = nextInt(scanner, msg);
        }
        return temp;
    }

    //
}
