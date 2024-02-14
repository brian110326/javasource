package shop;

import java.util.Scanner;

public class MyShop implements IShop {

  private Customer customers[] = new Customer[5];
  private Product products[] = new Product[5];
  private String title;
  private int customerNo;

  // 장바구니
  private Product carts[] = new Product[5];

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    Customer customer1 = new Customer();
    customer1.setName("Brian");
    customer1.setPayType(PayType.CARD);
    customers[0] = customer1;

    Customer customer2 = new Customer();
    customer2.setName("Emily");
    customer2.setPayType(PayType.CASH);
    customers[1] = customer2;

    Customer customer3 = new Customer();
    customer3.setName("Ricardo");
    customer3.setPayType(PayType.CARD);
    customers[2] = customer3;

    Customer customer4 = new Customer();
    customer4.setName("Adrian");
    customer4.setPayType(PayType.CARD);
    customers[3] = customer4;

    Customer customer5 = new Customer();
    customer5.setName("Shyna");
    customer5.setPayType(PayType.CASH);
    customers[4] = customer5;
  }

  @Override
  public void genProduct() {
    // 제품 생성
    Product product1 = new SmartTv("LGTV", 1000000, "4K");
    products[0] = product1;

    Product product2 = new SmartTv("SAMSUNGTV", 1200000, "8K");
    products[1] = product2;

    Product product3 = new SmartTv("APPLETV", 2000000, "ULTRA 4K");
    products[2] = product3;

    Product product4 = new Cellphone("IPHONE15 PRO MAX", 1700000, "APPLE");
    products[3] = product4;

    Product product5 = new Cellphone("IPHONE13 PRO", 1350000, "APPLE");
    products[4] = product5;
  }

  @Override
  public void start() {
    System.out.println(title + "메인화면 - 계정선택");
    System.out.println("================================");
    for (int i = 0; i < customers.length; i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        customers[i].getName(),
        customers[i].getPayType()
      );
    }
    System.out.println("[x] 종료");

    // 사용자로부터 몇번고객인지 선택(입력)
    System.out.println("고객 번호 입력 : ");
    String cNo = sc.nextLine();
    System.out.println("### " + cNo + " 고객 선택 ###");

    customerNo = Integer.parseInt(cNo);

    if (cNo.equals("x")) {
      System.out.println("프로그램 종료");
      System.exit(0);
    } else {
      productList();
    }
  }

  public void productList() {
    // 상품 목록 출력
    System.out.println(title + "상품목록 - 상품선택");
    System.out.println("==============================");

    for (int i = 0; i < products.length; i++) {
      System.out.printf("[%d] ", i);
      products[i].printDetail();

      System.out.println();
    }

    System.out.println();

    System.out.println("[h] 메인화면");
    System.out.println("[c] 체크아웃");

    System.out.println();

    System.out.println("상품 번호 입력 : ");
    String menu = sc.nextLine();

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: //0~4에 해당하는 제품을 장바구니에 추가
        for (int i = 0; i < carts.length; i++) {
          if (carts[i] == null) {
            carts[i] = products[Integer.parseInt(menu)];
            break;
          }
        }
        productList();
    }
  }

  public void checkOut() {
    int sum = 0;
    System.out.println(title + " : 체크아웃");
    System.out.println("=====================================");

    for (int i = 0; i < carts.length; i++) {
      if (carts[i] != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i,
          carts[i].getPname(),
          carts[i].getPrice()
        );
        sum += carts[i].getPrice();
      }
    }

    System.out.println("=====================================");

    System.out.println("합계 : " + sum);

    System.out.println("결제 방법 : " + customers[customerNo].getPayType());

    System.out.println();

    System.out.println("[p] : 이전");
    System.out.println("[q] : 결제");

    String menu = sc.nextLine();
    switch (menu) {
      case "p":
        productList();
        break;
      case "q":
        System.out.println("결제가 완료되었습니다. 종료합니다.");
        System.exit(0);
        break;
      default:
        break;
    }
  }
}
