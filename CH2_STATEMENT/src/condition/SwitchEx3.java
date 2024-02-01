package condition;

import java.util.Scanner;

public class SwitchEx3 {

  public static void main(String[] args) {
    // 가위 : 1, 바위 : 2, 보 : 3
    // 컴퓨터의 숫자 결정
    // comp - num으로
    // 1-2 1-3 2-1 2-3 3-1 3-2
    int comp = (int) (Math.random() * 3 + 1);
    // 사용자의 숫자 결정
    Scanner sc = new Scanner(System.in);
    System.out.println("가위(1) 바위(2) 보(3) 중 하나 입력 ==> ");
    int num = sc.nextInt();

    switch (num) {
      case 1:
        if (comp == 2) {
          System.out.printf("COMP가 낸 숫자 : %d LOSE\n", comp);
        } else if (comp == 3) {
          System.out.printf("COMP가 낸 숫자 : %d WIN\n", comp);
        } else {
          System.out.printf("COMP가 낸 숫자 : %d DRAW\n", comp);
        }
        break;
      case 2:
        if (comp == 1) {
          System.out.printf("COMP가 낸 숫자 : %d WIN\n", comp);
        } else if (comp == 3) {
          System.out.printf("COMP가 낸 숫자 : %d LOSE\n", comp);
        } else {
          System.out.printf("COMP가 낸 숫자 : %d DRAW\n", comp);
        }
        break;
      case 3:
        if (comp == 1) {
          System.out.printf("COMP가 낸 숫자 : %d LOSE\n", comp);
        } else if (comp == 2) {
          System.out.printf("COMP가 낸 숫자 : %d WIN\n", comp);
        } else {
          System.out.printf("COMP가 낸 숫자 : %d DRAW\n", comp);
        }
        break;
      default:
        System.out.println("1~3 숫자 입력");
        break;
    }
  }
}
