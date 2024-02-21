package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TextEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };
    int[] arr2 = new int[6];
    Arrays.fill(arr2, 8);
    System.out.println(Arrays.toString(arr2));

    System.out.println(Arrays.equals(arr, arr2));

    // Arrays.asList(배열) : 배열을 List구조로 변경
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> list2 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    list2.add(77);
    System.out.println(list2);
    Arrays.sort(arr);
    System.out.println(Arrays.binarySearch(arr, 3));

    Integer[] arr3 = { 2, 5, 25, 46, 77, 356 };
    Arrays.sort(arr3, Comparator.reverseOrder());
  }
}
