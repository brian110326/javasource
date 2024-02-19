package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map
// key, value를 하나의 쌍으로 묶어서 저장
// key는 중복불가, value는 중복 가능
// 내부 인터페이스 Map.Entry

// 구현클래스 : Hashtable, HashMap, TreeMap...
public class MapEx1 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    // 요소추가 : put
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    System.out.println(
      "key에 해당하는 value 가져오기 get() " + map.get("id_0123")
    );
    System.out.println(
      "key 존재여부 containsKey() " + map.containsKey("id_0124")
    );
    System.out.println(
      "value 존재여부 containsValue() " + map.containsValue("현빈")
    );
    System.out.println("map 요소 크기 size() " + map.size());
    System.out.println("map 요소 삭제 remove() " + map.remove("id_0126"));

    // key 값 모두 가져오기 : keySet() ==> key값은 중복X : Set구조
    Set<String> keys = map.keySet();
    System.out.println(keys);

    // value 값 모두 가져오기 : values() ==> Collection 인터페이스로 돌려줌
    Collection<String> values = map.values();
    System.out.println(values);
  }
}
