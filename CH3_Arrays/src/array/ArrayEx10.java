package array;

import java.util.Arrays;

// 알고리즘 ==> 정렬(선택정렬, 버블정렬)

public class ArrayEx10 {

  public static void main(String[] args) {
    int[] arr = { 2, 5, 8, 1, 9, 23, 66, 57, 88, 345, 68 };

    // java가 제공하는 sort
    // Arrays.sort(arr);

    // for (int i : arr) {
    //   System.out.println(i);
    // }
    System.out.println(Arrays.toString(arr));

    int temp = arr[0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
