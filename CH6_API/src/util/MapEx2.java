package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234"); //key값이 중복된다면 나중에 나오는 value값이 저장됨

    Set<String> keys = map.keySet();
    System.out.println(keys);

    Collection<String> values = map.values();
    System.out.println(values);

    Scanner sc = new Scanner(System.in);

    // 아이디와 비밀번호를 입력받아서 존재여부 확인
    while (true) {
      System.out.println("Id : ");
      String id = sc.nextLine().trim();
      System.out.println("Pw : ");
      String pwd = sc.nextLine().trim();

      //  키값 중 아이디와 일치하는지 확인
      if (!map.containsKey(id)) {
        System.out.println("Id 일치 X");
        continue;
      } else {
        // 일치하면 비밀번호가 확인하는지 확인
        if (!map.get(id).equals(pwd)) {
          System.out.println("비밀번호 일치 X");
          continue;
        } else {
          System.out.println(id);
          System.out.println(pwd);
          break;
        }
      }
    }
  }
}
