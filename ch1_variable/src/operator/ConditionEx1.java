package operator;

public class ConditionEx1 {

  public static void main(String[] args) {
    // x가 y보다 크면 x값을 변수에 담고 , 아니라면 y값을 담기
    int x = 5, y = 3;
    int reuslt = (x > y) ? x : y;
    System.out.println("result : " + reuslt);

    // 점수가 90이상이면 A, 그외에는 F
    int score = 80;
    char reuslt1 = (score >= 90 ? 'A' : 'F');
    System.out.println(reuslt1);

    // 점수가 90이상이면 A, 80 이상이면 B, 그담에는 F
    if (score >= 90) {
      System.out.println('A');
    } else if (score >= 80) {
      System.out.println('B');
    } else {
      System.out.println('F');
    }
    // System.out.println((score >= 90 ? 'A' : (score >= 80 ? 'B' : 'F')));
  }
}
