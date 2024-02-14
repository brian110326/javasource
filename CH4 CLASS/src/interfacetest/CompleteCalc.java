package interfacetest;

public class CompleteCalc extends Calculator {

  @Override
  public int multiply(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public double divide(int num1, int num2) {
    return (double) num1 / num2;
  }

  public void showInfo() {
    System.out.println("Calc 인터페이스 구현");
  }
}
