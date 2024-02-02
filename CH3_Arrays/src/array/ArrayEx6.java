package array;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10명의 점수
    int[] score = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    // 최고점수를 받은 점수 출력
    int max = score[0];

    for (int i = 1; i < score.length; i++) {
      if (max < score[i]) {
        max = score[i];
      }
    }

    int min = score[0];
    for (int i = 1; i < score.length; i++) {
      if (min > score[i]) {
        min = score[i];
      }
    }

    int sum = 0;
    double avg = 0;
    for (int i = 0; i < score.length; i++) {
      sum += score[i];
    }
    avg = (double) sum / score.length;

    System.out.println("최대점수 : " + max);
    System.out.println("최저점수 : " + min);
    System.out.println("총점수 : " + sum);
    System.out.println("평균점수 : " + avg);
  }
}
