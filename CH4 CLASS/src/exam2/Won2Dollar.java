package exam2;

import java.util.Scanner;

public class Won2Dollar extends Converter {

  double ratio = 0.000833;
  Scanner sc = new Scanner(System.in);

  @Override
  protected double convert(double src) {
    double res;
    res = ratio * src;
    return res;
  }

  @Override
  protected String getSrcString() {
    return "원";
  }

  @Override
  protected String getDestString() {
    return "달러";
  }
}
