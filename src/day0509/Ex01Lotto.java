package day0509;

//ArrayUtil 사용한 버전

import util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Ex01Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int LOTTO_NUM = 6;

        //컴퓨터의 숫자를 저장할 배열
        int[] computerNumbers = new int[0];
        int[][] playerNumbers;

        computerNumbers = lottoRandomNumbers(random, LOTTO_NUM);
        ArrayUtil.print(computerNumbers);
        ArrayUtil.sort(computerNumbers);
        ArrayUtil.print(computerNumbers);

    }

    public static int[] lottoRandomNumbers(Random random, int num) {
        int[] tempArray = new int[num];
        for (int i = 0; i < num; ) {
            int temp = random.nextInt(45) + 1;
            if (!ArrayUtil.contains(tempArray, temp))
                tempArray[i++] = temp;
        }
        return tempArray;
    }
}
