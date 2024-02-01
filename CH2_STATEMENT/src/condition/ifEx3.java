package condition;

import java.util.Scanner;

public class ifEx3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("점수 입력 : ");
    int score = sc.nextInt();

    if (score % 2 == 0) {
      System.out.println("점수 => 짝수");
    } else {
      System.out.println("점수 => 홀수");
    }
  }
}
