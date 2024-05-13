package day0502;

//사용자로부터 점수를 입력받아
//A~F 출력되는 프로그램
//올바르지 않는 점수면 계속 다시 입력받기
import java.util.Scanner;

//2.
public class Ex09While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int num = scanner.nextInt();
        while(num > 100 || num < 0) {
            System.out.print("점수를 입력하세요: ");
            num = scanner.nextInt();
        }

        if (num >= 90) System.out.println("A입니다.");
        else if (num >= 80) System.out.println("B입니다.");
        else if (num >= 70) System.out.println("C입니다.");
        else if (num >= 60) System.out.println("D입니다.");
        else System.out.println("F입니다.");
    }
}
