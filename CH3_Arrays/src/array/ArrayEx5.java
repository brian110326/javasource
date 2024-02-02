package array;

import java.util.Arrays;

public class ArrayEx5 {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int tmp[] = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      tmp[i] = arr[i];
    }

    int tmp2[] = new int[arr.length * 2];

    System.arraycopy(arr, 0, tmp2, 0, arr.length);
    System.out.println(tmp2.length);
  }
}
