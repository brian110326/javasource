package exam;

public class CalcEx {

  public static void main(String[] args) {
    Calc c = new Calc();
    System.out.println(c.add(9, 6));
    System.out.println(c.substract(9, 6));
    System.out.println(c.multiply(9, 6));

    double divresult = c.division(9, 6);
    System.out.println(divresult);
  }
}
