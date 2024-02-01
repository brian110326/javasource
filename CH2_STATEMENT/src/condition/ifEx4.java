package condition;

import java.util.Scanner;

public class ifEx4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("점수 입력 : ");
    int score = sc.nextInt();

    char grade = ' ';

    if (score >= 90) {
      //System.out.println("등급은 A");
      grade = 'A';
    } else if (score >= 80) {
      //System.out.println("등급은 B");
      grade = 'B';
    } else if (score >= 70) {
      //System.out.println("등급은 C");
      grade = 'C';
    } else if (score >= 60) {
      //System.out.println("등급은 D");
      grade = 'D';
    } else {
      //System.out.println("등급은 F");
      grade = 'F';
    }

    System.out.println("등급 : " + grade + "입니다.");
  }
}
