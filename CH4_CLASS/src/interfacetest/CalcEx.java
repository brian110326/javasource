package interfacetest;

public class CalcEx {

  public static void main(String[] args) {
    // 참조 변수가 사용할 수 있는 범위가 제한
    CompleteCalc calc = new CompleteCalc();

    Calculator calc2 = new CompleteCalc();

    Calc calc3 = new CompleteCalc();
  }
}
