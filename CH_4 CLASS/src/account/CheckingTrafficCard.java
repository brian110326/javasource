package account;

// 은행 : Account
// 은행 + 체크카드 : CheckingAccount

// 은행계좌 기능 + 체크카드 기능 + 추가적으로 교통카드 기능

public class CheckingTrafficCard extends CheckingAccount {

  private boolean hasTrafficCard;

  public CheckingTrafficCard(
    String accountNo,
    String owner,
    int balance,
    String cardNo,
    boolean hasTrfficCard
  ) {
    super(accountNo, owner, balance, cardNo);
    this.hasTrafficCard = hasTrafficCard;
  }

  // 예금 출금 => 부모클래스 제공(Account)
  // 카드사용금액 지불 => pay() : CheckingAccount
  // 추가기능 ==> 교통비 지불 : payTrafficCard(cardNo, amount)
  // 카드번호 일치하는지, 잔액이 사용금액보다 많은지, 교통카드기능이 되는지

  public void payTrafficCard(String cardNo, int amount, boolean hasTrafficCard)
    throws Exception {
    if (!hasTrafficCard) {
      throw new Exception("지불불가");
    }
    pay(cardNo, amount);
  }
}
