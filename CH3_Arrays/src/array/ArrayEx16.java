package array;

public class ArrayEx16 {

  public static void main(String[] args) {
    // 크기고정 배열
    int[][] score = new int[5][3];

    // 가변배열
    int[][] score2 = new int[3][];
    score2[0] = new int[3]; // ==> 0번째 행이 3칸으로 이루어져있는 형태
    score2[1] = new int[4];
    score2[2] = new int[5];

    int[][] score3 = {
      { 100, 100, 98 },
      { 88, 78, 68, 58 },
      { 40, 50 },
      { 44 },
    };
  }
}
