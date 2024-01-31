package operator;

public class Area {

  public static void main(String[] args) {
    //사다리꼴 넓이 구한 후 출력
    int downBase = 5;
    int upBase = 4;
    int height = 3;
    double area = (downBase + upBase) * height / 2.0;

    System.out.printf("사다리꼴 넓이 : %.2f\n", area);
  }
}
