package interfacetest;

public interface Calc {
  // public static final이 붙어있는 형태 ==> interface내부이기 때문에 생략가능
  double PI = 3.14;
  int ERROR = -9999999;

  // public abstract가 기본
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int multiply(int num1, int num2);
  double divide(int num1, int num2);
}
