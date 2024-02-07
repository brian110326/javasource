package exam;

import java.util.Scanner;

public class PracticeBankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "------------------------------------------------------- "
      );
      System.out.println(
        "1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료"
      );
      System.out.println(
        "-------------------------------------------------------"
      );
      System.out.print("메뉴 선택 : ");

      int num = Integer.parseInt(sc.nextLine());
    }
  }

  public static void createAccount() {}

  public static void accountList() {}

  public static void deposit() {}

  public static void withdraw() {}
}
