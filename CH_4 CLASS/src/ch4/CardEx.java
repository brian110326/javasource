package ch4;

public class CardEx {

  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    // static 변수는 변수명으로 직접 참조가능 but class명으로 하는것이 더 일반적
    System.out.println("카드 가로크기 : " + Card.width);
    System.out.println("카드 세로크기 : " + Card.height);
    // System.out.println("카드 가로크기 : " + card2.width);
    // System.out.println("카드 세로크기 : " + card2.height);

    Card.width = 80;
    Card.height = 60;

    CardEx obj = new CardEx();
    obj.method1();
  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
