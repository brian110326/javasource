package exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    // 근무 시간 입력받은 후
    // 1시간당 9800원
    // 8시간이 넘어가면 시간외 수당 : 원래 받는 금액 * 1.5
    Scanner sc = new Scanner(System.in);
    System.out.println("근무 시간 입력 : ");
    int hour = sc.nextInt();

    int pay = 9800;

    if (hour <= 8) {
      System.out.printf("오늘 받는 임금은 %d원\n", hour * pay);
    } else {
      System.out.printf(
        "오늘 받는 금액은 %f원\n",
        (8 * pay) + ((hour - 8) * 1.5 * pay)
      );
    }
  }
}
