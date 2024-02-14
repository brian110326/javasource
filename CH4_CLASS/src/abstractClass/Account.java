package abstractClass;

// 추상 클래스
// 미완성 설계도 ==> 자식 클래스에서 완성시키는 개념
// 추상 메소드
// 추상 클래스 ==> 인스턴스 생성 불가

// 클래스 : 완성 설계도
public abstract class Account {

  // 멤버변수
  private String accountNo;

  // 메소드
  public void deopsit() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  public Account() {}

  // 추상메소드 ==> 중괄호 X
  public abstract void print();
}
