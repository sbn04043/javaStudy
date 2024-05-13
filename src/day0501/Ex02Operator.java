package day0501;
//할당현산자
//오른쪽 값을 산술 연산한 값을 왼쪽 공간에 저장할 때 사용된다.
// =, +=, -=, *=, /=, %=

//증감연산자
//해당 연산자가 달린 공간의 값을 1씩 증가시키거나 감소시킨다.
//++, --
public class Ex02Operator {
    public static void main(String[] args) {
        //int num1 선언
        int num1, num2;
        //1. num1에 4 저장
        num1 = 5;
        num2 = 4;
        //num1 출력
        System.out.println("num1: "+num1);

        // 2. +=
        num1 += num2; // num1 = num1 + num2;과 같다.
        System.out.println("num1: "+num1);
        // 3. -=
        num1 -= num2; // num1 = num1 - num2;과 같다.
        System.out.println("num1: "+num1);
        // 4. *=
        num1 *= num2; // num1 = num1 * num2;과 같다.
        System.out.println("num1: "+num1);
        // 5. /=
        num1 /= num2; // num1 = num1 / num2;과 같다.
        System.out.println("num1: "+num1);
        // 6. %=
        num1 %= num2; // num1 = num1 % num2;과 같다.
        System.out.println("num1: "+num1);
        System.out.println();
        //증감연산자
        //증감연산자는 해당 변수의 값을 1씩 변화시키지만
        //변수의 앞에 붙냐 뒤에 붙냐에 따라서
        //실행 순서가 바뀐다.
        //앞에 붙을 때에는 가장 높은 우선순위를 갖고(가장 먼저 실행)
        //전위 증감연산자라고 부른다.
        //뒤에 붙을 때에는 가장 낮은 우선순위를 갖고(가장 늦게 실행)
        //후위 증감연산자라고 부른다.

        //int 변수 num1과 num2를 각각 5와 4로 초기화하자
        num1 = 5;
        num2 = 4;
        System.out.println("num1++: "+num1++);//프린트 되고 1 증가
        System.out.println("num1: "+num1);

        System.out.println("++num1: "+ ++num1);//1 증가하고 프린트
        System.out.println("num1: "+num1);

        //예제
        num1 = 10;
        num2 = 5;
        System.out.println(++num1 - num2--);

        //1. 전위 증감연산자 먼저 실행 -> num1(11) - num2(5)
        //2. 해당 값 프린트 -> 6 프린트
        //후위 증감연산자 실행 -> num1: 11, num2: 4


    }
}
