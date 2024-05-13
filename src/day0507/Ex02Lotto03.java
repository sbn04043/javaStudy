package day0507;

//ver 1.0
//정렬하여 보여주는 프로그램

import java.util.Random;

public class Ex02Lotto03 {
    public static void main(String[] args) {
        //int a와 b에 5와 7을 넣고 값 바꾸기
        int a = 5, b = 7;
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("%d %d\n", a, b);

        Random random = new Random();
        int[] lottoNumbers = new int[6];
        boolean isDuplicate = false;

        for (int i = 0; i < lottoNumbers.length; ) {
            temp = random.nextInt(45) + 1;
            isDuplicate = false;

            //for문을 만들어 lottoArray 요소와 temp 비교
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[j] == lottoNumbers[i]) {
                    if (lottoNumbers[j] == temp) {
                        isDuplicate = true;
                        break;
                    }
                }
            }

            //temp의 값이 중복이 아니므로 값 저장하고 i값 1 증가
            if (!isDuplicate)
                lottoNumbers[i++] = temp;
        }

        for (int i : lottoNumbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        //버블 정렬
        //i와 i+1 비교하므로 조건식이 lottoNumber.length - 1이 됨.
        for (int i = 1; i < lottoNumbers.length - 1; i++) {
            //i와 i+1을 비교해
            //가 더 크면 실행되는 if 반복문
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                Swap(lottoNumbers, i, i + 1);
                i = -1;
            }
        }

        for (int i : lottoNumbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
