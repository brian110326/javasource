package exception;

public class Account {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  // new Exception() : 컴파일 예외
  // new RuntimeException() : 런타임 예외
  public void withdraw(int money) throws BalanceInsufficientException {
    if (balance < money) {
      // withdraw 호출하는 쪽에서 해결해라
      throw new BalanceInsufficientException("잔액 부족");
    }
  }
}
