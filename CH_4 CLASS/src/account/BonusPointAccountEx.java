package account;

public class BonusPointAccountEx {

  public static void main(String[] args) {
    BonusPointAccount b = new BonusPointAccount("1111", "Brian", 5000, 500);

    b.deposit(100000);
  }
}
