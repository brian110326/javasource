package account;

// 기존 은행 기능 + 체크카드 기능

public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo;
  }

  // pay(String cardNo, int amount)
  // cardNo가 일치하는지 확인, 사용금액이 잔액보다 적은지 확인
  // 일치하지 않으면 지불불가
  // 조건 다 만족하면 잔액 - 사용금액

  public void pay(String cardNo, int amount) throws Exception {
    if (this.cardNo.equals(cardNo) && (amount <= getBalance())) {
      //setBalance(getBalance() - amount);
      withdraw(amount);
    } else {
      throw new Exception("지불불가");
    }
  }

  public String getCardNo() {
    return cardNo;
  }
}
