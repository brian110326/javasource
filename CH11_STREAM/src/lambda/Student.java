package lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@NoArgsConstructor
public class Student {

  private String name;
  private int math;
  private int kor;
}
