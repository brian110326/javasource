package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    //  a b c d 배열
    char[] arr = { 'a', 'b', 'c', 'd' };
    System.out.println(arr);
    for (char c : arr) {
      System.out.println(c);
    }

    int intArr[] = { 6, 3, 7, 8, 2, 9 };
    Arrays.sort(intArr);
    for (int n : intArr) {
      System.out.println(n);
    }
    System.out.println(Arrays.toString(intArr));

    String strArr[] = { "abc", "def", "ghi" };
    System.out.println(Arrays.toString(strArr));

    int newLength = 10;
    int new_intArr[] = Arrays.copyOf(intArr, newLength);
  }
}
