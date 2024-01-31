package exam;

public class Pencil {

  public static void main(String[] args) {
    // 534자루의 연필을 30명의 학생들에게 똑같은 개수로
    // 나눌 때 학상 한명 당 몇개를 가질수 있고, 최종적으로 몇개가 남는지 출력하기
    int pencil = 534;
    int student = 30;
    int gain = pencil / student;
    int rest = pencil % student;

    System.out.printf("학생 1명 당 가지는 연필 수 : %d개\n", gain);
    System.out.printf("나머지 연필 수 : %d개\n", rest);
  }
}
