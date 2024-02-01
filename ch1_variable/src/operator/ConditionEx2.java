package operator;

import java.util.Scanner;

public class ConditionEx2 {

  public static void main(String[] args) {
    // 숫자 입력 받은 후 그 숫자가 양수인지 음수인지 판별
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력 : ");
    int num = sc.nextInt();

    if (num > 0) {
      System.out.println("양수");
    } else if (num < 0) {
      System.out.println("음수");
    }

    System.out.println((num % 2 == 0) ? "짝수" : "홀수");

    char ch1 = 'a';
    // ch1이 영문자이거나 1~9 사이의 숫자인지 판별
    System.out.println(
      (
        ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) ||
          (ch1 >= 1 && ch1 <= 9)
          ? "true"
          : "false"
      )
    );
  }
}
