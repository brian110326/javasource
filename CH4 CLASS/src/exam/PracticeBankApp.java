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

      switch (num) {
        case 1:
          PracticeBankApp.createAccount();
          break;
        case 2:
          PracticeBankApp.accountList();
          break;
        case 3:
          PracticeBankApp.deposit();
          break;
        case 4:
          PracticeBankApp.withdraw();
          break;
        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }

  public static void createAccount() {
    System.out.println("계좌번호 입력 : ");
    String accnum = sc.nextLine();

    System.out.println("이름 입력 : ");
    String name = sc.nextLine();

    System.out.println("잔고 입력 : ");
    int bal = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accnum, name, bal);
        break;
      }
    }
  }

  public static void accountList() {
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        System.out.println(accArr[i].toString());
        break;
      }
    }
  }

  public static void deposit() {
    System.out.println("입금할 계좌번호 입력 : ");
    String findAcc = sc.nextLine();

    System.out.println("입금할 금액 입력 : ");
    int addBal = Integer.parseInt(sc.nextLine());

    Account account = findAccount(findAcc);

    if (account != null) {
      System.out.println("현재 금액 : " + account.deposit(addBal));
    }
  }

  public static void withdraw() {
    System.out.println("출금할 계좌번호 입력 : ");
    String findAcc = sc.nextLine();

    System.out.println("출금할 금액 입력 : ");
    int subBal = Integer.parseInt(sc.nextLine());

    Account account = findAccount(findAcc);

    if (account != null) {
      System.out.println("현재 금액 : " + account.withdraw(subBal));
    }
  }

  public static Account findAccount(String findAcc) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccNum().equals(findAcc)) {
          return account;
        }
      }
    }
    return null;
  }
}
