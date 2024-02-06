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

  // Data data ==> 주소값이 stack영역에 저장되어있음
  // new Data() ==> heap영역에 저장되어있음
  // 매개변수 int x ==> x라는 변수에 15라는 값 저장
  // x = 20으로 변경한다해도 x저장공간에 값이 20으로 변경 ==> data stack영역은 변화X
  public static void change(int x) {
    x = 20;
  }

  public static void change2(Data obj) {
    obj.x = 20;
  }
}
