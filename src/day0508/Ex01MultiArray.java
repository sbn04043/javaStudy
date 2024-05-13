package day0508;

//다차원 배열
//우리가 배열의 정의를 다시 살펴보자면
//똑같은 데이터타입 여러개를 모아둔 하나의 데이터타입
//즉, 배열 여러개를 모아둔 배열도 우리가 만들 수 있다.
//배열을 모아둔 배열을 2차원, 3차원, ... 배열이라고 한다.
//다차원 배열의 경우 선언과 초기화를 할 시, 다음과 같이 한다.
//데이터타입[][] 배열이름 = new 데이터타입[갯수][갯수]

//프로젝트 개발 5단계: 요구사항분석 설계 구현 테스트 유지보수

public class Ex01MultiArray {
    public static void main(String[] args) {
        //각 배열의 길이가 3이고
        //그러한 배열이 5개 모인
        //int형 2차원 배열 선언
        int[][] multiArray1 = new int[5][3];

        //multiArray 0번째 인덱스에 있는 것은?
        System.out.println(multiArray1);
        System.out.println(multiArray1[0]);
        System.out.println(multiArray1[1]);
        System.out.println(multiArray1[2]);
        //multiArray는 int배열이 모여있는 배열 0번째 인덱스를
        //가르키면 0번째 요소가 가르키는 주소값을 가지고 있다.

        //만약 우리가 multiArray1의 2번째 요소의
        //1번째 요소를 가르키고 싶다면
        //다음과 같이 적는다.
        System.out.println(multiArray1[1][0]);

        //우리가 만약 2차원 배열의 내용을 전부 출력하고 싶다면
        //무엇을 써야 할까? 중첩 for문

        System.out.println("====================================");
        for (int i = 0; i < multiArray1.length; i++) {
            for (int j = 0; j < multiArray1[i].length; j++) {
                System.out.printf("[%d][%d]=%d\t", i, j, multiArray1[i][j]);
            }
            System.out.println();
        }
        System.out.println("====================================");

        for (int[] arr : multiArray1) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("====================================");

        //가변형 배열
        //2차원 이상의 배열에서
        //몇개가 모여있는 배열인지를 지정하지만
        //각 배열의 길이는 사용할 때 따로 지정을 해서
        //길이가 다른 배열을 모아두는 방법.

        //int배열 4개 모여있는 2차원 배열 multiArray2
        int[][] multiArray2 = new int[4][];
        System.out.println(multiArray2);
        System.out.println(multiArray2[0]);
        System.out.println(multiArray2[1]);
        System.out.println(multiArray2[2]);

        //즉, 우리가 처음에 모여있는 각 배열의 길이까지 초기화한 경우,
        //하나하나의 배열은 전부 다 new int[3]이 실행돼 null이 아니지만
        //우리가 길이를 따로 정하지 않았을 때는
        //초기화를 한번씩 더 해줘야 한다.
        System.out.println("====================================");
        //multiArray 0번째 배열은 크기가 3인 배열로 초기화
        //1번째 배열은 7, 2번째는 10으로, 3번째는 5로 초기화
        multiArray2[0] = new int[3];
        multiArray2[1] = new int[7];
        multiArray2[2] = new int[10];
        multiArray2[3] = new int[5];
        //각각의 길이 출력
        for (int[] arr : multiArray2) {
            System.out.printf("배열 길이: %d\n", arr.length);
        }
        System.out.println("====================================");

        for (int i = 0; i < multiArray2.length; i++) {
            System.out.printf("%d번째 배열: %d\n", i, multiArray2[i].length);
        }
        System.out.println("====================================");




    }


}
