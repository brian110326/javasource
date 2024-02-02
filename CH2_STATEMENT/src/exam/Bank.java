package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int curr_bal = 0;

    while (run) {
      System.out.println();
      System.out.println("-----------------------------------");
      System.out.println("1. 입금  2. 출금  3. 잔고  4. 종료");
      System.out.println("-----------------------------------");

      System.out.println("메뉴 선택 : ");

      int menu = sc.nextInt();

      switch (menu) {
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
        case 1:
          System.out.println("입금할 금액 입력 : ");
          int input_bal = sc.nextInt();
          curr_bal += input_bal;
          break;
        case 2:
          System.out.println("출금할 금액 입력 : ");
          int output_bal = sc.nextInt();
          if (curr_bal < output_bal) {
            System.out.println("출금금액이 현잔액보다 많습니다");
          } else {
            curr_bal -= output_bal;
          }
          break;
        case 3:
          System.out.printf("현재 잔액 : %d원\n", curr_bal);
          break;
        default:
          break;
      }
    }
  }
}
