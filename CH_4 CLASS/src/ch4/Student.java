package ch4;

public class Student {

  // 멤버변수(인스턴스 변수, property, 속성) ==> 학생 객체가 가져야하는 특징
  //   String name;
  //   String stud_num;
  //   int age;
  //   String address;
  //   String personal_info;
  //   String phone;

  // 멤버메소드(인스턴스 메소드, 기능)
  //   속성을 변경시킬 수 있도록 메소드 작성

  // 생성자(constructor)
  // 클래스를 객체로 생성할 때 필수로 필요

  String id;
  String name;
  String addr;
  String hp;

  public void changeAddr() {}

  public void changeHp() {}

  public Student() {}
}
