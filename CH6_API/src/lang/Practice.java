package lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Practice {

  public static void main(String[] args) {
    ArrayList<Double> list2 = new ArrayList<>(10);

    for (int i = 0; i < 10; i++) {
      list2.add(Math.random() * 10);
    }

    System.out.println(list2.size());
    System.out.println(list2.get(3));

    int arr[] = { 1, 2, 3, 4, 5 };
    List<int[]> list3 = Arrays.asList(arr);
  }
}
