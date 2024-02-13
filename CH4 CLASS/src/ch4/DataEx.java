package ch4;

public class DataEx {

  public static void main(String[] args) {
    Data data = new Data();
    // x 변수 초기화
    data.x = 15;

    //change(data.x);
    change2(data);
    System.out.println("x의 값 : " + data.x);
  }

  // 메소드를 호출할 때 매개변수로 지정한 값을 메소드의 매개변수에 복사
  // 매개변수 타입 ==> 1) 기본형  2) 참조형
  // 기본형 매개변수 : 변수의 값을 읽기만 가능
  // 참조형 매개변수 : 변수의 값을 읽고 변경 가능

  // 기본형 타입 : int long char boolean float double
  // 참조형 타입 : 배열, 클래스
  public static void change(int x) {
    x = 20;
  }

  public static void change2(Data obj) {
    obj.x = 20;
  }
}
