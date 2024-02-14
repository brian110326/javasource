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

  // 입금
  public int deposit(int add) {
    balance += add;
    return balance;
  }

  // 출금
  public int withdraw(int sub) {
    balance -= sub;
    return balance;
  }

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return (
      "Account [accNum=" +
      accNum +
      ", name=" +
      name +
      ", balance=" +
      balance +
      "]"
    );
  }
}
