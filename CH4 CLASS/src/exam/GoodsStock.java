package exam;

public class GoodsStock {

  // 속성 : 상품코드(p1011), 재고수량(300)
  private String prodCode;
  private int stockNum;

  public GoodsStock(String prodCode, int stockNum) {
    this.prodCode = prodCode;
    this.stockNum = stockNum;
  }

  // 재고수량 추가
  public int addStock(int addAmount) {
    stockNum += addAmount;
    return stockNum;
  }

  // 재고수량 감소
  public int subStock(int subAmount) {
    stockNum -= subAmount;
    return stockNum;
  }
}
