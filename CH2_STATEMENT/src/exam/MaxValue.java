package exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    // 숫자 3개를 입력 받은 후 3개 중 가장 큰 수 출력
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자 3개 입력 : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if (num1 >= Math.max(num3, num2)) {
      System.out.println("가장 큰 수는 : " + num1);
    } else if (num2 >= Math.max(num1, num3)) {
      System.out.println("가장 큰 수는 : " + num2);
    } else {
      System.out.println("가장 큰 수는 : " + num3);
    }

    // 가장 작은 수
    int min = num1;
    if (min > num2) {
      min = num2;
    }
    if (min > num3) {
      min = num3;
    }
    System.out.println("가장 작은 수는 : " + min);
  }
}
