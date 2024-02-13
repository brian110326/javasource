package account;

// 은행 + 보너스포인트(예금을 할때마다), 예금액의 0.1%를 포인트로 제공

public class BonusPointAccount extends Account {

  private int bonusPoint;

  public BonusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bonusPoint
  ) {
    super(accountNo, owner, balance);
    this.bonusPoint = bonusPoint;
  }

  @Override
  public void deposit(int amount) {
    super.deposit(amount);

    double total = getBalance() + (amount * 0.001);
    System.out.println("현재 잔액 : " + total);
  }

  public int getBonusPoint() {
    return bonusPoint;
  }
}
