package exam;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("월급 입력 : ");
    int salary = sc.nextInt();

    // 10년 저축 금액 출력

    int sal10year = salary * 12 * 10;
    System.out.printf("10년동안 저축한 금액 : %d원\n", sal10year);
  }
}
