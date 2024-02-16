package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 컬렉션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계
// Collection
// List(Colleciton interfae 상속받은 interface)
// Set(Colleciton interfae 상속받은 interface)
// Map

// List : 순서가 있는 데이터의 집합(데이터의 중복 허용)
// 구현 클래스 : ArrayList, LinkedList, Stack, Vector...
// 배열 : 고정크기 ==> 크기 변경 시 다른 배열 생성 후 옮겨야 함
// List 고정크기 ==> 크기 변경이 필요하다면 내부적으로 알아서 처리해줌

public class ArrayListEx {

  public static void main(String[] args) {
    // initial capacity : 10
    //List<Integer> list = new ArrayList<>(20);
    ArrayList<Integer> list = new ArrayList<>(20);
    list.add(66);
    list.add(88);
    list.add(62);
    list.add(94);
    list.add(26);
    list.add(56);

    // toString() Override 여부
    System.out.println(list);

    list.sort(Comparator.reverseOrder()); //내림차순
    //list.sort(Comparator.naturalOrder()); 오름차순
    System.out.println(list);

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("a");
    list2.add("b");
    list2.add("c");
    list2.add("d");
    list2.add("e");
    list2.add("f");

    // 메소드

    // arr.length()
    System.out.println("size() " + list2.size()); //ArrayList에 저장된 객체 개수
    // arr[3]
    System.out.println("get() " + list2.get(3)); //지정된 위치에 있는 객체를 반환
    System.out.println("indexOf() " + list2.indexOf("f")); //지정된 객체가 저장된 위치 반환
    System.out.println("indexOf() " + list2.indexOf("898989"));
    System.out.println("remove() " + list2.remove("d")); //지정된 객체 제거 : true / false 반환
    System.out.println(list2);
    System.out.println(list2.remove(2)); //실제 제거된 객체 반환
    System.out.println(list2);

    // ArrayList ==> 배열로 변환
    Object[] arr = list2.toArray();
    for (Object obj : arr) {
      System.out.println(obj);
    }

    // 배열 ==> ArrayList 변환
    // Arrays 이용
    int[] arr2 = { 3, 5, 6, 7, 9 };
    List<int[]> list3 = Arrays.asList(arr2);

    System.out.println("isEmpty() " + list2.isEmpty()); //ArrayList가 비어있는지 확인
    list2.set(1, "Oracle"); //특정 위치에 중간 삽입
    System.out.println(list2);
  }
}
