package loop;

public class BreakEx2 {

  public static void main(String[] args) {
    int dice = (int) (Math.random() * 6);
    while (true) {
      // 주사위 굴려서 6일때만 반복문 종료

      if (dice == 6) {
        System.out.println("6이 나왔습니다");
        break;
      }
      System.out.println(dice);
    }
    System.out.println("종료");
  }
}
