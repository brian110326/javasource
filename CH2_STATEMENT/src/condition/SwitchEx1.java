package condition;

import java.util.Scanner;

// if ~ else if 처리 대체 ==> switch
public class SwitchEx1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력 : ");
    int n = sc.nextInt();
    switch (n) {
      case 1:
        System.out.println("a입니다.");
        break;
      case 2:
        System.out.println("b입니다.");
        break;
      default:
        System.out.println("a b 둘다 아닙니다.");
        break;
    }
  }
}
