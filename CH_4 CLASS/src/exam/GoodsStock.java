package exam;

public class GoodsStock {

  // 속성 : 상품코드(p1011), 재고수량(300)
  private String prodCode;
  private int stockNum;

  public GoodsStock(String prodCode, int stockNum) {
    this.prodCode = prodCode;
    this.stockNum = stockNum;
  }

  public GoodsStock() {}
}
