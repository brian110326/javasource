package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

// 컬렉션 프레임워크의 함수형 인터페이스를 매개변수로 사용하는 메소드 존재

public class LambdaEx4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    // list 값을 사용
    // for문, Enhanced for문
    // forEach(Consumer<? super T> action)
    list.forEach(i -> System.out.println(i));

    // list에서 2또는 3의 배수를 제거
    // removeIf(Predicate<? super E> filter)
    // list.forEach(i -> {
    //   if (i % 2 == 0 || i % 3 == 0) {
    //     list.remove(i);
    //   }
    // });

    // for (Integer i : list) {
    //   if (i % 2 == 0 || i % 3 == 0) {
    //     list.remove(i);
    //   }
    // }

    list.removeIf(i -> (i % 2 == 0) || (i % 3 == 0));

    // list의 각 요소에 10을 곱한다
    list.replaceAll(i -> i * 10);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    // map의 모든 요소를 {key, value} 형태로 출력
    map.forEach((k, v) -> System.out.printf("{%s, %s}\n", k, v));
  }
}
