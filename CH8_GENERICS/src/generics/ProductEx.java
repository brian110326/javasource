package generics;

public class ProductEx {

  public static void main(String[] args) {
    Product<Tv, String> product = new Product<>();
    product.setKind(new Tv());
    product.setModel("Smart Tv");

    Product<Car, String> product2 = new Product<>();
    product2.setKind(new Car("Hyundai"));
    product2.setModel("펠리세이드");
  }
}
