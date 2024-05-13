package day0502;

import java.util.Random;

//Random 클라스
//만약 우리가 랜덤한 숫자가 필요할 때에는
//Random 클라스 변수를 사용하여 랜덤 숫자를 뽑아낸다.
//Scanner와 마찬가지로 외부에서 import 해야 한다.
public class Ex13Random {
    public static void main(String[] args) {
        //랜덤 블라스 변수 선언 및 초기화
        Random random = new Random();

        //랜덤한 실수 뽑기
        //랜덤한 실수는 0~1 사이다.
        double d = random.nextDouble();
        System.out.println("랜덤 실수: " + d);

        //랜덤한 정수 뽑기
        //int 범위 안 랜덤한 정수가 나온다.
        int i = random.nextInt();
        System.out.println("랜덤 정수: " + i);

        //특정 범위 안에서 랜덤한 정수 뽑기
        //0~bound-1까지 랜덤
        i = random.nextInt(10);
        System.out.println("랜덤 정수: " + i);
    }

}
