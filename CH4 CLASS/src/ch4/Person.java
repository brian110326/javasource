package ch4;

import javax.print.attribute.standard.MediaSize.NA;

// 클래스에 final이 붙으면 상속금지
public final class Person {

  // 멤버변수에 final이 붙으면 초기화 반드시 필수(선언, 생성자) ==> 수정불가 : 상수
  private String name;
  private final String NATION;

  // 객체끼리 공유하는 상수
  // 상수는 대문자로
  private static final double PI = 3.141592;
  private static final double PI2 = 3.141592;

  public Person(String name, String NATION) {
    this.name = name;
    this.NATION = NATION;
  }

  public static double getPi() {
    return PI;
  }

  // 메소드에 final이 붙으면 오버라이딩 금지
  public final String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name = " + name + "]";
  }

  public String getNATION() {
    return NATION;
  }
}
