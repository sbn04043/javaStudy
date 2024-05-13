package day0502;

//for 반복문
//while과 다르게 특정 횟수만큼 반복을 시킬 때 사용된다.
//for 반복문은 다음과 같은 형식을 가진다.
//for (제어 변수의 초기화; 조건식; 제어 변수의 변화식) {
//  반복 내용
//}
public class Ex15ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("i의 현재 값: " + i);
//        }

        int start = 4;
        int end = 6;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("i의 값: %d j의 값: %d\n", i, j);
            }
        }
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 11; j <= 14; j++) {
//                System.out.printf("i의 현재 값: %d j의 현재값: %d\n", i, j);
//
//            }
//        }
    }
}
