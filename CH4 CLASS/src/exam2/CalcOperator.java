package exam2;

import java.util.Scanner;

public class CalcOperator extends Calc {

  Scanner sc = new Scanner(System.in);

  public int Add(int a, int b) {
    return a + b;
  }

  public int Sub(int a, int b) {
    return a - b;
  }

  public int Mul(int a, int b) {
    return a * b;
  }

  public int Div(int a, int b) {
    return a / b;
  }

  @Override
  public int calculate() {
    System.out.println("Input Num1 : ");
    int num1 = Integer.parseInt(sc.nextLine());

    System.out.println("Input Num2 : ");
    int num2 = Integer.parseInt(sc.nextLine());

    setValue(num1, num2);

    System.out.println("Input Operator : ");
    String operator = sc.nextLine();

    if (operator.equals("+")) {
      return Add(num1, num2);
    }

    if (operator.equals("-")) {
      return Sub(num1, num2);
    }

    if (operator.equals("*")) {
      return Mul(num1, num2);
    }

    if (operator.equals("/")) {
      return Div(num1, num2);
    } else {
      return 0;
    }
  }
}
