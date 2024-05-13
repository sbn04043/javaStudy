package day0502;
//switch 조건문
//switch 조건문은 값이 명확하게 변화하는
//변수 혹은 연산의 결과값을 선택하여
//해당 값의 결과에 따라서 특정 코드를 실행시키도록
//만들어주는 제어문이다.

//double 사용 불가 부동 소수점 때문
public class Ex06Switch {
    public static void main(String[] args) {
        //switch 조건문에서 사용할 int 변수
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("해당하는 값이 없다.");
                break;
        }

        //나이에 따라 유치원 초등학생 중학생 고등학생 대학생 성인
        //출력하는 코드를 작성하기엔 너무 귀찮다.
        //switch에 범위를 못 씀.
    }
}
