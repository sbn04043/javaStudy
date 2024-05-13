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

    public double calculateAverage() {
        return (double) calculateSum() / 3;
    }

    public void printInfo() {
        System.out.printf("%2d. %s\n", id, name);
        System.out.printf("국어: %3d 영어: %3d 수학; %3d\n", korean, english, math);
        System.out.printf("총합: %3d 평균: %6.2f\n", calculateSum(), calculateAverage());
    }

    //파라미터가 있는 생성자
    //생성자의 경우, 리턴 타입을 따로 적지 않고
    //메소드의 이름은 무조건 클래스의 이름과 통일
    public Student(int id, String name, int korean, int english, int math) {
        //만약 메소드에서 파라미터의 이름과
        //필드의 이름이 같을 시,
        //해당 이름을 적으면 무조건 파라미터의 이름이 우선시된다.
        //만약 이러한 경우, 필드의 변수를 지칭하고싶으면
        //필드 앞에 this.필드를 붙여주면
        //해당 클래스 변수의 라는 의미가 되어
        //필드가 지정이 된다.

        //이 생성자를 실행시키는 객체의 필드 안에
        //파라미터 변수들의 현재값을 저장
        this.id = id;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    //파라미터 없는 생성자
    public Student() {
        id = -1;
        name = "입력 안 됨";
        korean = -1;
        english = -1;
        math = -1;
    }

    //equals() 재정의
    //부모 클래스의 메소드를 재정의(override) 할 때,
    //부모 클래스가 적은 메소드의 선언식을 그대로 받아적어야 한다.
    //따라서 public boolean equals(Object obj)라고 적어야 한다.
    @Override // 부모 메소드 선언과 다르면 error
    public boolean equals(Object obj) {
        //자기 자신과 비교하는 경우(주솟값이 같을 때) true
        if (this == obj) return true;

        //파라미터로 들어온 obj가
        //Student 클래스의 객체가 맞으면 코드 실행
        //특정 클래스의 객체인지 확인할 때는
        //instanceof 키워드 사용

        //obj가 Student 클래스인지 확인
        if (obj instanceof Student s) {
            return id == s.id;
        }
        return false;
    }

}
