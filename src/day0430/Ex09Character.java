package day0430;
//기본형 데이터타입 03. 문자형
//char: 해당 공간의 1개의 글자 저장(1byte = 0~255)
//값을 저장할 때에는 값을 ' '로 감싸준다.
//char는 ASKII코드를 사용하기 때문에 숫자로 글자를 표현할 수 있다.
public class Ex09Character {
    public static void main(String[] args) {
        //65는 ASKII코드에서 'A'다.
        char myChar = 65;
        System.out.println(myChar);

        myChar = 'a';
        System.out.println((int)myChar);
    }
}
