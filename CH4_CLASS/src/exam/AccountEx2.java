package exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    // Account 객체를 담을 배열 생성 3개
    // 입력받기

    Account accArr[] = new Account[3];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < accArr.length; i++) {
      accArr[i] = new Account(null, null, 0);
    }

    for (int i = 0; i < accArr.length; i++) {
      System.out.printf("%d번째 계좌번호 입력 : \n", i + 1);
      String accnum = sc.nextLine();

      System.out.printf("%d번째 이름 입력 : \n", i + 1);
      String name = sc.nextLine();

      System.out.printf("%d번째 잔고 입력 : \n", i + 1);
      int bal = Integer.parseInt(sc.nextLine());

      accArr[i] = new Account(accnum, name, bal);
    }

    for (Account acc : accArr) {
      System.out.println(acc.toString());
    }
  }
}
