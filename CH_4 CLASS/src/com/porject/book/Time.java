package com.porject.book;

// 접근수준 지시자 ==> 클래스, 멤버변수, 메소드, 생성자
// private : 같은 클래스내에서만 접근 가능
// default : 같은 패키지내에서만 접근 가능(아무것도 안 붙는 경우)
// protected : 같은 패키지내 + 다른패키지의 자손 클래스 접근 가능
// public : 접근 제한 X

// 대상에 따라 사용할 수 있는 접근 제어자
// 클래스 => public or default
// 메소드, 멤버변수 => 4개 다 씀

// public > protected > default > private
public class Time {

  private int hour;
  private int minute;
  private int second;

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) {
      return;
    }
    this.hour = hour;
  }

  // 다른클래스에서는 접근 금지 but 이 클래스 내부에서만 사용
  private void print() {}
}
