package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Iterator, Enumeration : 인터페이스
// 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스

public class IteratorEx {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    // list 안에 요소 접근
    for (int i = 0; i < list.size(); i++) {
      String item = list.get(i);
      //System.out.println(item);
    }

    for (String item : list) {
      //System.out.println(item);
    }

    Set<String> set = new HashSet<>();
    // set 안에 요소 접근
    for (int i = 0; i < set.size(); i++) {
      // 순서의 개념이 없는 set에서는 get() 메소드 사용불가
      //String item = set.get(i);
    }

    for (String item : set) {
      //System.out.println(item);
    }
    // Map : get(key값) ==> for i문 사용 불가

    // Data를 담는 형태에 따라 요소에 접근하는 방법이 다르다
    // 컬렉션 요소를 읽어오는 방법을 표준화 ==> Iterator

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
