package day0501;

//논리연산자
//논리연산자는 두개의 boolean값에 대한 연산을 한다.
//논리 연산자에는 and or not 3가지가 있다.
//and(&&): 2개 boolan 모두 true 때만 true, 나머지는 false
//or(||) 2개 boolan 모두 false 때만 false 나머지는 true
//not(!) true는 false, false는 true로 연산
public class Ex04Operator {
    public static void main(String[] args) {
        //int a b c를 2 3 4로 초기화
        int a = 2, b = 3, c = 4;
        //b는 a보다 크고 c보다 작다: a < b < c
        //수학적으론 맞지만 프로그래밍 적으론 아니다.
        System.out.println("a < b && b < c: " + (a < b && b < c));

        //not 연산자의 경우, 할당 연산자가 아니기 때문에
        //코드를 실행하는 시점에서만 값을 반전시키지
        //실제 저장된 값을 바꾸지 않는다.
        boolean isTrue = true;
        System.out.println("isTrue: " + isTrue);
        System.out.println("!isTrue: " + !isTrue);

    }
}
