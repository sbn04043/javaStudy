package day0507;

//ver 0.5
//중복 막기(같은 값 저장 방지)

import java.util.Random;

public class Ex02Lotto02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoArray = new int[6];
        boolean isDuplicate = false;

        //for문의 경우 내부의 초기화식이나 변경식 같은 것을
        //공백을 넣어줄 수도 있다.
        //단, 이때에는 무한 루프가 되지 않도록 break 또는 변화식을
        //반드시 포함시켜줘야 한다.

        //변화식이 비어있는 for문
        for (int i = 0; i < lottoArray.length; ) {
            int temp = random.nextInt(45) + 1;
            isDuplicate = false;

            //for문을 만들어 lottoArray 요소와 temp 비교
            for (int j = 0; j < i; j++) {
                if (lottoArray[j] == lottoArray[i]) {
                    if (lottoArray[j] == temp) {
                        isDuplicate = true;
                        break;
                    }
                }
            }

            //temp의 값이 중복이 아니므로 값 저장하고 i값 1 증가
            if (!isDuplicate)
                lottoArray[i++] = temp;
        }

//        for (int i = 0; i < lottoArray.length; i++) {
//            lottoArray[i] = random.nextInt(45) + 1;
//
//            for (int j = 0; j < i; j++) {
//                if (lottoArray[i] == lottoArray[j]) {
//                    i--;
//                    break;
//                }
//            }
//        }


        for (int i : lottoArray) {
            System.out.printf("%d ", i);
        }
    }
}
