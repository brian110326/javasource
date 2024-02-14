package ch4;

public class MyMath {

  private long num1, num2;

  public MyMath(long num1, long num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public long add(int a) {
    return num1 + num2;
  }

  public long subtract() {
    return num1 - num2;
  }

  public long multiply() {
    return num1 * num2;
  }

  public long divide() {
    return num1 / num2;
  }

  public static long add(long num1, long num2) {
    return num1 + num2;
  }

  public static long subtract(long num1, long num2) {
    return num1 - num2;
  }

  public static long multiply(long num1, long num2) {
    return num1 * num2;
  }

  public static long divide(long num1, long num2) {
    return num1 / num2;
  }
}
