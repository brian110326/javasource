package exam;

public class Calc {

  // 메소드만 가진 클래스
  // int 타입의 2개의 변수를 받아서 덧셈결과
  public int add(int num1, int num2) {
    int add_result = num1 + num2;
    return add_result;
  }

  public int substract(int num1, int num2) {
    int sub_result = num1 - num2;
    return sub_result;
  }

  public int multiply(int num1, int num2) {
    int mult_result = num1 * num2;
    return mult_result;
  }

  public double division(int num1, int num2) {
    double div_result = (double) num1 / num2;
    return div_result;
  }
}
