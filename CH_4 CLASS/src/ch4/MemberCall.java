package ch4;

public class MemberCall {

  int iv = 10;
  static int cv = 20;

  // 클래스 메소드
  public static void staticMethod() {
    // static 변수는 바로 로딩이됨 but 멤버변수는 아직 로딩 X
    // 멤버변수 ==> 인스턴스 생성을 해야 로딩됨
    // System.out.println(iv);
    System.out.println(cv);
  }

  public void instanceMethod() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
