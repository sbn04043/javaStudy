package day0508;

//Method(메소드)
//우리가 반복적으로 실행되는 코드를
//좀 더 간단하게 실행시키기 위하여
//코드를 모아 하나의 명령어로 묶은 것이다.
//이렇게 하나로 묶여있다면 해당 코드를
//다시 적어줄 필요 없이 해당 메소드 이름만으로
//그 코드들을 실행시킬 수 있다.

//메소드는 다음과 같은 형식을 가지게 된다.
//public static 리턴타입 메소드이름(파라미터) {
//  해당 메소드가 실행시킬 코드
//}

//public, static: 일단은 지금 단계에서는 무조건 써주기
//리턴 타입: 해당 메소드를 실행시킨 곳으로 보내줄 값의 데이터타입
//  아무런 값도 보내지 않는 다면 void라고 적는다.
//  리턴 타입이 존재할 경우, 해당 메소드는 반드시
//  return이라는 명령을 통해서 해당 타입의 값을
//  보내주는 코드가 있어야 한다.
//메소드 이름: 소문자로 시작하고 낙타등 표기법을 사용하는 동사
//파라미터: 해당 메소드를 실행시킬 때 외부에서 어떤 값이 필요할 경우
//  우리가 파라미터에 변수를 선언하듯이 적어주게 된다.
//  그러면 해당 메소드는 그 외부의 값을 변수로 사용할 수 있다.

//오버로딩(Overloading)
//어떤 특정 목정을 가진 메소드들을 만들어야 할 경우
//이름을 다르게하지 않고 이름을 통일시켜
//알아보기 쉽게 만드는 방법
//파라미터 순서가 달라야 한다.

public class Ex03Method {
    public static void main(String[] args) {
        int a = 10;
        int myNumber = 3000;

        System.out.println("==============================");
        //printUserNumber(int userNumber) 호출
        printUserNumber(a);
        printUserNumber(myNumber);
        printUserNumber(450);

        System.out.println("==============================");
        //returnEighty() 호출
        //returnEighty(); //return값을 받을 변수가 없음.
        //returnEighty() 리턴 값을 받을 변수 eighty 선언
        int eighty = returnEighty();
        System.out.println("returnEighty() 메소드가 전해준 값: " + eighty);
        System.out.println(returnEighty()); //도 가능
        printUserNumber(eighty);

        System.out.println("==============================");
        //cal2Num(int a, int b) 호출
        int res = cal2Num(a, eighty);
        System.out.println(res);
        System.out.println("==============================");

    }

    //내가 int값을 보내면
    //화면에 "사용자가 보낸 int 값"이라고
    //표시해주는 메소드를 호출해보자.
    public static void printUserNumber(int userNumber) {
        //int printUserNumber 메소드에 있는 myNumber = main에 있는 myNumber
        //int printUserNumber 메소드에 있는 myNumber = main에 있는 a
        System.out.println("사용자가 보낸 값: " + userNumber);
    }

    //사용자가 호출하면
    //80을 돌려주는 메소드
    public static int returnEighty() {
        return 80;
    }

    //사용자가 2개의 값을 보내주면
    //두 값의 산술연산자의 결과값을 화면에 출력하고
    //둘 중 더 큰 값을 돌려주는 메소드
    public static int cal2Num(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        System.out.println("a와 b의 합: " + (a + b));
        System.out.println("a와 b의 차: " + (a - b));
        System.out.println("a와 b의 곱: " + (a * b));
        System.out.println("a와 b의 몫: " + (a / b));
        System.out.println("a와 b의 나머지: " + (a % b));

        //return a > b ? a : b;
        return Math.max(a, b);
    }
}
