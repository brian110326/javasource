package array;

import java.util.Arrays;

public class ArrayEx3 {

  public static void main(String[] args) {
    // int score[] = new int[5];
    // score[0] = 98;
    // score[1] = 96;
    // score[2] = 88;
    // score[3] = 84;
    // score[4] = 100;

    // 배열의 초기값이 정해진 경우
    int score[] = new int[] { 1, 2, 3, 4, 5 };
    int score1[] = { 1, 2, 3, 4, 5 };
    //배열 사이즈 변경 ==> 불가능 : 처음에 생성된 크기 변경 X
    // 방법 : 더 큰 배열을 생성 ==> 기존 배열을 새로운 배열에 복사하기
    int new_size = 10;
    int[] newArray = Arrays.copyOf(score1, new_size);
    System.out.println(newArray.length);

    int arr[][] = { { 7, 8 }, { 2, 4 } };

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }

    for (int[] i : arr) {
      for (int j : i) {
        System.out.print(j + "\t");
      }
      System.out.println();
    }
  }
}
