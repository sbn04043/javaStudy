package algorithm.sort;

public class TestPage {
    public static void main(String[] args) {
        // 문자열 배열 생성
        String[] stringArray = {"Java", "Programming", "Language"};

        // 이중 문자 배열 생성
        char[][] charArray = new char[stringArray.length][];

        // 문자열 배열을 이중 문자 배열로 변환
        for (int i = 0; i < stringArray.length; i++) {
            charArray[i] = stringArray[i].toCharArray();
        }

        // 결과 출력
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("String: " + stringArray[i]);
            System.out.print("CharArray: ");
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
