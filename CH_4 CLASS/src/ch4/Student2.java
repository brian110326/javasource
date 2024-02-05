package ch4;

// 메소드 작성 규칙
// 타입 메소드명(){}
// return type : int, double, boolean, String, char, void
// 메소드 ==> 함수

public class Student2 {

  private String id;
  private String name;
  private String addr;
  private String hp;

  public void changeAddr(String new_addr) {
    // addr의 값을 변경
    addr = new_addr;
  }

  public void changeHp(String new_hp) {
    hp = new_hp;
  }

  Student2() {}

  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id = " +
      id +
      ", name = " +
      name +
      ", addr = " +
      addr +
      ", hp = " +
      hp +
      "]"
    );
  }
}
