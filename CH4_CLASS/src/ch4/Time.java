package ch4;

// 시 분 초는 모두 0보다 크거나 같아야한다
// 시의 범위는 0~23 분,초의 범위는 0~59이다
public class Time {

  // 멤버변수, 속성, 필드, 인스턴스 변수
  // 인스턴스 변수 : 인스턴스마다 다른 값 저장 가능 ==> 참조 변수가 없을 때 가바지컬렉터에 의해 자동 제거됨

  private int hour;
  private int minute;
  private float second;

  // 클래스 변수
  private static String max;

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수 : 지역변수
  public void setHour(int hour) {
    if (hour >= 0 && hour < 24) {
      this.hour = hour;
    } else {
      return;
    }
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute >= 0 && minute < 60) {
      this.minute = minute;
    } else {
      return;
    }
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second >= 0 && second < 60) {
      this.second = second;
    } else {
      return;
    }
  }
}
