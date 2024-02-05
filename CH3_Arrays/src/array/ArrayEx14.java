package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {

  public static void main(String[] args) {
    // 1차원 배열 => 사용자 입력 값으로 배열 초기화

    int arr[] = new int[5];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d번째 값 입력 : \n", i + 1);
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("배열 요소 값 : " + Arrays.toString(arr));

    int arr2[][] = new int[2][3];

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.printf("%d행 %d열 값 입력 : \n", i + 1, j + 1);
        int num2 = sc.nextInt();
        arr2[i][j] = num2;
      }
    }

    for (int[] k : arr2) {
      for (int num : k) {
        System.out.println(num + "\t");
      }
      System.out.println();
    }
  }
}
