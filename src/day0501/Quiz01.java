package day0501;

public class Quiz01 {
    public static void main(String[] args) {
        //배운 것을 토대로 직접 해보자.
        //결과물
        //이름: ### 나이: 0##세
        //국어: 0##점 영어: 0##점 수학:0##점
        //총점: 0##점 평균: 0##.##점

        String name = "김준수";
        int age = 26;
        int korean = 90, english = 85, math = 87;
        int sum = korean + english + math;
        double average = sum / 3.0;

        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

    }
}
