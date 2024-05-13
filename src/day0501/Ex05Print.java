package day0501;
//자바 콘솔에서 출력 하는 3가지 방법
//1. print()
//  괄호 안의 내용 그대로 출력
//2. println(): print a line
//  괄호 안의 내용 출력하고 줄바꿈
//3. printf(): print in format
//  괄호 안의 내용을 지정된 형식으로 출력
public class Ex05Print {
    public static void main(String[] args) {
        //출력할 내용을 담은 String 변수 str1 str2 만들고
        //각각 "ABCDE" "fghij"로 초기화
        String str1 = new String("ABCDE");
        String str2 = new String("fghij");

        //print(): 그냥 출력
        System.out.print(str1);
        System.out.print(str2);
        System.out.println();

        //println(): 출력하고 줄바꿈
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        //printf():
        System.out.printf("%s", str1);//%s: String 그대로 출력
        System.out.printf("%S", str2);//%S: 대문자로 바꿔 출력
        System.out.println();

        //이스케이프 문자
        //이스케이프 문자란 줄바꿈, 탭공백 등의 공백과
        //특수한 의미를 가진 기호를 입력할 때 사용되는
        //한개의 char 문자이다.
        //이스케이프 문자는 \ + char로 이루어지는데
        //우리가 볼 때는 2글자지만 컴퓨터는 1글자로 인식

        //1. 줄바꿈문자(\n)
        System.out.print(str1+'\n');
        System.out.print(str2+'\n');
        System.out.println("1번째줄\n2번째줄");

        //2. 탭공백(\t)
        System.out.println("1번째 문장\t2번째 문장\t");
        
        //3. 따옴표(\'), 쌍따옴표(\"), 역슬러시(\\) 그대로 출력
        System.out.println("\"내 사전에 불가능은 없다\" - 나폴레옹");
    }
}
