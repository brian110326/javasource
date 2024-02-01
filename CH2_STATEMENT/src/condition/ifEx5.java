package condition;

import java.util.Scanner;

public class ifEx5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("점수 입력 : ");
    int score = sc.nextInt();
    // 당신의 점수는 100입니다.
    // 당신의 학점은 A+입니다.
    // 90이상 94미만이면 A-, 98이상이면 A+

    char grade = ' ';
    char opt = '0';
    if (score >= 90) {
      grade = 'A';
      if (score >= 98) {
        opt = '+';
      } else if (score < 94) {
        opt = '-';
      }
    } else if (score >= 80) {
      grade = 'B';
      if (score >= 88) {
        opt = '+';
      } else if (score < 84) {
        opt = '-';
      }
    } else {
      grade = 'C';
    }

    System.out.printf("점수는 %d이며 학점은 %c%c입니다.\n", score, grade, opt);
  }
}
