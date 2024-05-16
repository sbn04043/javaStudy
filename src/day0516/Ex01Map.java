package day0516;

//자바에서 특정 데이터타입의 여러 객체를
//한번에 다루는 클래스는 모두
//Collection이라는 인터페이스를 상속받는다.
//그리고 콜렉션 인터페이스를 상속받는 종류는 다음과 같다.
//1. 리스트(List): 중복이 가능한 배열 형태의 클래스 FIFO(큐)
//2. 셋(Set): 중복이 불가능한 배열 형태의 클래스 LIFO(스택)
//3. 맵(Map): 중복되지 않는 키(Key)를 가지고 LIFO(스택)
//      키는 Set
//  값(Value)을 컨트롤하는 클래스
//  번호(Index) 대신 키 값을 사용한다.

//리스트 셋 맵 모두 인터페이스다.

import types.Student;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        //Student 클래스 변수 선언 및 초기화
        Student s1 = new Student();

        s1.id = 1;
        s1.name = "김철수";
        s1.korean = 80;
        s1.english = 81;
        s1.math = 81;

        s1.printInfo();

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "이영희";
        s2.korean = 90;
        s2.english = 90;
        s2.math = 91;

        s2.printInfo();

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "AAA";
        s3.korean = 90;
        s3.english = 90;
        s3.math = 91;

        //map에 데이터 추가하기: 메소드 put 사용
        //.put(Key, Value)
        map.put("김철수", s1);
        map.put("이영희", s2);
        map.put("AAA", s3);

        //map에서 데이터 가져오기
        //.get(키)
        System.out.println("map.get(\"김철수\").id: " + map.get("김철수").id);
        //존재하지 않는 키값 get
        System.out.println("map.get(\"abc\").id: " + map.get("abc"));

        //같은 키값 삽입
        Student s4 = new Student();
        s4.id = 4;
        s4.name = "ABC";

        //같은 키값으로 입력하면 덮어쓰기가 된다.
        map.put("AAA", s4);
        System.out.println("map.get(\"AAA\").id: " + map.get("AAA"));

        //입력된 값들의 키값 전체 확인하기
        //keySet()
        System.out.println(map.keySet());

        //모든 키값 출력
        for (String k : map.keySet()) {
            System.out.println(map.get(k).id);
        }

        //특정 키 존재 확인
        //.containsKey(키)
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsKey("AAA"));
    }
}
