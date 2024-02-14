package poly;

public class BuyerEx {

  public static void main(String[] args) {
    // 물건 ==> Tv, Computer, Product
    Buyer buyer = new Buyer();

    // Tv 구매
    buyer.buy(new Tv(3000000));

    // Computer 구매
    buyer.buy(new Computer(1000000));
  }
}
