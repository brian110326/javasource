package ch4;

public class Numbers {

  private int num[];

  public Numbers(int[] num) {
    this.num = num;
  }

  public int getTotal() {
    int sum = 0;
    for (int i : num) {
      sum += i;
    }
    return sum;
  }

  public double getAverage() {
    double avg = 0;
    avg = (double) getTotal() / num.length;
    return avg;
  }
}
