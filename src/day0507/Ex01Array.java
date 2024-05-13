package day0507;

//배열(Array)
//배열이란, 똑같은 종류의 데이터타입을
//한번에 여러개씩 제어할 수 있는 데이터타입

//배열의 경우, 우리가 다음과 같은 방법으로 선언과 초기화를 한다.
//데이터타입[] 배열이름 = new 데이터타입[길이];
//그리고 배열 안에 각각의 요소(element)에 접근할 때는
//인덱스(Index)를 통해 접근을하게 된다.
//인덱스란, 해당 배열에서 몇번째 요소인지를 가르키는
//번호인데, 사람은 첫번째, 두번째, ... 으로 세지만
//컴퓨터는 0번째부터 세게 된다.
//따라서, 인덱스의 최대 값은 해당 배열의 길이 -1이 된다.
//만약 유효하지 않은 인덱스를 접근하게 된다면
//ArrayIndexOutOfBoundsException 에러가 발생

//배열의 n번째 인덱스에 있는 요소를 접근할 때(값을 저장하거나 호출)에는
//배열이름[n]으로 접근하게 된다.
public class Ex01Array {
    public static void main(String[] args) {
        //int 배열 intArray를 선언하고, 길이 4로 지정
        int length = 4;
        int[] intArray = new int[length];

        //우리가 만든 배열의 0번쨰 요소에 새로운 값 저장
        intArray[0] = 20;

        //기본형 데이터타입의 배열과, 참조형 데이터타입의 다른 점은
        //기본형 데이터타입의 배열은 선언과 초기화가 되면
        //모든 요소는 0으로 초기화 된다.
        //참조형 데이터타입의 배열은 null이라는 값으로 초기화가 된다.

        //또한 배열의 인덱스는 우리가 변수를 넣어서 특정 요소를
        //가르킬 수 있다.
        //그렇다면 우리가 모든 요소의 값을 출력하고 싶다면,
        //어떤 방법을 쓰면 될까?

        //배열의 모든 인덱스를 하나하나 찍어보면
//        System.out.println(intArray[0]);
//        System.out.println(intArray[1]);
//        System.out.println(intArray[2]);
//        System.out.println(intArray[3]);

        //배열 길이는 해당 배열의 length 라는
        //속성 값으로 저장되어있다.
        //어떤 변수 혹은 값의 속성값 또는 메소드를 접근할 때에는
        //변수.속성 or 변수.메소드 로 접근하게 된다.
        //따라서, 배열의 길이를 접근할 때에는
        //배열이름.length 라고 접근을 하게 된다.
        for (int i : intArray) {
            System.out.println(i);
        }

        //null
        //참조형 데이터타입이 가질 수 있는 특정한 상황으로서,
        //스택 영역에 변수에는 주소값이 부여가 됐지만
        //힙 역역 해당 주소에는 초기화가 되지 않아
        //어떠한 값을 호출하거나 메소드를 불러올 수 없는 상황
        //null일 경우, 속성값을 호출하거나 메소드를 호출하려고 하면
        //무조건 NullPointerException 발생

        //String[] stringArray를 선언하고 크기를 3으로 초기화
        String[] stringArray = new String[3];

        //모든 요소 출력
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        //0번째 요소가 "abc"와 같은지 비교
        stringArray[0].equals("abc");

    }
}

