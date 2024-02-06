package exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodsStock goodsStock = new GoodsStock("p1011", 50);
    goodsStock.addStock(50);
    goodsStock.subStock(30);

    int stockNum = goodsStock.addStock(20);
    System.out.println("현재 재고 수량 : " + stockNum);
  }
}
