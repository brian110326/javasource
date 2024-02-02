package exam;

public class DiceSum {

  public static void main(String[] args) {
    // 주사위를 2개 굴려 나오는 숫자들 순서쌍으로 표현
    // 주사위 2개의 합이 5일때 멈춤

    while (true) {
      int dice1 = (int) (Math.random() * 6);
      int dice2 = (int) (Math.random() * 6);

      if (dice1 + dice2 == 5) {
        System.out.printf("(dice1, dice2) ==> (%d, %d)\n", dice1, dice2);
        break;
      }
      System.out.printf("(dice1, dice2) ==> (%d, %d)\n", dice1, dice2);
    }
  }
}
