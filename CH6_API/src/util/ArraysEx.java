package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Arrays : 배열을 다루는데 유용한 메소드가 정의되어있음
// static 요소로만 구성되어 있음

public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9);
    System.out.println(Arrays.toString(arr2));

    System.out.println("배열 요소비교 : " + Arrays.equals(arr, arr2));

    // Arrays.asList(배열) : 배열을 List구조로 변경
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });

    List<Integer> list2 = Arrays.asList(6, 7, 8, 9);

    // UnsupportedOperationException : 반환된 List 크기를 변경할 수 없기 때문
    //list.add(6);

    // UnsupportedOperationException 해결방법
    // 기존 배열 + 새로추가
    List<Integer> list3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    list3.add(6);

    // sort : 오름차순 정렬
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // linear search : 순차검색(첫번째 요소부터 하나씩 검색 / 정렬상관없음)
    // binarySearch() : 이진검색(정렬(오름차순)된 상태여야 함), 못찾으면 음수로 결과 반환
    System.out.println("2의 위치 : " + Arrays.binarySearch(arr, 2));

    // 내림차순 정렬
    // T[] : 배열이 객체타입
    // Map<K,V> : K, V ==> 객체타입
    // E ==> 객체타입
    // Collection<E> ==> 객체타입
    // int ==> 객체타입으로 Integer
    Integer arr3[] = { 2, 5, 25, 46, 77, 356 };
    Arrays.sort(arr3, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr3));

    String[] strArr = { "cat", "Dog", "lion", "tiger", "apple", "zoo" };
    // 소문자 대문자 중에서는 정렬하면 대문자가 먼저나옴
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(strArr));
  }
}
