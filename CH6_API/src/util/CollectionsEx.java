package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections : 클래스
// 기능 : 컬렉션(List, Set, Map 공통적용)과 관련된 메소드를 제공
// static 요소들로만 구성
// 동기화, fill(), copy(), sort(), binarySearch() 등 유용한 메소드를 제공

// Collection : 인터페이스

public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    //list.sort(Comparator.reverseOrder());

    // 오른쪽으로 2칸씩 이동
    Collections.rotate(list, 2);
    System.out.println(list);

    Collections.swap(list, 0, 2);
    System.out.println(list);

    //Collections.sort(list, Collections.reverseOrder());
    Collections.sort(list, Comparator.naturalOrder());
    System.out.println(list);

    // binarySearch() : Collections.reverseOrder() 때문에 ==> 오름차순 정렬로 해야함
    System.out.println("저장된 위치 : " + Collections.binarySearch(list, 5));

    // list를 한가지의 값으로 채움
    Collections.fill(list, 9);
    System.out.println(list);
  }
}
