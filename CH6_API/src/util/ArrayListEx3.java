package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

  public static void main(String[] args) {
    // Member 객체 입력받기
    Scanner sc = new Scanner(System.in);
    List<Member> list = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      System.out.println("ID 입력 : ");
      String id = sc.nextLine();
      System.out.println("Name 입력 : ");
      String name = sc.nextLine();

      Member member = new Member();
      member.setId(id);
      member.setName(name);
      list.add(member);
    }

    for (Member m : list) {
      System.out.println(m);
    }
  }
}
