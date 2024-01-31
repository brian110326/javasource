package operator;

// 산술연산자 : +, - , * , / , %(나머지 연산자)
public class ArithmeticEx1 {

  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 2;

    int result = num1 + num2;
    System.out.printf("result = %d\n", result);

    int result2 = num1 - num2;
    System.out.printf("result2 = %d\n", result2);

    int result3 = num1 * num2;
    System.out.printf("result3 = %d\n", result3);

    int result4 = num1 / num2;
    System.out.printf("result4 = %d\n", result4);

    int result5 = num1 % num2;
    System.out.printf("result5 = %d\n", result5);

    double d1 = 6.0d;
    int d2 = 4;

    double r1 = d1 / d2;
    System.out.printf("r1 = %f\n", r1);

    double r2 = d1 % d2;
    System.out.printf("r2 = %f\n", r2);

    char ch1 = 'A' + 1; // 일반값에는 산술연산자가 있어 자동 형변환됨 : 'A' + 1 => 65 + 1 = 66 => 66을 'B'로 자동 형변환
    char ch2 = (char) (ch1 + 1);
    System.out.printf("ch1 = %c\n", ch1);
    System.out.printf("ch2 = %c\n", ch2);
  }
}
