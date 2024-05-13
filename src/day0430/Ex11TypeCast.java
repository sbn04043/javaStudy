package day0430;
//형 변환(Type Casting)
//특정 데이터 타입의 값을 다른 데이터 타입으로 바꾸는 것
//형 변환에는 2 종류가 있는데
//암시적 형변환과 명시적 형변환이 있다.

//1. 암시적 형변환(Implicit Type Casting)
//  직접적으로 형변환 시키는 명령어를 적지 않아도
//  인터프리터가 알아서 형변환을 해준다.
//  더 작은 데이터타입의 값을 더 큰 데이터타입으로 변환하거나
//  데이터 손실이 발생하지 않을 경우에
//  암시적 형변환이 발생한다.

//2. 명시적 형변환(Explicit Type Casting)
//  직접적으로 형변환하는 명령어를 적어서
//  강제적으로 형변환을 해주는 것
//  데이터 손실이 발생할 경우
//  반드시 명시적 형변환을 해야한다.
public class Ex11TypeCast {
    public static void main(String[] args) {
        //암시적 형변환
        //  1. byte를 int로
        byte myByte = 127;
        int myInt = myByte;
        System.out.println("myInt: "+myInt);
        //  2. 정수를 실수로 형변환
        double myDouble = myInt;
        System.out.println("myDouble: "+myDouble);

        //명시적 형변환
        //  1. int를 byte로
        //int가 byte보다 범위가 더 커서 error
        //myByte = myInt;
        myByte = (byte)myInt;
        System.out.println("myByte: "+myByte);

        myInt = 200;
        //127보다 값이 넘어가 overflow 발생
        myByte = (byte)myInt;
        System.out.println("myByte: "+myByte);

        //double을 int로
        //double이 int보다 커 error
        //myInt = myDouble;
        myInt = (int)myDouble;
        System.out.println("myInt: "+myInt);

        myDouble = 1.5;
        // 정수를 int로 바꿔 소숫점 아래 자리를 버림
        myInt = (int)myDouble;
        System.out.println("myInt: "+myInt);

        //overflow underflow
        //myByte = 128;
        //myByte = -129;
        myByte = (byte)128;
        System.out.println("128 Overflow myByte: "+myByte);
        myByte = (byte)-129;
        System.out.println("-129 Underflow myByte: "+myByte);
    }
}
