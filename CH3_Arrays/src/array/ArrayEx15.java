package array;

public class ArrayEx15 {

  public static void main(String[] args) {
    int score[][] = {
      { 100, 97, 98 },
      { 70, 80, 90 },
      { 59, 79, 80 },
      { 88, 99, 100 },
      { 79, 60, 88 },
    };

    int sum = 0;
    int kor_sum = 0;
    int eng_sum = 0;
    int math_sum = 0;
    double avg = 0;

    // kor_sum = score[i][0];
    //     eng_sum = score[i][1];
    //     math_sum = score[i][2];
    for (int i = 0; i < score.length; i++) {
      kor_sum += score[i][0];
      eng_sum += score[i][1];
      math_sum += score[i][2];
      for (int j = 0; j < score[i].length; j++) {
        sum += score[i][j];
      }
      avg = (double) sum / score[i].length;
    }

    System.out.println("국어점수 총합 : " + kor_sum);
    System.out.println("영어점수 총합 : " + eng_sum);
    System.out.println("수학점수 총합 : " + math_sum);
  }
}
