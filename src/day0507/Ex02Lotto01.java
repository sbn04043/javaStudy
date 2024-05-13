package day0507;

import java.util.Random;

//1~45까지 랜덤한숫자 6개를 배열에 저장하고
//출력하는 프로그램을 작성하시오
//ver 0.1
public class Ex02Lotto01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoArray = new int[6];

        for (int i = 0; i < lottoArray.length; i++) {
            lottoArray[i] = random.nextInt(45) + 1;

//            for (int j = 0; j < i; j++) {
//                if (lottoArray[i] == lottoArray[j]) {
//                    i--;
//                    break;
//                }
//            }
        }

        for (int i : lottoArray) {
            System.out.printf("%d ", i);
        }

    }
}
