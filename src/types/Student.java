package types;

//구조체를 흉내낸 Student 클래스
//해당 클래스 안에는
//Student 클래스 변수가 어떤 데이터를
//다룰 것인지만 적어주면 된다.

//+ Student 구조체에서 클래스로 업그레이드
//우리가 위에 만들어둔 필드
//+ 학생 클래스 변수가 실행해야할 메소드를 적어주게 된다.
public class Student {
    public int id;
    public String name;
    public int korean;
    public int english;
    public int math;

    public int calculateSum() {
        return korean + english + math;
    }
}
