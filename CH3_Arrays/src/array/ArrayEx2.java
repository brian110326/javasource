package array;

public class ArrayEx2 {

  public static void main(String[] args) {
    int score[] = new int[5]; //길이가 5인 int형 배열 생성
    // 초기값을 변경
    score[0] = 98;
    score[1] = 96;
    score[2] = 88;
    score[3] = 84;
    score[4] = 100;

    // 배열 값 확인
    for (int n : score) {
      System.out.println(n);
    }

    System.out.println();

    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }
  }
}
