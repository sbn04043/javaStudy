package day0430;

//상수(Constant)
//상수란, 한번 값이 초기화가 되면
//더이상 새로운 값을 저장할 수 없는 공간을 뜻한다.
//상수의 경우, 선언할 때 맨 앞에 final 이라는 키워드를
//붙여주면 해당 공간은 상수로 설정이 된다.
public class Ex06Constant {
    public static void main(String[] args) {
        // 상수 MY_NUMBER 선언
        final int MY_NUMBER = 5;
        System.out.println("MY_NUMBER: "+MY_NUMBER);

        //상수 MY_NUMBER 값 변경하려고 하면 error(상수라서)
        //MY_NUMBER = 10;

        //같은 값을 저장해도 안 됨(컴퓨터는 무조건 덮어쓰기)
        //MY_NUMBER = 5;
    }
}
