package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    Student2 st = new Student2("20182050", "Brian", "Seoul", "010-2367-8728");
    // private 접근수준 지시자
    //st2.id ==> 이용불가
    System.out.println(st.toString());
    Student2 obj2 = new Student2();
    obj2.setId("2020202020");
    obj2.setName("Park");
    obj2.setAddr("Newyork");
    System.out.println(obj2.toString());
    // 생성자 ==> 멤버변수 초기화

    Student2 obj3 = new Student2("232332", "dfsd", "Seoul");
    System.out.println(obj3.toString());

    st.changeAddr("Busan");
    st.changeHp("010-1111-2222");

    System.out.println(st.toString());
  }
}
