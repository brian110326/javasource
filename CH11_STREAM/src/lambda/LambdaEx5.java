package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaEx5 {

  private static List<Student> list = Arrays.asList(
    new Student("A", 98, 95),
    new Student("B", 100, 68)
    // Arrays.asList() : 배열을 List로 변환
    // Integer[] arr = { 1, 2, 3, 4, 5 };
    // List<Integer> list2 = Arrays.asList(arr);
    // list2 = Arrays.asList(5, 6, 7, 8, 9);

    // list.add(new Student("A", 98, 95));
    // list.add(new Student("B", 100, 68));
  );

  public static void main(String[] args) {
    // 학생 이름 출력하기
    // list.forEach(stu -> System.out.println(stu.getName()));
    // 수학 점수 출력
    // list.forEach(stu -> System.out.println(stu.getMath()));
    // 영어 점수 출력
    // list.forEach(stu -> System.out.println(stu.getKor()));

    System.out.println("=====[학생이름]=====");

    // Function<Student, String> function = stu -> stu.getName();
    // System.out.println(function.apply(list.get(0)));
    // System.out.println(function.apply(list.get(1)));
    printString(stu -> stu.getName());

    System.out.println("=====[국어점수]=====");
    printInt(stu -> stu.getKor());

    System.out.println("=====[수학점수]=====");
    printInt(stu -> stu.getMath());
  }

  static void printString(Function<Student, String> function) {
    for (Student student : list) {
      System.out.println(function.apply(student));
    }
  }

  static void printInt(ToIntFunction<Student> function) {
    for (Student student : list) {
      System.out.println(function.applyAsInt(student));
    }
  }
}
