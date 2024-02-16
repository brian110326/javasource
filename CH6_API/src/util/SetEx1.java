package util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// java.util.Set : 중복 허용 X , 저장 순서가 유지 X
// HashSet, TreeSet
public class SetEx1 {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    set.add(50); //중복값은 알아서 넣지를 않음

    System.out.println(set);

    System.out.println(set.size());
    System.out.println(set.isEmpty());
    System.out.println(set.remove(30));
    System.out.println(set);

    // 배열 전환
    Object[] arr = set.toArray();
    System.out.println(Arrays.toString(arr));
  }
}
