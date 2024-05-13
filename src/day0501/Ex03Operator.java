package day0501;

//비교연산자
//>, >=, ==, <=, <, !=
//왼쪽과 오른쪽의 값을 비교하되
//우리가 생각하는 것처럼 어디가 더 큰지를 반환하는 것이 아니라
//true false(boolean) 형식으로 반환한다.

//JRE에는 3가지 메모리 영역이 있다.
//1. Stack: 변수의 값이 저장되는 공간
//2. Heap: 참조형 값이 저장되는 공간
//3. Method: 현재 실행시킬 코드가 줄 단위로 저장되어 실행되는 공간

//기본형 변수와 참조형 변수의 차이
//기본형 변수: Stack 영역에 현재 값을 2진법으로 변환한 값이 저장된다.
//참조형 변수: Heap 영역에 현재 값이 저장이 되고
//  Stack 역역에는 Heap 영역에 저장된 값의 주소가 저장된다.

//기본적으로 연산자는 힙 영역에 아예 들어가지 않고
//스택 영역에 있는 값을 기준으로 계산한다.
//따라서, 비교 연산자로 스트링 값을 비교할 땐
//주소값 비교를 하기 때문에 부정확한 값이 나온다.

//따라서 참조형 데이터타입 중, 클래스형 혹은 인터페이스형의
//값을 비교할 때에는 equals() 메서드를 이용해 비교해야한다.

public class Ex03Operator {
    public static void main(String[] args) {
        //int 타입의 변수 num1, num2 선언하고
        //4, 5 초기화
        int num1 = 4, num2 = 5;
        System.out.println("num1 < num2: "+ (num1 < num2));
        System.out.println("num1 <= num2: "+ (num1 <= num2));
        System.out.println("num1 > num2: "+ (num1 > num2));
        System.out.println("num1 >= num2: "+ (num1 >= num2));
        System.out.println("num1 == num2: "+ (num1 == num2));
        System.out.println("num1 != num2: "+ (num1 != num2));

        //String 변수 만들rl
        String str1 = "abc"; // 힙 영역에 abc값 저장
        String str2 = new String("abc"); // 힙 영역에 새 abc값 저장
        String str3 = str1; // 스택 영역에 힙 영역의 abc에 있는 주소 저장
        String str4 = "abc"; // 힙 영역에 abc값을 찾아 해당 주소 저장
        String str5 = "def";
        System.out.println("str5 HashCode: "+ System.identityHashCode(str5));
        str5 = str5.replace('d', 'k'); // str5의 주소가 바껴도 heap 영역에 있는 def는 그대로
        String str6 = "def";

        System.out.println("str5 HashCode: "+ System.identityHashCode(str5));
        System.out.println("str6 HashCode: "+ System.identityHashCode(str6));

        System.out.println("str2 == str3: "+ (str2 == str3));
        System.out.println("str3 == str1: "+ (str3 == str1));
        System.out.println("str1 == str2: "+ (str1 == str2));

        System.out.println("str1 HashCode: "+ System.identityHashCode(str1));
        System.out.println("str2 HashCode: "+ System.identityHashCode(str2));
        System.out.println("str3 HashCode: "+ System.identityHashCode(str3));
        System.out.println("str4 HashCode: "+ System.identityHashCode(str4));

        str1 = str1.replace('a', 'k'); // 바뀐 str1값을 str1에 해시코드를 바꿔 새로 저장
        System.out.println("str1: "+str1);

        System.out.println("str1 HashCode: "+ System.identityHashCode(str1));
        System.out.println("str2 HashCode: "+ System.identityHashCode(str2));
        System.out.println("str3 HashCode: "+ System.identityHashCode(str3));
        System.out.println("str4 HashCode: "+ System.identityHashCode(str4));

        //참조변수.equals(비교참조변수)
        System.out.println("str1.equals(str2): "+ (str1.equals(str2)));
        System.out.println("str2.equals(str4): "+ (str2.equals(str4)));
    }
}
