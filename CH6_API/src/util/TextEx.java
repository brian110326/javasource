package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class TextEx {

  public static void main(String[] args) {
    Set<Member> set3 = new HashSet<>();

    Member member = new Member();
    member.setId("Lee123");
    member.setName("Brian");

    set3.add(member);

    member = new Member();
    member.setId("Lee123");
    member.setName("Brian");

    set3.add(member);

    for (Member m : set3) {
      System.out.println(m);
    }
  }
}
