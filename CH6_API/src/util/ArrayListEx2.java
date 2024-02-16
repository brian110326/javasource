package util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member member = new Member();
    member.setId("Lee123");
    member.setName("Brian");

    list.add(member);

    Member member2 = new Member();
    member2.setId("Jeong123");
    member2.setName("Emily");

    list.add(member2);

    Member member3 = new Member();
    member3.setId("Kim123");
    member3.setName("Shyna");

    list.add(member3);

    Member member4 = new Member();
    member4.setId("Kim123");
    member4.setName("Shyna"); //중복 허용

    for (Member m : list) {
      //System.out.println(m);
      System.out.println("ID : " + m.getId());
      System.out.println("Name : " + m.getName());
    }

    for (int i = 0; i < list.size(); i++) {
      Member m = list.get(i);

      System.out.println("ID : " + m.getId());
      System.out.println("Name : " + m.getName());
    }
  }
}
