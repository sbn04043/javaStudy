package day0503;

//1부터 100까지 소수를 구하는 프로그램
//소수란?
//1과 자기 자신 말고 나누어 떨어지지 않는 수
public class Ex01PrimeNumber {
    public static void main(String[] args) {
        int MAX_NUM = 100;
        //boolean isPrime = true;

        //i: 소수인지 검사하는 숫자.
        //i의 초기값: 2, i의 조건: i <= 100
        for (int i = 2; i <= MAX_NUM; i++) {
            //약수 갯수를 저장할 변수
            int count = 0;
            //isPrime = true;

            //j: i의 약수인지 검사할 수
            //j의 초기값: 1, j의 조건: j <= i
            for (int j = 1; j <= i; j++) {
                //i를 j로 나눈값의 나머지가 0 -> 약수다
                //따라서 count를 1 증가시킨다.
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.printf("%3d ", i);
            }
        }
    }

}
