package exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("+, - , * , / , % 중 하나를 입력 : ");
    String op = sc.nextLine();

    Scanner sc1 = new Scanner(System.in);
    System.out.println("정수1 입력 : ");
    int num1 = sc.nextInt();

    Scanner sc2 = new Scanner(System.in);
    System.out.println("정수2 입력 : ");
    int num2 = sc.nextInt();

    switch (op) {
      case "+":
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        break;
      case "-":
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        break;
      case "*":
        System.out.printf("%d X %d = %d\n", num1, num2, num1 * num2);
        break;
      case "/":
        if (num2 == 0) {
          System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        break;
      case "%":
        if (num2 == 0) {
          System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.printf("%d % %d = %d\n", num1, num2, num1 % num2);
        break;
      default:
        break;
    }
  }
}
