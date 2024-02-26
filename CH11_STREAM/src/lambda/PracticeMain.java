package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeMain {

  public static void main(String[] args) {
    IntStream intStream2 = IntStream.of(25, 35, 34, 77, 252, 454);
    intStream2
      .filter(i -> i % 2 == 0 || i % 3 == 0)
      .forEach(i -> System.out.println(i));
  }
}
