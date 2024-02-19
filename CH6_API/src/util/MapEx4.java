package util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 95);
    map.put("김길동", 92);
    map.put("박길동", 88);
    map.put("이길동", 69);
    map.put("장길동", 72);

    // 이름과 점수 출력하기

    // 1) key만 set구조로 변경해서 접근하기
    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();
    // NoSuchElementException : 런타임 예외
    while (iterator.hasNext()) {
      String key = iterator.next();
      int score = map.get(key);
      System.out.println(key + " : " + score);
    }

    System.out.println("명단 : " + set);

    // 점수 전체 가져오기, 총점, 평균구하기
    Collection<Integer> values = map.values();
    Iterator<Integer> iterator2 = values.iterator();

    int total = 0;
    while (iterator2.hasNext()) {
      total += iterator2.next();
    }
    System.out.println("총점 : " + total);
    System.out.println("평균 : " + (double) total / map.size());

    System.out.println("최고점수 : " + Collections.max(values));
    System.out.println("최저점수 : " + Collections.min(values));
  }
}
