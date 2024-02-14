package poly;

public class Buyer {

  int money = 1000000000;
  int bonusPoint = 0;

  //   public void buy(Tv tv) {
  //     if (money < tv.price) {
  //       System.out.println("구매불가");
  //       return;
  //     }
  //     money -= tv.price;
  //     money += tv.bonusPoint;
  //     System.out.println(tv + " 제품을 구매하셨습니다.");
  //   }

  //   public void buy(Computer computer) {
  //     if (money < computer.price) {
  //       System.out.println("구매불가");
  //       return;
  //     }
  //     money -= computer.price;
  //     money += computer.bonusPoint;
  //     System.out.println(computer + " 제품을 구매하셨습니다.");
  //   }

  public void buy(Product p) {
    if (money < p.price) {
      System.out.println("구매불가");
      return;
    }
    money -= p.price;
    money += p.bonusPoint;
    System.out.println(p + " 제품을 구매하셨습니다.");
    System.out.println("현재 잔액 : " + money);
  }
}
