package day0501;
//연산자(Operator)
//연산자란 수학적 기호에 프로그래밍 기능을 정의한 것이다.
//연산자에는
//산술연산자, 증감연산자, 할당연산자, 논리연산자, 비트연산자
//5가지가 있지만 비트연산자는 배우지 않는다.

//산술연산자
//2개의 값에 대한 기본적인 산수 계산을 하는 연산자이다.
//+ - * / % 5가지가 있다.
public class Ex01Operator {
    public static void main(String[] args) {
        //1. 정수끼리의 산수 연산
        //int num1, num2 선언
        int num1 = 5, num2 = 3;

        //String + int를 하면 String에 아스키코드 숫자값이 더해진다.
        //따라서 + -를 계산할 땐 괄호에 넣어야 한다.
        //* / %는 +보다 계산 우선순위가 앞서 괄호 표시를 안 해도 된다.
        System.out.println("두 정수의 합: "+(num1 + num2));
        System.out.println("두 정수의 차: "+(num1 - num2));
        System.out.println("두 정수의 곱: "+num1 * num2);
        //int형에서 / 계산은 나머지를 버린다.
        System.out.println("두 정수의 몫: "+num1 / num2);
        System.out.println("두 정수의 나머지: "+num1 % num2);
        System.out.println();

        //2. 실수끼리의 산수 연산
        //double d1, d2 선언
        double d1 = 5.0, d2 = 3.0;
        System.out.println("두 실수의 합: "+(d1 + d2));
        System.out.println("두 실수의 차: "+(d1 - d2));
        System.out.println("두 실수의 곱: "+d1 * d2);
        System.out.println("두 실수의 몫: "+d1 / d2);
        System.out.println("두 실수의 나머지: "+d1 % d2);
        System.out.println();

        //3. 정수와 실수의 연산
        //자동 형변환이 일어나 정수가 실수가 돼 계산
        System.out.println("실수와 정수의 합: "+(num1 + d2));
        System.out.println("실수와 정수의 차: "+(num1 - d2));
        System.out.println("실수와 정수의 곱: "+num1 * d2);
        System.out.println("실수와 정수의 몫: "+num1 / d2);
        System.out.println("실수와 정수의 나머지: "+num1 % d2);
        System.out.println();

        //직접 해보기
        //국영수 점수를 저장할 int 변수 3개를 만들고 90 90 91 저장하기
        int korean = 90, english = 90, math = 91;
        //총점
        int sum = korean + english + math;
        //평균 int / int는 int형이기 때문에 형변환을 해야한다.
        double average = sum / 3.0;
        System.out.printf("합: %d, 평균: %f\n", sum, average);

        //String
        //String은 여러 글자를 다룰 수 있는 데이터타입(클래스)
        //String 클래스의 값은 ""로 감싸서 나타낸다.
        //String 클래스는 + 연산이 가능하다.
        //String + 연산은 앞의 값과 뒤의 값을 이어서 하나의
        //String으로 만드는 연산이다.
        //만약, 다른 데이터타입의 값과 String 클래스의 값이 + 연산이 될 경우,
        //다른 데이터타입을 String 클래스 값으로 변환하여 이어붙이게 된다.

        //다음 중 값이 다르게 나오는 것은
        System.out.println("1"+23);
        System.out.println("123");
        System.out.println(100+23);
        System.out.println("100"+23);
    }
}
