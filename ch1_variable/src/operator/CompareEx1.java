package operator;

public class CompareEx1 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true or false로 나옴
    int num1 = 10;
    int num2 = 10;
    System.out.println(num1 == num2);
    System.out.println(num1 != num2);
    System.out.println(num1 <= num2);
    System.out.println();

    char ch1 = 'A';
    char ch2 = 'B';
    System.out.println(ch1 == ch2);
    System.out.println(ch1 <= ch2);
    System.out.println(ch1 != ch2);
    System.out.println();

    float f1 = 0.1f;
    double d1 = (float) 0.1d;
    System.out.println(f1 == d1);
    System.out.println(f1 <= d1);
    System.out.println(f1 != d1);
  }
}
