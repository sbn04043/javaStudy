package day0510;

//게시판 프로그램을 작성하시오
//게시글에는
//글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex04HomeWork {
    public static int nextId = 1;
    public static int[] idArray = new int[0];
    public static String[] userNameArray = new String[0];
    public static String[] titleArray = new String[0];
    public static String[] descriptionArray = new String[0];

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String message = "1. 글 작성 2. 게시판 보기 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                viewTitle();
            } else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    public static void insert() {
        String message;

        idArray = ArrayUtil.add(idArray, nextId++);

        message = "작성자가 누구입니까? ";
        String userName = ScannerUtil.nextLine(SCANNER, message);
        userNameArray = ArrayUtil.add(userNameArray, userName);

        message = "글 제목이 무엇입니까? ";
        String title = ScannerUtil.nextLine(SCANNER, message);
        titleArray = ArrayUtil.add(titleArray, title);

        message = "내용을 입력하세요";
        String description = ScannerUtil.nextLine(SCANNER, message);
        descriptionArray = ArrayUtil.add(descriptionArray, description);
    }

    public static void viewTitle() {
        if (idArray.length == 0) {
            System.out.println("게시글이 없습니다 글을 작성해주세요");
            return;
        }

        for (int i = 0; i < idArray.length; i++) {
            System.out.printf("%d. %s\n", idArray[i], titleArray[i]);
        }
        String message;

        message = "보려는 게시글을 입력하세요(0 누르면 뒤로가기)";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 0, nextId);

        if (userChoice != 0)
            viewDescription(userChoice);
    }

    public static void viewDescription(int id) {
        int index = ArrayUtil.indexOf(idArray, id);
        System.out.printf("%d. %s\t\t %s\n", index, titleArray[index], userNameArray[index]);
        System.out.println(descriptionArray[index]);

        String message = "1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
        if (userChoice == 1) {
            fix(id);
            viewDescription(id);
        } else if (userChoice == 2) {
            delete(id);
            viewTitle();
        } else if (userChoice == 3) {
            viewTitle();
        } else {
            viewDescription(id);
        }
    }

    public static void fix(int id) {
        int index = ArrayUtil.indexOf(idArray, id);

        String message = "제목을 입력하세요";
        String title = ScannerUtil.nextLine(SCANNER, message);
        titleArray[index] = title;

        message = "내용을 입력하세요";
        String description = ScannerUtil.nextLine(SCANNER, message);
        descriptionArray[index] = description;
    }

    public static void delete(int id) {
        int index = ArrayUtil.indexOf(idArray, id);
        System.out.println(index);

        idArray = ArrayUtil.remove(idArray, index);
        userNameArray = ArrayUtil.remove(userNameArray, index);
        titleArray = ArrayUtil.remove(titleArray, index);
        descriptionArray = ArrayUtil.remove(descriptionArray, index);
    }
}
