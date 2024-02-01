package condition;

import java.util.Scanner;

public class ifEx7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("월 입력 : ");
    int month = sc.nextInt();

    if (month == 3 || month == 4 || month == 5) {
      System.out.println("Spring");
    } else if (month == 6 || month == 7 || month == 8) {
      System.out.println("Summer");
    } else if (month == 9 || month == 10 || month == 11) {
      System.out.println("Fall");
    } else {
      System.out.println("Winter");
    }
  }
}
