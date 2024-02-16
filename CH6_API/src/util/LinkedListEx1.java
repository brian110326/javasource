package util;

import java.util.LinkedList;
import java.util.List;

// java.util.List
// 1. ArrayList
// 2. LinkedList(연결리스트) : 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸리는 부분을 보완
public class LinkedListEx1 {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("apple");
    list.add("grape");
    list.add("peach");
    list.add("melon");
    list.add("strawberry");
    list.add("mango");

    for (String s : list) {
      System.out.println(s);
    }
  }
}
