package account;

public class CheckingAccountEx {

  public static void main(String[] args) {
    CheckingAccount cAccount = new CheckingAccount(
      "1111",
      "Brian",
      50000,
      "1515"
    );

    try {
      cAccount.pay("1515", 4000);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("현재 잔액 : " + cAccount.getBalance());

    CheckingTrafficCard c = new CheckingTrafficCard(
      "2222",
      "B",
      70000,
      "2222",
      true
    );

    try {
      c.payTrafficCard("2222", 4000, true);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("현재 잔액 : " + c.getBalance());

    CreditLineAccount cl = new CreditLineAccount(
      "1111",
      "Brian",
      50000,
      5000000
    );

    try {
      cl.withdraw(2500000);
      System.out.println(cl.getOwner() + " 현재 잔액 : " + cl.getBalance());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
