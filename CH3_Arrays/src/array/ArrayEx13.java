package array;

import java.util.Arrays;

public class ArrayEx13 {

  public static void main(String[] args) {
    // 2차원 배열
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
        sum += arr[i][j];
      }
      System.out.println();
    }
    System.out.println(sum);
  }
}
