package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    // 년도를 입력 받고 윤년 평년 판별하기
    // 윤년 : 해당 년도를 4로 나눈 나머지가 0과 같고, 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0
    Scanner sc = new Scanner(System.in);
    System.out.println("년도 입력 : ");
    int year = sc.nextInt();

    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("해당 년도는 윤년입니다");
    } else {
      System.out.println("해당 년도는 평년입니다");
    }
  }
}
