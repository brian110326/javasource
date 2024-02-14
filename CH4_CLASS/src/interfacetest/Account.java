package interfacetest;

// interface
// 모든 멤버 변수는 public, static & final 형태
// 모든 멤버 메소드는 public abstract ==> abstract 생략가능
// 추상화가 높은 상태(기본 설계도)
// body를 가진 메소드는 static이거나 default만 가능(1.8 ver부터 추가된 기능)

public interface Account {
  // only public, static & final
  //private String accountNo; ==> 멤버변수 선언 불가

  public static final int SPADE = 4;

  public void deposit();

  static void getCardKind() {}

  default void getCard() {}
}
