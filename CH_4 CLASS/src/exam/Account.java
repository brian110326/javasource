package exam;

public class Account {

  // 계좌번호, 계좌주, 잔액
  private String accNum;
  private String name;
  private int balance;

  public Account(String accNum, String name, int balance) {
    this.accNum = accNum;
    this.name = name;
    this.balance = balance;
  }

  public Account() {}
}
