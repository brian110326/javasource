package ch1;

// 자동 형변환 : Promotion
// 정수형/문자형/실수형/논리형
// 타입변환 가능함 : 작은 타입 --> 큰타입으로

public class PromotionEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        int intValue = v1;
        System.out.println("intValue : " + intValue);

        short s1 = 15;
        intValue = s1;
        System.out.println("intValue : " + intValue);

        char ch1 = 'a';
        intValue = ch1;
        System.out.println("intValue : " + intValue);

        //int(4byte) => float(4byte)
        // float type이 int보다 더 정밀한 수를 표현하기 때문에 float가 int보다 큼
        float floatValue = intValue;
        System.out.println("floatValue : " + floatValue);

        //8byte
        long longValue = intValue ;
        double doubleValue = intValue;
        System.out.println("longValue : " + longValue);
        System.out.println("doubleValue : " + doubleValue);

        // int + double
        intValue = 55;
        doubleValue = 98.25d;
        double result = intValue + doubleValue;
        System.out.println("int형 + double형 = " + result);

        byte v2 = 15;
        int byteValue = v1 + v2; // 정수를 변수에 담는다면 int 사용
        // byte끼리 사칙연산하면 어차피 int형으로 바뀜
        // 연산시 타입변환이 일어남 : 작은타입 => 큰 타입
    }
}
