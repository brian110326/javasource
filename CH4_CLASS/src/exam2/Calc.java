package exam2;

public abstract class Calc {

  private int a, b;

  void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public abstract int calculate();
}
