package ch1;

public class VarByteEx1 {

  public static void main(String[] args) {
    // 데이터 타입(자료형) 변수명(소문자로 시작 / 2개의 단어가 합해진변수 : 두번째 단어 시작을 대문자로)
    // 1. 정수형 => byte(1byte 할당), short(2byte 할당), int(4byte 할당), long(8byte 할당)
    byte age = 10;
    byte maxSpeed = 10;

    short age1 = 10;
    short maxSpeed1 = 10;

    int age2 = 15;
    int maxSpeed2 = 20;

    age = 33;
    // age = 128;
    age = 127;

    long age3 = 123456789L;
    // 숫자L : Long 타입 식별자
    long maxSpeed3 = 1000000000000L;

    System.out.println(age + " , " + maxSpeed);
    System.out.println("나이 : " + age1 + ", 최고속도 : " + maxSpeed1);
    System.out.println("나이 : " + age2 + ", 최고속도 : " + maxSpeed2);
    System.out.println("나이 : " + age3 + ", 최고속도 : " + maxSpeed3);
  }
}
