package condition;

import java.util.Scanner;

public class SwitchEx2 {

  public static void main(String[] args) {
    // 월 입력 현재 계절 출력
    Scanner sc = new Scanner(System.in);
    System.out.println("월 입력 : ");
    int month = sc.nextInt();

    // break 만나면 switch블럭 탈출
    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.println("Spring");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Summer");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Fall");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("Winter");
        break;
      default:
        System.out.println("1~12숫자 입력");
        break;
    }
  }
}
