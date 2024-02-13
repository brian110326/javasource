package exam;

import java.util.Scanner;

public class BankApp {

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
        case 5:
          run = false;
          break;
        case 1:
          BankApp.createAccount();
          break;
        case 2:
          BankApp.accountList();
          break;
        case 3:
          BankApp.deposit();
          break;
        case 4:
          BankApp.withdraw();
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
        // 여기서 accnum을 초기화시켜줌
        accArr[i] = new Account(accnum, name, bal);
        System.out.println("계좌가 생성되었습니다");
        break;
      }
    }
  }

  public static void accountList() {
    // 생성된 계좌목록 보여주기
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        System.out.println(accArr[i].toString());
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
      System.out.println("현재 잔액 : " + account.deposit(addBal));
    }
  }

  public static void withdraw() {
    System.out.println("출금할 계좌번호 입력 : ");
    String findAcc = sc.nextLine();

    System.out.println("출금할 금액 입력 : ");
    int subBal = Integer.parseInt(sc.nextLine());

    Account account = findAccount(findAcc);
    if (account != null) {
      System.out.println("현재 잔액 : " + account.withdraw(subBal));
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
