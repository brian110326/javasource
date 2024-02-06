package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("13029232382", "Brian", 5000);
    account.withdraw(3000);
    int cur_bal = account.deposit(5000);
    System.out.printf("최신 현재 잔액 : %d원\n", cur_bal);
  }
}
