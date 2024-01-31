package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨온도 => 섭씨온도
    Scanner sc = new Scanner(System.in);
    System.out.println("화씨온도 입력 : ");
    int fDegree = sc.nextInt();

    double dDegree = (fDegree - 32) * 5 / 9.0;
    System.out.println("화씨온도 : " + fDegree);
    System.out.println("섭씨온도 : " + dDegree);
  }
}
