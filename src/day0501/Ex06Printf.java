package day0501;

//printf의 다양한 형식
//우리가 필요에 따라서는 printf를 사용해서
//우리가 원하는 내용을 콘솔에 지정한 형식으로 출력이 가능하다.
//단, 우리가 웹 프로그래밍에 들어가게 되면
//더이상 출력하는 곳이 콘솔이 아니기 떄문에
//사용되지 않는다.
public class Ex06Printf {
    public static void main(String[] args) {
        int num = 15;
        //1. 10진법 정수(decimal)
        System.out.println("===============================================");
        System.out.println("1. 10진법 정수");
        //  A. 10진법 정수 그대로 출력
        System.out.printf("1-A. [%d]\n", num);
        //  B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라.
        System.out.printf("1-B. [%5d]\n", num);
        //  C. 10진법 정수를 왼쪽 정렬 5자리로 출력해라.
        System.out.printf("1-C. [%-5d]\n", num);
        //  C. 10진법 정수를 왼쪽 정렬 5자이되
        //      왼쪽 빈 자리는 0을 채워 출력해라.
        System.out.printf("1-C. [%05d]\n", num);

        System.out.println("===============================================");
        //2. 실수(float)
        double d = 3.141592;
        System.out.printf("2. 실수\n");
        //A. 실수 그대로 출력
        System.out.printf("2-A. [%f]\n", d);
        //B. 실수 오른쪽 정렬 10자리로 출력(.도 자릿수 포함)
        System.out.printf("2-B. [%10f]\n", d);
        //C. 실수 왼쪽 정렬 10자리로 출력
        System.out.printf("2-C. [%-10f]\n", d);
        //D. 실수 오른쪽 정렬 10자리로 출력하되
        //  나머지 자리엔 0 출력
        System.out.printf("2-D. [%010f]\n", d);
        //E. 5자리로 설정해도 자릿수가 더 많으면 그대로 출력
        System.out.printf("2-E. [%5f]\n", d);
        //F. 소숫점 2자리까지 출력
        System.out.printf("2-F. [%.2f]\n", d);

        System.out.println("===============================================");
        System.out.printf("3. 스트링\n");
        String str = "abcde";
        //A. 스트링 그대로 출력
        System.out.printf("2-A. [%s]\n", str);
        //B. 스트링 대문자로 출력
        System.out.printf("2-A. [%S]\n", str);
        //C. 오른쪽 정렬 10자리로 출력
        System.out.printf("2-A. [%10s]\n", str);
        //D. 왼쪽 정렬 10자리로 출력
        System.out.printf("2-A. [%-10s]\n", str);
        System.out.println("===============================================");
        //빈자리 채우라는 출력은 안 됨

        //여러 형식을 맞추어 출력한다면?
        System.out.printf("%2d %03d %08d", 1, 2, 3);
        //
    }
}
